package com.article_informatique.DAO;

import com.article_informatique.Model.Compte;
import com.article_informatique.Model.Diplome;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DiplomeDAO {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Model_ScientifiquePU");
    EntityManager manager = factory.createEntityManager();

    public List<Diplome> allDiplome() {
        Query query = manager.createQuery("SELECT c FROM com.article_informatique.Model.Diplome c", Diplome.class);
        List c = (List<Diplome>) query.getResultList();
        return c;
    }

    public boolean deleteDiplome(int idDiplome) {
        Diplome d = getDiplome(idDiplome);
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

    public Diplome getDiplome(int idDiplome) {
        return manager.find(Diplome.class, idDiplome);
    }

    public Diplome updateDiplome(int idDiplome, Diplome diplome) {
        Diplome d = getDiplome(idDiplome);
        if (d != null) {
            try {
                manager.getTransaction().begin();
                d.setEtablissement(diplome.getEtablissement());
                d.setObtention(diplome.getObtention());
                d.setTitre(diplome.getTitre());
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
