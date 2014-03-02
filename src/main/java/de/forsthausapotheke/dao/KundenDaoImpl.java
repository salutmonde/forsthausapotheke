package de.forsthausapotheke.dao;

import de.forsthausapotheke.model.Kunde;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by HSoleymani on 23.02.14.
 */
@Repository
public class KundenDaoImpl implements KundenDao {
    @PersistenceContext
    protected EntityManager em;

    @Override
    @Transactional
    public Kunde saveKunde(Kunde kunde) {
        System.out.print(kunde.getNachname());
        return em.merge(kunde);
    }

    @Override
    public Kunde updateKunde(Kunde kunde) {
        return null;
    }

    @Override
    public boolean deleteKunde(Kunde kunde) {
        return false;
    }

    @Override
    public Kunde findById(Long id) {
        return em.find(Kunde.class, id);
    }

    @Override
    public List<Kunde> findAllKunden() {
        Query q = em.createQuery("SELECT k FROM  Kunde k");
        return q.getResultList();
    }
}
