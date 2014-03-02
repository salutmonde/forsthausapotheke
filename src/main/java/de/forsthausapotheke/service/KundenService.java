package de.forsthausapotheke.service;

import de.forsthausapotheke.model.Kunde;

import java.util.List;

/**
 * Created by HSoleymani on 23.02.14.
 */
public interface KundenService {

    public Kunde saveKunde(Kunde kunde);
    public Kunde updateKunde(Kunde kunde);
    public boolean deleteKunde(Kunde kunde);
    public Kunde findById(Long id);

    List<Kunde> findAllKunden();
}
