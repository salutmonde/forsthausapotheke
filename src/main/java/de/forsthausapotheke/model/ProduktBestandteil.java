package de.forsthausapotheke.model;

import javax.persistence.*;

/**
 * Created by HSoleymani on 23.02.14.
 */
@Entity
@Table(name = "produktBestandteil")
public class ProduktBestandteil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private Double menge;
    private String kurzName;
    private String beschreibung;
//    @ManyToOne
//    private Produkt produkt;
    public void setName(String name) {
        this.name = name;
    }


    public ProduktBestandteil(){}

    public ProduktBestandteil(String name, Double menge, String kurzName, String beschreibung) {
        this.name = name;
        this.menge = menge;
        this.kurzName = kurzName;
        this.beschreibung = beschreibung;
        //this.produkt = produkt;
    }

    public String getName() {
        return name;
    }

    public Double getMenge() {
        return menge;
    }

    public void setMenge(Double menge) {
        this.menge = menge;
    }

    public String getKurzName() {
        return kurzName;
    }

    public void setKurzName(String kurzName) {
        this.kurzName = kurzName;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProduktBestandteil that = (ProduktBestandteil) o;

        if (!menge.equals(that.menge)) return false;
        if (!name.trim().equalsIgnoreCase(that.name)) return false;

        return true;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

//    public Produkt getProdukt() {
//        return produkt;
//    }
//
//    public void setProdukt(Produkt produkt) {
//        this.produkt = produkt;
//    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + menge.hashCode();
        return result;
    }
}

