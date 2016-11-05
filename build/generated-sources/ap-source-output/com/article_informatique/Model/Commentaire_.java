package com.article_informatique.Model;

import com.article_informatique.Model.Article;
import com.article_informatique.Model.Auteur;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-10T21:59:50")
@StaticMetamodel(Commentaire.class)
public class Commentaire_ { 

    public static volatile SingularAttribute<Commentaire, Integer> id;
    public static volatile SingularAttribute<Commentaire, Integer> valide;
    public static volatile SingularAttribute<Commentaire, String> contenu;
    public static volatile SingularAttribute<Commentaire, Article> article;
    public static volatile SingularAttribute<Commentaire, Date> posted;
    public static volatile SingularAttribute<Commentaire, Auteur> auteur;

}