package de.forsthausapotheke.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by HSoleymani on 23.02.14.
 */
@Entity
public class Produktpreis {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
  //  private Rechnung rechnung;
    private Double Menge;
    private Double nettoPreis;
    private Double bruttoPreis;
    private Double gesammtPreis;
    private Double mwst;

    public Produktpreis( ){}

//    public Rechnung getRechnung() {
//        return rechnung;
//    }
//
//    public void setRechnung(Rechnung rechnung) {
//        this.rechnung = rechnung;
//    }

    public Double getMenge() {
        return Menge;
    }

    public void setMenge(Double menge) {
        Menge = menge;
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
