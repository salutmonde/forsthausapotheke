package de.forsthausapotheke.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HSoleymani on 23.02.14.
 */

@Entity
@Table(name = "kunde")
public class Kunde {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String altId;
    private String Vorname;
    private String Nachname;
    @OneToMany(mappedBy = "kunde")
    private List<Adresse> adressen= new ArrayList<Adresse>();
    @OneToMany(mappedBy = "kunde")
    private List<Rechnung> rechnungen = new ArrayList<Rechnung>();

    public Kunde() {
    }

    public Kunde(String altId, String vorname, String nachname) {
        this.altId = altId;
        Vorname = vorname;
        Nachname = nachname;
    }

    public String getAltId() {
        return altId;
    }

    public void setAltId(String altId) {
        this.altId = altId;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public List<Adresse> getAdressen() {
        return adressen;
    }

    public void setAdressen(List<Adresse> adressen) {
        this.adressen = adressen;
    }

    public List<Rechnung> getRechnungen() {
        return rechnungen;
    }

    public void setRechnungen(List<Rechnung> rechnungen) {
        this.rechnungen = rechnungen;
    }

    public boolean addAdresse(Adresse adresse) {
        if (getAdressen().contains(adresse)) {
            return false;
        } else {
            getAdressen().add(adresse);
            return true;
        }
    }

    public boolean removeAdresse(Adresse adresseToBeRemoved) {
        if (getAdressen().contains(adresseToBeRemoved)) {
            getAdressen().remove(adresseToBeRemoved);
            return true;
        }
        return false;
    }

    public String toString() {

        StringBuilder kunde = new StringBuilder();
        kunde.append(this.getAltId()).append("  ").append(this.getId()).append("  ").append(this.getVorname()).append("  ")
                .append(this.getNachname());
        return kunde.toString();
    }

    public void addRechnung(Rechnung rech) {
        getRechnungen().add(rech);
    }
}

