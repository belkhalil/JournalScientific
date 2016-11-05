package com.article_informatique.Model;

import com.article_informatique.Model.Evaluation;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-10T21:59:50")
@StaticMetamodel(Viewer.class)
public class Viewer_ extends User_ {

    public static volatile ListAttribute<Viewer, Evaluation> articles;
    public static volatile SingularAttribute<Viewer, String> spec;

}