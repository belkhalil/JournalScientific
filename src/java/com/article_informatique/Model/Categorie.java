package com.article_informatique.Model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlTransient;

@Entity
public class Categorie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String label;
    private String photo;

    @ManyToMany(cascade = CascadeType.ALL)
    private Collection<Article> articles = new ArrayList<>();

    public Categorie() {
    }

    public Categorie(int id, String label, String photo) {
        this.id = id;
        this.label = label;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @XmlTransient
    public Collection<Article> getArticles() {
        return articles;
    }

    public void setArticles(Collection<Article> articles) {
        this.articles = articles;
    }

}
