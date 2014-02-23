package de.forsthausapotheke.dao;

        import de.forsthausapotheke.model.Kunde;

/**
 * Created by HSoleymani on 23.02.14.
 */
public interface KundenDao {

    public Kunde saveKunde(Kunde kunde);
    public Kunde updateKunde(Kunde kunde);
    public boolean deleteKunde(Kunde kunde);
}
