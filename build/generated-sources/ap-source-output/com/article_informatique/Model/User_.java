package com.article_informatique.Model;

import com.article_informatique.Model.Compte;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-10T21:59:50")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> nationalite;
    public static volatile SingularAttribute<User, Date> naissance;
    public static volatile SingularAttribute<User, String> ville;
    public static volatile SingularAttribute<User, String> specialite;
    public static volatile SingularAttribute<User, String> photo;
    public static volatile SingularAttribute<User, Integer> sexe;
    public static volatile SingularAttribute<User, String> tel;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, Integer> type;
    public static volatile SingularAttribute<User, String> nom;
    public static volatile SingularAttribute<User, String> prenom;
    public static volatile SingularAttribute<User, Compte> compte;

}