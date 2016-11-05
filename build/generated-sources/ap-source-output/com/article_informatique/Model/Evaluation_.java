package com.article_informatique.Model;

import com.article_informatique.Model.Article;
import com.article_informatique.Model.Viewer;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-10T21:59:50")
@StaticMetamodel(Evaluation.class)
public class Evaluation_ { 

    public static volatile SingularAttribute<Evaluation, Integer> note;
    public static volatile SingularAttribute<Evaluation, Viewer> viewer;
    public static volatile SingularAttribute<Evaluation, Integer> viewerId;
    public static volatile SingularAttribute<Evaluation, Integer> articleId;
    public static volatile SingularAttribute<Evaluation, String> objectif;
    public static volatile SingularAttribute<Evaluation, String> description;
    public static volatile SingularAttribute<Evaluation, Integer> evaluer;
    public static volatile SingularAttribute<Evaluation, Article> article;

}