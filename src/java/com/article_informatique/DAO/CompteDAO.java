package com.article_informatique.DAO;

import com.article_informatique.Model.Compte;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CompteDAO {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Model_ScientifiquePU");
    EntityManager manager = factory.createEntityManager();

    public List<Compte> allCompte() {
        Query query = manager.createQuery("SELECT c FROM com.article_informatique.Model.Compte c", Compte.class);
        List c = (List<Compte>) query.getResultList();
        return c;
    }

    public Compte addCompte(Compte c) {
        try {
            manager.getTransaction().begin();
            manager.persist(c);
            manager.getTransaction().commit();
            return c;
        } catch (Exception e) {
            manager.getTransaction().rollback();
            return null;
        }
    }

    public boolean deleteCompte(int idCompte) {
        Compte c = getCompte(idCompte);
        if (c != null) {
            try {
                manager.getTransaction().begin();
                manager.remove(c);
                manager.getTransaction().commit();
                return true;
            } catch (Exception e) {
                manager.getTransaction().rollback();
                return false;
            }
        }
        return false;
    }

    public Compte getCompte(int idCompte) {
        return manager.find(Compte.class, idCompte);
    }

    public Compte updateCompte(int idCompte, Compte compte) {
        Compte c = getCompte(idCompte);
        if (c != null) {
            try {
                manager.getTransaction().begin();

                c.setLogin(compte.getLogin());
                c.setCreation(compte.getCreation());
                c.setMotPasse(compte.getMotPasse());
                c.setActive(compte.getActive());
                c.setValide(compte.getValide());
                c.setVisible(compte.getVisible());

                manager.persist(c);
                manager.getTransaction().commit();
                return c;
            } catch (Exception e) {
                manager.getTransaction().rollback();
                return null;
            }
        }
        return null;
    }

    public Compte accesToCompte(String email, String password) {
        Query query = manager.createQuery("SELECT c FROM com.article_informatique.Model.Compte c where c.email='" + email + "' and c.motPasse='" + password + "'", Compte.class);
        List c = (List<Compte>) query.getResultList();
        if (c.size() == 1) {
            return (Compte) c.get(0);
        } else {
            return null;
        }
    }

}
