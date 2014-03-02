package de.forsthausapotheke;

import de.forsthausapotheke.model.*;
import de.forsthausapotheke.service.KundenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by HSoleymani on 23.02.14.
 */


@Component
public class Main {
    @Autowired
   // KundenService kundenService;
    public static void main(String[] args) {
      new Main().go();
    }
    public void go(){
        //Build application context by reading spring-config.xml
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        //Get an instance of ProductService class;
          KundenService kundenService = ctx.getBean(KundenService.class);

        //Call getProduct method of ProductService
        Kunde hamid = new Kunde("2", "h", "soleymani");
        Adresse egel = new Adresse(hamid,"DE","Hessen", "frankfurt","egelsbacher","13", "60528") ;

        Rechnung rech = new Rechnung(hamid,"FH-123");
        Produkt p = new Produkt("für kopfschmerzen", "aspering 75mg","", rech);
        ProduktBestandteil pbt1 = new ProduktBestandteil("azetü salu 1",1.0, "kurzname","keine bescreib");
        ProduktBestandteil pb2t = new ProduktBestandteil("azetü salu 2",2.0, "kurzname2","keine bescreib2");
        p.add(pbt1);
        p.add(pb2t);
        Produktpreis poris = new Produktpreis(3.0, 10.0);
        p.setProduktpreis(poris);
        rech.add(p);
        hamid.addRechnung(rech);
        hamid.addAdresse(egel);
        kundenService.saveKunde(hamid);
    }
}
