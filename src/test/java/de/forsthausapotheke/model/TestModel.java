package de.forsthausapotheke.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HSoleymani on 23.02.14.
 */
public class TestModel {

    @Test
    public void createKunde() {
        Kunde k = makeKunde();
        List<Adresse> adressen = makeAdressen(k);
      //  k.setAdressen(adressen);


    }

    private Kunde makeKunde() {
        Kunde k = new Kunde("altId123", "Hamid", "Soleymani");
        return k;
    }

    private List<Adresse> makeAdressen(Kunde k) {
        List<Adresse> adressen = new ArrayList<Adresse>();
        Adresse adresse = new Adresse();
        adresse.setLand("Deutschland");
        adresse.setBundesland("Hessen");
        adresse.setStadt("Frankfurt am Main");
        adresse.setStrasse("Egelsbacher Str.");
        adresse.setHausNr("13");
        adresse.setPlz("60528");
        adressen.add(adresse);
        return adressen;
    }
}

