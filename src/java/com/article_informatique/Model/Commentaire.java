package com.article_informatique.Model;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

@Entity
public class Commentaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String contenu;
    @Temporal(TemporalType.TIMESTAMP)
    private Date posted;
    private int valide;
    
    @ManyToOne
    private Article article;

    @ManyToOne
    private Auteur auteur;

    public Commentaire(String contenu, Date posted, int valide) {
        this.contenu = contenu;
        this.posted = posted;
        this.valide = valide;
    }

    public Commentaire(int id, String contenu, Date posted, int valide) {
        this.id = id;
        this.contenu = contenu;
        this.posted = posted;
        this.valide = valide;
    }

    public Commentaire() {
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
        if (!(object instanceof Commentaire)) {
            return false;
        }
        Commentaire other = (Commentaire) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.article_informatique.Model.Commentaire[ id=" + id + " ]";
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getPosted() {
        return posted;
    }

    public void setPosted(Date posted) {
        this.posted = posted;
    }

    public int getValide() {
        return valide;
    }

    public void setValide(int valide) {
        this.valide = valide;
    }

    @XmlTransient
    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @XmlTransient
    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

}
