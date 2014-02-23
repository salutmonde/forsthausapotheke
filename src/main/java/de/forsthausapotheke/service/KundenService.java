package de.forsthausapotheke.service;

import de.forsthausapotheke.model.Kunde;

/**
 * Created by HSoleymani on 23.02.14.
 */
public interface KundenService {

    public Kunde createKunde(Kunde kunde);
    public Kunde updateKunde(Kunde kunde);
    public boolean deleteKunde(Kunde kunde);
}
