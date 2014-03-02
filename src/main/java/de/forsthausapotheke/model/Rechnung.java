package de.forsthausapotheke.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HSoleymani on 23.02.14.
 */
@Entity
@Table(name = "rechnung")
public class Rechnung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    private Kunde kunde;
    private String rechnungsNr;
   // private Date erstellungsDatum;
    @OneToMany(mappedBy = "rechnung")
    private List<Produkt> produkte = new ArrayList<Produkt>();

    public Rechnung(Kunde kunde, String rechnungsNr) {
        this.kunde = kunde;
        this.rechnungsNr = rechnungsNr;
    }

    public Rechnung() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public String getRechnungsNr() {
        return rechnungsNr;
    }

    public void setRechnungsNr(String rechnungsNr) {
        this.rechnungsNr = rechnungsNr;
    }

//    public Date getErstellungsDatum() {
//        return erstellungsDatum;
//    }
//
//    public void setErstellungsDatum(Date erstellungsDatum) {
//        this.erstellungsDatum = erstellungsDatum;
//    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkt> produkte) {
        this.produkte = produkte;
    }

    public void add(Produkt p) {
              getProdukte().add(p);
    }
}
