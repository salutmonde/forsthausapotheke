package de.forsthausapotheke.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by HSoleymani on 23.02.14.
 */
@Entity
public class ProduktBestandteil {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    private String name;
    private Double menge;
    private String kurzName;
    private String beschreibung;
    public void setName(String name) {
        this.name = name;
    }

    public ProduktBestandteil(){}

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

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + menge.hashCode();
        return result;
    }
}

