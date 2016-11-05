package com.article_informatique.DAO;

import com.article_informatique.Model.Administrateur;
import com.article_informatique.Model.Article;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ArticleDAO {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Model_ScientifiquePU");
    EntityManager manager = factory.createEntityManager();
    
    public List<Article> allArticle() {
        Query query = manager.createQuery("SELECT c FROM com.article_informatique.Model.Article c", Article.class);
        List c = (List<Article>) query.getResultList();
        return c;
    }
    
    public List<Article> allArticle(String label) {
        Query query = manager.createQuery("SELECT c FROM com.article_informatique.Model.Article c where c.titre LIKE '%"+label+"%'", Article.class);
        List c = (List<Article>) query.getResultList();
        return c;
    }
    
    public boolean deleteArticle(int idArticle) {
        Article d = getArticle(idArticle);
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
    
    public Article addArticle(Article c) {
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

    public Article getArticle(int idArticle) {
        return manager.find(Article.class, idArticle);
    }

    public Article updateArticle(int idArticle, Article article) {
        Article d = getArticle(idArticle);
        if (d != null) {
            try {
                manager.getTransaction().begin();
                d.setTitre(article.getTitre());
                d.setObjectif(article.getObjectif());
                d.setDescription(article.getDescription());
                d.setResume(article.getResume());
                d.setPublicVise(article.getPublicVise());
                d.setEtatVente(article.getEtatVente());
                d.setEtatArticle(article.getEtatArticle());
                d.setPrix(article.getPrix());
                d.setAgeVise(article.getAgeVise());
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
    public static void main(String[] args) {
        ArticleDAO daa = new ArticleDAO();
        List<Article> articles = daa.allArticle("c");
        for (Article article : articles) {
            System.out.println(article.getPhoto());
        }
     }
}
