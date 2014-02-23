package de.forsthausapotheke.service;

import de.forsthausapotheke.dao.KundenDao;
import de.forsthausapotheke.model.Kunde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HSoleymani on 23.02.14.
 */

@Service("kundenService")
public class KundenServiceImpl implements KundenService {

    @Autowired
    private KundenDao kundenDao;

    @Override
    public Kunde createKunde(Kunde kunde) {
        return kundenDao.saveKunde(kunde);
    }

    @Override
    public Kunde updateKunde(Kunde kunde) {
        return kundenDao.updateKunde(kunde);
    }

    @Override
    public boolean deleteKunde(Kunde kunde) {
        return kundenDao.deleteKunde(kunde);
    }


}
