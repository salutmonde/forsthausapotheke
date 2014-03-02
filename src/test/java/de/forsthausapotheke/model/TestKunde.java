package de.forsthausapotheke.model;

import de.forsthausapotheke.service.KundenService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
//@Transactional
public class TestKunde {
//    private static final String PERSISTENCE_UNIT_NAME = "hormone-invoice";
//    @PersistenceContext
//    EntityManager em;
    @Autowired
    KundenService kundenService;
//    private EntityManagerFactory factory;

    // @Before
//    @Transactional(propagation = Propagation.REQUIRED)
    public void setUp() throws Exception {

    }

    @Test
    public void saveKunde() {
       // ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        //KundenService kundenService = ctx.getBean(KundenService.class);
        Kunde kunde = new Kunde("altId123", "Hamid", "So");
        kundenService.saveKunde(kunde);
        List<Kunde> kunden = kundenService.findAllKunden();
        // Kunde foundKunde=  kundenService.findById(kunde.getId());

        assertTrue(kunden.size() == 1);
    }

    @Test
    public void checkFamily() {
    }

    @Test(expected = javax.persistence.NoResultException.class)
    public void deletePerson() {
//        EntityManager em = factory.createEntityManager();
//        // Begin a new local transaction so that we can persist a new entity
//        em.getTransaction().begin();
//        Query q = em
//                .createQuery("SELECT p FROM Person p WHERE p.firstName = :firstName AND p.lastName = :lastName");
//        q.setParameter("firstName", "Jim_1");
//        q.setParameter("lastName", "Knopf_!");
//        Person user = (Person) q.getSingleResult();
//        em.remove(user);
//        em.getTransaction().commit();
//        Person person = (Person) q.getSingleResult();
//        // Begin a new local transaction so that we can persist a new entity
//
//        em.close();
    }
}