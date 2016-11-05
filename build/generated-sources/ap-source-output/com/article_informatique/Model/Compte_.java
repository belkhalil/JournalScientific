package com.article_informatique.Model;

import com.article_informatique.Model.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-10T21:59:50")
@StaticMetamodel(Compte.class)
public class Compte_ { 

    public static volatile SingularAttribute<Compte, Integer> visible;
    public static volatile SingularAttribute<Compte, String> motPasse;
    public static volatile SingularAttribute<Compte, Integer> active;
    public static volatile SingularAttribute<Compte, Integer> id;
    public static volatile SingularAttribute<Compte, String> login;
    public static volatile SingularAttribute<Compte, Integer> valide;
    public static volatile SingularAttribute<Compte, User> user;
    public static volatile SingularAttribute<Compte, String> email;
    public static volatile SingularAttribute<Compte, Date> creation;

}