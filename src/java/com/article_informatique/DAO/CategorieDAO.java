package com.article_informatique.DAO;

import com.article_informatique.Model.Categorie;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CategorieDAO {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Model_ScientifiquePU");
    EntityManager manager = factory.createEntityManager();

    public List<Categorie> allCategorie() {
        Query query = manager.createQuery("SELECT c FROM com.article_informatique.Model.Categorie c", Categorie.class);
        List c = (List<Categorie>) query.getResultList();
        return c;
    }

    public Categorie addCategorie(Categorie c) {
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

    public boolean deleteCategorie(int idCategorie) {
        Categorie d = getCategorie(idCategorie);
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

    public Categorie getCategorie(int idCategorie) {
        return manager.find(Categorie.class, idCategorie);
    }

    public Categorie updateCategorie(int idCategorie, Categorie categorie) {
        Categorie d = getCategorie(idCategorie);
        if (d != null) {
            try {
                manager.getTransaction().begin();
                d.setLabel(categorie.getLabel());
                d.setPhoto(categorie.getPhoto());
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
