package de.forsthausapotheke.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 * Created by HSoleymani on 23.02.14.
 */
public class BaseDao {

    @PersistenceContext
    protected EntityManager em;

//    @PersistenceUnit(name = "hormone-invoice")
//    protected EntityManager em = null;

}
