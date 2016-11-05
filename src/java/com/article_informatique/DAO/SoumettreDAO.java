package com.article_informatique.DAO;

import com.article_informatique.Model.Soumettre;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SoumettreDAO {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Model_ScientifiquePU");
    EntityManager manager = factory.createEntityManager();

    public List<Soumettre> allSoumettre() {
        Query query = manager.createQuery("SELECT c FROM com.article_informatique.Model.Soumettre c", Soumettre.class);
        List c = (List<Soumettre>) query.getResultList();
        return c;
    }

    public Soumettre getSoumettre(int idSoumettre) {
        return manager.find(Soumettre.class, idSoumettre);
    }

    public Soumettre updateSoumettre(int idSoumettre, Soumettre soumettre) {
        Soumettre c = getSoumettre(idSoumettre);
        if (c != null) {
            try {
                manager.getTransaction().begin();
                c.setTypeAuteur(soumettre.getTypeAuteur());
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

    public boolean deleteSoumettre(int idSoumettre) {
        Soumettre c = getSoumettre(idSoumettre);
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
}
