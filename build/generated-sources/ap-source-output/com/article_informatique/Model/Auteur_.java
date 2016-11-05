package com.article_informatique.Model;

import com.article_informatique.Model.Auteur;
import com.article_informatique.Model.Commentaire;
import com.article_informatique.Model.Diplome;
import com.article_informatique.Model.Soumettre;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-10T21:59:50")
@StaticMetamodel(Auteur.class)
public class Auteur_ extends User_ {

    public static volatile SingularAttribute<Auteur, String> secteur;
    public static volatile SingularAttribute<Auteur, String> cv;
    public static volatile ListAttribute<Auteur, Diplome> diplomes;
    public static volatile SingularAttribute<Auteur, String> travail;
    public static volatile ListAttribute<Auteur, Commentaire> commentaires;
    public static volatile ListAttribute<Auteur, Auteur> amis;
    public static volatile SingularAttribute<Auteur, String> niveau;
    public static volatile ListAttribute<Auteur, Soumettre> articles;

}