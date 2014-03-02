package de.forsthausapotheke.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HSoleymani on 23.02.14.
 */
@Entity
@Table(name = "produkt")
public class Produkt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String beschreibung;
    private String ettiket;
    private String name;
    @OneToMany//(mappedBy = "produkt")
    private List<ProduktBestandteil> produktBestandteile = new ArrayList<ProduktBestandteil>();
    @OneToOne
    private Produktpreis produktpreis;
    @ManyToOne
    private Rechnung rechnung;

    public Produkt() {
    }

    public Produkt(String beschreibung, String ettiket, String name, Rechnung rechnung) {
        this.beschreibung = beschreibung;
        this.ettiket = ettiket;
        this.name = name;
       // this.produktBestandteile = produktBestandteile;
       // this.produktpreis = produktpreis;
        this.rechnung = rechnung;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
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
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public List<ProduktBestandteil> getProduktBestandteile() {
        return produktBestandteile;
    }

    public void setProduktBestandteile(List<ProduktBestandteil> produktBestandteile) {
        this.produktBestandteile = produktBestandteile;
    }

    public Produktpreis getProduktpreis() {
        return produktpreis;
    }

    public void setProduktpreis(Produktpreis produktpreis) {
        this.produktpreis = produktpreis;
    }

    public Rechnung getRechnung() {
        return rechnung;
    }

    public void setRechnung(Rechnung rechnung) {
        this.rechnung = rechnung;
    }

    public void add(ProduktBestandteil pbt1) {
        getProduktBestandteile().add(pbt1);
    }
}
