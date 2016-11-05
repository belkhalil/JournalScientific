package com.article_informatique.DAO;

import com.article_informatique.Model.Article;
import com.article_informatique.Model.Evaluation;
import com.article_informatique.Model.Viewer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ViewerDAO {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Model_ScientifiquePU");
    EntityManager manager = factory.createEntityManager();

    ArticleDAO articleDAO = new ArticleDAO();

    public List<Viewer> allViewer() {
        Query query = manager.createQuery("SELECT c FROM com.article_informatique.Model.Viewer c", Viewer.class);
        List c = (List<Viewer>) query.getResultList();
        return c;
    }

    public boolean deleteViewer(int idViewer) {
        Viewer d = getViewer(idViewer);
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

    public Viewer getViewer(int idViewer) {
        return manager.find(Viewer.class, idViewer);
    }

    public Viewer updateViewer(int idViewer, Viewer viewer) {
        Viewer d = getViewer(idViewer);
        if (d != null) {
            try {
                manager.getTransaction().begin();
                d.setSpec(viewer.getSpec());
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

    public Evaluation evaluateArticle(int idViewer, int idArticle, Evaluation evaluation) {
        Viewer viewer = getViewer(idViewer);
        Article article = articleDAO.getArticle(idArticle);
        if (viewer != null && article != null) {
            try {
                manager.getTransaction().begin();
                evaluation.setArticleId(idArticle);
                evaluation.setViewerId(idViewer);
                manager.persist(evaluation);
                manager.getTransaction().commit();
            } catch (Exception e) {
            }
        }
        return null;
    }

}
