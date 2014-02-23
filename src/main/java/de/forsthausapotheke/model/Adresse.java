package de.forsthausapotheke.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
/**
 * Created by HSoleymani on 23.02.14.
 */

@Entity
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
   // private Kunde kunde;
    private String land;
    private String bundesland;
    private String stadt;
    private String Strasse;
    private String hausNr;
    private String plz;

    public Adresse(){}

//    public Adresse(Kunde newKunde) {
//        this.kunde = newKunde;
//    }
//
//    public Kunde getKunde() {
//        return kunde;
//    }
//
//    public void setKunde(Kunde kunde) {
//        this.kunde = kunde;
//    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getBundesland() {
        return bundesland;
    }

    public void setBundesland(String bundesland) {
        this.bundesland = bundesland;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public String getStrasse() {
        return Strasse;
    }

    public void setStrasse(String strasse) {
        Strasse = strasse;
    }

    public String getHausNr() {
        return hausNr;
    }

    public void setHausNr(String hausNr) {
        this.hausNr = hausNr;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        Adresse otherAddress = (Adresse) o;
        if (this.getPlz().trim().equals(otherAddress.getPlz())
                && this.getStrasse().trim().equalsIgnoreCase(otherAddress.getStrasse().trim())
                && this.getHausNr().trim().equalsIgnoreCase(otherAddress.getHausNr().trim())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = getPlz().hashCode() + getHausNr().hashCode();
        return hashCode;
    }
}
