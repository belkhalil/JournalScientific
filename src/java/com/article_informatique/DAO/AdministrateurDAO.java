package com.article_informatique.DAO;

import com.article_informatique.Model.Administrateur;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AdministrateurDAO {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Model_ScientifiquePU");
    EntityManager manager = factory.createEntityManager();

    public List<Administrateur> allAdministrateur() {
        Query query = manager.createQuery("SELECT c FROM com.article_informatique.Model.Administrateur c", Administrateur.class);
        List c = (List<Administrateur>) query.getResultList();
        return c;
    }

    public boolean deleteAdministrateur(int idAdministrateur) {
        Administrateur d = getAdministrateur(idAdministrateur);
        if (d != null) {
            try {
                manager.getTransaction().begin();
                manager.remove(d);
                manager.getTransaction().commit();
                return true;
            } catch (Exception e) {
                manager.getTransaction().rollback();
                return false;
            }
        }
        return false;
    }

    public Administrateur getAdministrateur(int idAdministrateur) {
        return manager.find(Administrateur.class, idAdministrateur);
    }

    public Administrateur updateAdministrateur(int idAdministrateur, Administrateur administrateur) {
        Administrateur d = getAdministrateur(idAdministrateur);
        if (d != null) {
            try {
                manager.getTransaction().begin();
                d.setDroit(administrateur.getDroit());
                manager.persist(d);
                manager.getTransaction().commit();
                return d;
            } catch (Exception e) {
                manager.getTransaction().rollback();
                return null;
            }
        }
        return null;
    }
}
