package com.article_informatique.DAO;

import com.article_informatique.Model.Administrateur;
import com.article_informatique.Model.Article;
import com.article_informatique.Model.Auteur;
import com.article_informatique.Model.Commentaire;
import com.article_informatique.Model.Diplome;
import com.article_informatique.Model.Soumettre;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AuteurDAO {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Model_ScientifiquePU");
    EntityManager manager = factory.createEntityManager();

    ArticleDAO articleDAO = new ArticleDAO();

    public List<Auteur> allAuteur() {
        Query query = manager.createQuery("SELECT c FROM com.article_informatique.Model.Auteur c", Auteur.class);
        List c = (List<Auteur>) query.getResultList();
        return c;
    }

    public Auteur getAuteur(int idAuteur) {
        return manager.find(Auteur.class, idAuteur);
    }

    public Auteur updateAuteur(int idAuteur, Auteur auteur) {
        Auteur a = getAuteur(idAuteur);
        if (a != null) {
            try {
                manager.getTransaction().begin();
                a.setCv(auteur.getCv());
                a.setNiveau(auteur.getNiveau());
                a.setSecteur(auteur.getSecteur());
                a.setTravail(auteur.getTravail());
                manager.persist(a);
                manager.getTransaction().commit();
                return a;
            } catch (Exception e) {
                manager.getTransaction().rollback();
                return null;
            }
        }
        return null;
    }

    public boolean addAmi(int idAuteur, int idAmi) {
        Auteur a = getAuteur(idAuteur);
        Auteur ami = getAuteur(idAmi);
        if (a != null && ami != null) {
            try {
                manager.getTransaction().begin();
                a.getAmis().add(ami);
                ami.getAmis().add(a);
                manager.getTransaction().commit();
                return true;
            } catch (Exception e) {
                manager.getTransaction().rollback();
                return false;
            }
        }
        return false;
    }

    public boolean minusAmi(int idAuteur, int idAmi) {
        Auteur a = getAuteur(idAuteur);
        Auteur ami = getAuteur(idAmi);
        if (a != null && ami != null) {
            try {
                manager.getTransaction().begin();
                a.getAmis().remove(ami);
                ami.getAmis().remove(a);
                manager.getTransaction().commit();
                return true;
            } catch (Exception e) {
                manager.getTransaction().rollback();
                return false;
            }
        }
        return false;
    }

    public Diplome addDiplomeToAuteur(int idAuteur, Diplome diplome) {
        Auteur auteur = getAuteur(idAuteur);
        if (auteur != null) {
            try {
                manager.getTransaction().begin();
                auteur.getDiplomes().add(diplome);
                diplome.setAuteur(auteur);
                manager.persist(diplome);
                manager.getTransaction().commit();
                return diplome;
            } catch (Exception e) {
                manager.getTransaction().rollback();
                return null;
            }
        }
        return null;
    }

    public Article addArticleToAuteur(int idAuteur, Soumettre soumettre, Article article) {
        Auteur auteur = getAuteur(idAuteur);
        if (auteur != null) {
            try {
                manager.getTransaction().begin();
                Article a = articleDAO.addArticle(article);
                soumettre.setArticleId(a.getId());
                soumettre.setAuteurId(auteur.getId());
                manager.persist(soumettre);
                manager.getTransaction().commit();
                return article;
            } catch (Exception e) {
                manager.getTransaction().rollback();
                return null;
            }
        }
        return null;
    }

    public Article addCommentTOArticleToAuteur(int idAuteur, int idArticle, Commentaire commentaire) {
        Auteur auteur = getAuteur(idAuteur);
        Article article = articleDAO.getArticle(idArticle);
        if (auteur != null && article != null) {
            try {
                manager.getTransaction().begin();

                auteur.getCommentaires().add(commentaire);
                commentaire.setAuteur(auteur);
                article.getCommentaires().add(commentaire);
                commentaire.setArticle(article);

                manager.persist(commentaire);

                manager.getTransaction().commit();
                return article;
            } catch (Exception e) {
                manager.getTransaction().rollback();
                return null;
            }
        }
        return null;
    }

}
