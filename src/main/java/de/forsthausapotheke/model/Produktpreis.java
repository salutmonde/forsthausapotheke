package de.forsthausapotheke.model;

import javax.persistence.*;

/**
 * Created by HSoleymani on 23.02.14.
 */
@Entity
@Table(name = "produktpreis")
public class Produktpreis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    //    private Rechnung rechnung;
    private Double menge;
    private Double nettoPreis;
    private Double bruttoPreis;
    private Double gesammtPreis;
    private Double mwst;

    public Produktpreis() {
    }

    public Produktpreis(Double menge, Double nettoPreis) {
        this.menge = menge;
        this.nettoPreis = nettoPreis;
        calculatePrice();
    }

    private void calculatePrice() {
        bruttoPreis = nettoPreis * 1.19;
        gesammtPreis = bruttoPreis * menge;
    }
    //
//    public Rechnung getRechnung() {
//        return rechnung;
//    }
//
//    public void setRechnung(Rechnung rechnung) {
//        this.rechnung = rechnung;
//    }

    public Double getMenge() {
        return menge;
    }

    public void setMenge(Double menge) {
        menge = menge;
    }

    public Double getNettoPreis() {
        return nettoPreis;
    }

    public void setNettoPreis(Double nettoPreis) {
        this.nettoPreis = nettoPreis;
    }

    public Double getBruttoPreis() {
        return bruttoPreis;
    }

    public void setBruttoPreis(Double bruttoPreis) {
        this.bruttoPreis = bruttoPreis;
    }

    public Double getGesammtPreis() {
        return gesammtPreis;
    }

    public void setGesammtPreis(Double gesammtPreis) {
        this.gesammtPreis = gesammtPreis;
    }

    public Double getMwst() {
        return mwst;
    }

    public void setMwst(Double mwst) {
        this.mwst = mwst;
    }
}
