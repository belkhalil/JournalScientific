package com.article_informatique.DAO;

import com.article_informatique.Model.Commentaire;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CommentaireDAO {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Model_ScientifiquePU");
    EntityManager manager = factory.createEntityManager();

    public List<Commentaire> allCommentaire() {
        Query query = manager.createQuery("SELECT c FROM com.article_informatique.Model.Commentaire c", Commentaire.class);
        List c = (List<Commentaire>) query.getResultList();
        return c;
    }

    public Commentaire getCommentaire(int idCommentaire) {
        return manager.find(Commentaire.class, idCommentaire);
    }

    public Commentaire updateCommentaire(int idCommentaire, Commentaire commentaire) {
        Commentaire c = getCommentaire(idCommentaire);
        if (c != null) {
            try {
                manager.getTransaction().begin();
                c.setContenu(commentaire.getContenu());
                c.setPosted(commentaire.getPosted());
                c.setValide(commentaire.getValide());
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

    public boolean deleteCommentaire(int idCommentaire) {
        Commentaire c = getCommentaire(idCommentaire);
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
