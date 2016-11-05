package com.article_informatique.Model;

import com.article_informatique.Model.Auteur;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-10T21:59:50")
@StaticMetamodel(Diplome.class)
public class Diplome_ { 

    public static volatile SingularAttribute<Diplome, String> titre;
    public static volatile SingularAttribute<Diplome, String> etablissement;
    public static volatile SingularAttribute<Diplome, Integer> id;
    public static volatile SingularAttribute<Diplome, Date> obtention;
    public static volatile SingularAttribute<Diplome, Auteur> auteur;

}