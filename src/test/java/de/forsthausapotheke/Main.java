package de.forsthausapotheke;

import de.forsthausapotheke.model.Kunde;
import de.forsthausapotheke.service.KundenService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HSoleymani on 23.02.14.
 */


public class Main {
    public static void main(String[] args)
    {
        //Build application context by reading spring-config.xml
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring-config.xml"});

        //Get an instance of ProductService class;
        KundenService kundenService = (KundenService) ctx.getBean("kundenService");

        //Call getProduct method of ProductService
        kundenService.createKunde(new Kunde("2","h","soleymani"));
    }
}
