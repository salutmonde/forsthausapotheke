package de.forsthausapotheke.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/**
 * Created by HSoleymani on 23.02.14.
 */
@Entity
public class Rechnung {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;
   // private Kunde kunde;
    private String rechnungsNr;
    private Date erstellungsDatum;
   // private List<Produkt> produkte;

    public Rechnung(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    public Kunde getKunde() {
//        return kunde;
//    }
//
//    public void setKunde(Kunde kunde) {
//        this.kunde = kunde;
//    }

    public String getRechnungsNr() {
        return rechnungsNr;
    }

    public void setRechnungsNr(String rechnungsNr) {
        this.rechnungsNr = rechnungsNr;
    }

    public Date getErstellungsDatum() {
        return erstellungsDatum;
    }

    public void setErstellungsDatum(Date erstellungsDatum) {
        this.erstellungsDatum = erstellungsDatum;
    }

//    public List<Produkt> getProdukte() {
//        return produkte;
//    }
//
//    public void setProdukte(List<Produkt> produkte) {
//        this.produkte = produkte;
//    }
}
