package de.forsthausapotheke.dao;

import de.forsthausapotheke.model.Kunde;
import org.springframework.stereotype.Repository;

/**
 * Created by HSoleymani on 23.02.14.
 */
@Repository("kundenDamoImpl")
public class KundenDaoImpl extends BaseDao implements KundenDao {

    @Override
    public Kunde saveKunde(Kunde kunde) {
        System.out.print(kunde.getNachname());
         getSession().save(kunde);
        //return em.merge(kunde);
        return  null;
    }

    @Override
    public Kunde updateKunde(Kunde kunde) {
        return null;
    }

    @Override
    public boolean deleteKunde(Kunde kunde) {
        return false;
    }
}
