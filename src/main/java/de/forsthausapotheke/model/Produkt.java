package de.forsthausapotheke.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import  javax.persistence.Id;
import java.util.List;

/**
 * Created by HSoleymani on 23.02.14.
 */
@Entity
public class Produkt {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String  Id;
    private String beschreibung;
    private String ettiket;
    private String Name;
//    private List<ProduktBestandteil> produktBestandteile;
//    private Produktpreis produktpreis;

    public Produkt() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getEttiket() {
        return ettiket;
    }

    public void setEttiket(String ettiket) {
        this.ettiket = ettiket;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

//    public List<ProduktBestandteil> getProduktBestandteile() {
//        return produktBestandteile;
//    }
//
//    public void setProduktBestandteile(List<ProduktBestandteil> produktBestandteile) {
//        this.produktBestandteile = produktBestandteile;
//    }
}
