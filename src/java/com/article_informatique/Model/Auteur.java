package com.article_informatique.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlRootElement
public class Auteur extends User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String niveau;
    private String travail;
    private String secteur;
    private String cv;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "auteur", targetEntity = Diplome.class)
    private List<Diplome> diplomes;
 
    @ManyToMany(cascade = CascadeType.ALL, targetEntity = Auteur.class)
    private List<Auteur> amis = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "auteur", targetEntity = Commentaire.class)
    private List<Commentaire> commentaires;

    @OneToMany(mappedBy = "auteur", cascade = CascadeType.ALL)
    private List<Soumettre> articles;

    public Auteur() {
    }

    public Auteur(int id, String nom, String prenom, Date naissance, String tel, String ville, String nationalite, String photo, String specialite, int sexe, int type, String niveau, String travail, String secteur, String cv) {
        super(id, nom, prenom, naissance, tel, ville, nationalite, photo, specialite, sexe, type);
        this.niveau = niveau;
        this.travail = travail;
        this.secteur = secteur;
        this.cv = cv;
    }

    public Auteur(String nom, String prenom, Date naissance, String tel, String ville, String nationalite, String photo, String specialite, int sexe, int type, String niveau, String travail, String secteur, String cv) {
        super(nom, prenom, naissance, tel, ville, nationalite, photo, specialite, sexe, type);
        this.niveau = niveau;
        this.travail = travail;
        this.secteur = secteur;
        this.cv = cv;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getTravail() {
        return travail;
    }

    public void setTravail(String travail) {
        this.travail = travail;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

//    @XmlTransient
    public List<Diplome> getDiplomes() {
        return diplomes;
    }

    public void setDiplomes(List<Diplome> diplomes) {
        this.diplomes = diplomes;
    }

    public List<Auteur> getAmis() {
        return amis;
    }

    public void setAmis(List<Auteur> amis) {
        this.amis = amis;
    }

//    @XmlTransient
    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public List<Soumettre> getArticles() {
        return articles;
    }

    public void setArticles(List<Soumettre> articles) {
        this.articles = articles;
    }

}
