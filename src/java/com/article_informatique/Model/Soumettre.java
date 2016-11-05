package com.article_informatique.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "Soumettre")
@IdClass(SoumettreId.class)
public class Soumettre implements Serializable {

    @Id
    private int articleId;
    @Id
    private int auteurId;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date soumission;
    private String typeAuteur;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "ARTICLEID", referencedColumnName = "ID")
    private Article article;

    @ManyToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn(name = "AUTEURID", referencedColumnName = "ID")
    private Auteur auteur;

    public Soumettre() {
    }

    public Soumettre(int articleId, int auteurId, Date soumission, String typeAuteur) {
        this.articleId = articleId;
        this.auteurId = auteurId;
        this.soumission = soumission;
        this.typeAuteur = typeAuteur;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getAuteurId() {
        return auteurId;
    }

    public void setAuteurId(int auteurId) {
        this.auteurId = auteurId;
    }

    public Date getSoumission() {
        return soumission;
    }

    public void setSoumission(Date soumission) {
        this.soumission = soumission;
    }

    public String getTypeAuteur() {
        return typeAuteur;
    }

    public void setTypeAuteur(String typeAuteur) {
        this.typeAuteur = typeAuteur;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    
}
