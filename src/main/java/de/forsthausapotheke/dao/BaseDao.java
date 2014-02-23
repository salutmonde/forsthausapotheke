package de.forsthausapotheke.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 * Created by HSoleymani on 23.02.14.
 */
public class BaseDao {

    /*
    protected EntityManager em = null;
    @PersistenceUnit(name = "persistenceUnitName")
    */
    @Autowired
    protected SessionFactory sessionFactory;

//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }

    protected Session getSession() {
        return sessionFactory.openSession();
    }
       /*
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
    */
}
