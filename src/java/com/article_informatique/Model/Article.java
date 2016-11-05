package com.article_informatique.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

@Entity
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String objectif;
    private String description;
    private String resume;
    private String photo;
    private String pdf;
    private int publicVise;
    private int etatArticle;
    private int etatVente;
    private int prix;
    private int ageVise;


    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, targetEntity = Evaluation.class)
    private List<Evaluation> viewers;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, targetEntity = Soumettre.class)
    private List<Soumettre> auteurs;

    @ManyToMany(cascade = CascadeType.ALL, targetEntity = Categorie.class)
    private List<Categorie> categories = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "article", targetEntity = Commentaire.class)
    private List<Commentaire> commentaires;

    public Article(int id, String titre, String objectif, String description, String resume, int publicVise, int etatArticle, int etatVente, int prix, int ageVise, String photo, String pdf) {
        this.id = id;
        this.titre = titre;
        this.objectif = objectif;
        this.description = description;
        this.resume = resume;
        this.publicVise = publicVise;
        this.etatArticle = etatArticle;
        this.etatVente = etatVente;
        this.prix = prix;
        this.ageVise = ageVise;
        this.photo = photo;
        this.pdf = pdf;
    }

    public Article(String titre, String objectif, String description, String resume, int publicVise, int etatArticle, int etatVente, int prix, int ageVise, String photo, String pdf) {
        this.titre = titre;
        this.objectif = objectif;
        this.description = description;
        this.resume = resume;
        this.publicVise = publicVise;
        this.etatArticle = etatArticle;
        this.etatVente = etatVente;
        this.prix = prix;
        this.ageVise = ageVise;
        this.photo = photo;
        this.pdf = pdf;
    }

    public Article() {
    }

    public Article(int id, String titre, List<Evaluation> viewers) {
        this.id = id;
        this.titre = titre;
        this.viewers = viewers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.article_informatique.Model.Article[ id=" + id + " ]";
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public List<Evaluation> getViewers() {
        return viewers;
    }

    public void setViewers(List<Evaluation> viewers) {
        this.viewers = viewers;
    }

    public List<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getAgeVise() {
        return ageVise;
    }

    public void setAgeVise(int ageVise) {
        this.ageVise = ageVise;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public int getPublicVise() {
        return publicVise;
    }

    public void setPublicVise(int publicVise) {
        this.publicVise = publicVise;
    }

    public int getEtatArticle() {
        return etatArticle;
    }

    public void setEtatArticle(int etatArticle) {
        this.etatArticle = etatArticle;
    }

    public int getEtatVente() {
        return etatVente;
    }

    public void setEtatVente(int etatVente) {
        this.etatVente = etatVente;
    }

    public List<Soumettre> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(List<Soumettre> auteurs) {
        this.auteurs = auteurs;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

}
