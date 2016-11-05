package com.article_informatique.Model;

import com.article_informatique.Model.Article;
import com.article_informatique.Model.Auteur;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-10T21:59:50")
@StaticMetamodel(Soumettre.class)
public class Soumettre_ { 

    public static volatile SingularAttribute<Soumettre, Date> soumission;
    public static volatile SingularAttribute<Soumettre, String> typeAuteur;
    public static volatile SingularAttribute<Soumettre, Integer> articleId;
    public static volatile SingularAttribute<Soumettre, Integer> auteurId;
    public static volatile SingularAttribute<Soumettre, Article> article;
    public static volatile SingularAttribute<Soumettre, Auteur> auteur;

}