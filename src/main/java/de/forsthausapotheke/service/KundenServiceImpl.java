package de.forsthausapotheke.service;

import de.forsthausapotheke.dao.KundenDao;
import de.forsthausapotheke.model.Kunde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by HSoleymani on 23.02.14.
 */

@Service
public class KundenServiceImpl implements KundenService {

    @Autowired
    private KundenDao kundenDao;

//    @PersistenceContext
//    EntityManager em;

    @Override

    public Kunde saveKunde(Kunde kunde) {
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

    @Override
    public Kunde findById(Long id) {
        Kunde kunde = kundenDao.findById(id);
        return kunde;
    }

    @Override
    public List<Kunde> findAllKunden() {
      return   kundenDao.findAllKunden();
    }


}
