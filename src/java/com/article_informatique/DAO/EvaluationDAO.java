package com.article_informatique.DAO;

import com.article_informatique.Model.Evaluation;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EvaluationDAO {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Model_ScientifiquePU");
    EntityManager manager = factory.createEntityManager();

    public List<Evaluation> allEvaluation() {
        Query query = manager.createQuery("SELECT c FROM com.article_informatique.Model.Evaluation c", Evaluation.class);
        List c = (List<Evaluation>) query.getResultList();
        return c;
    }

    public Evaluation getEvaluation(int idEvaluation) {
        return manager.find(Evaluation.class, idEvaluation);
    }

    public Evaluation updateEvaluation(int idEvaluation, Evaluation evaluation) {
        Evaluation c = getEvaluation(idEvaluation);
        if (c != null) {
            try {
                manager.getTransaction().begin();
                c.setDescription(evaluation.getDescription());
                c.setNote(evaluation.getNote());
                c.setEvaluer(evaluation.getEvaluer());
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

    public boolean deleteEvaluation(int idEvaluation) {
        Evaluation c = getEvaluation(idEvaluation);
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
