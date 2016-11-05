package com.article_informatique.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;


@Entity
public class Administrateur extends User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String droit;

    public Administrateur(String nom, String prenom, Date naissance, String tel, String ville, String nationalite, String photo, String specialite, int sexe, int type,String droit) {
        super(nom, prenom, naissance, tel, ville, nationalite, photo, specialite, sexe, type);
        this.droit = droit;
    }
    
    public Administrateur(int id,String nom, String prenom, Date naissance, String tel, String ville, String nationalite, String photo, String specialite, int sexe, int type,String droit) {
        super(id,nom, prenom, naissance, tel, ville, nationalite, photo, specialite, sexe, type);
        this.droit = droit;
    }

    public Administrateur(String droit) {
        this.droit = droit;
    }

    public Administrateur() {
    }

    public String getDroit() {
        return droit;
    }

    public void setDroit(String droit) {
        this.droit = droit;
    }

}
