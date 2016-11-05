package com.article_informatique.Model;

import com.article_informatique.Model.Article;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-10T21:59:50")
@StaticMetamodel(Categorie.class)
public class Categorie_ { 

    public static volatile SingularAttribute<Categorie, String> photo;
    public static volatile SingularAttribute<Categorie, Integer> id;
    public static volatile SingularAttribute<Categorie, String> label;
    public static volatile CollectionAttribute<Categorie, Article> articles;

}