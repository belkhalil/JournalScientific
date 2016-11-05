/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.article_informatique.DAO.CompteDAO;
import com.article_informatique.Model.Auteur;
import com.article_informatique.Model.Compte;
import com.article_informatique.Model.Soumettre;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author AmineHN
 */
public class Terst {

    public static void main(String[] args) {
       CompteDAO dao = new CompteDAO();
       Compte c = dao.getCompte(1);
       Auteur auteur = (Auteur) c.getUser();
       List<Soumettre> soumettres = auteur.getArticles();
        for (Soumettre soumettre : soumettres) {
            System.out.println(soumettre.getArticle().getTitre());
        }
        int i = auteur.getAmis().size();
        System.out.println(i);
    }

}
