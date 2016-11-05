package com.article_informatique.Model;

import com.article_informatique.Model.Categorie;
import com.article_informatique.Model.Commentaire;
import com.article_informatique.Model.Evaluation;
import com.article_informatique.Model.Soumettre;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-10T21:59:50")
@StaticMetamodel(Article.class)
public class Article_ { 

    public static volatile SingularAttribute<Article, String> resume;
    public static volatile ListAttribute<Article, Soumettre> auteurs;
    public static volatile SingularAttribute<Article, Integer> prix;
    public static volatile SingularAttribute<Article, String> titre;
    public static volatile SingularAttribute<Article, String> description;
    public static volatile SingularAttribute<Article, String> photo;
    public static volatile SingularAttribute<Article, Integer> publicVise;
    public static volatile SingularAttribute<Article, Integer> etatVente;
    public static volatile ListAttribute<Article, Evaluation> viewers;
    public static volatile SingularAttribute<Article, String> pdf;
    public static volatile SingularAttribute<Article, Integer> ageVise;
    public static volatile SingularAttribute<Article, String> objectif;
    public static volatile ListAttribute<Article, Commentaire> commentaires;
    public static volatile SingularAttribute<Article, Integer> id;
    public static volatile ListAttribute<Article, Categorie> categories;
    public static volatile SingularAttribute<Article, Integer> etatArticle;

}