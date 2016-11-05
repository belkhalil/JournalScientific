package com.article_informatique.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

@Entity
public class Viewer extends User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String spec;
    @XmlTransient
    @OneToMany(mappedBy = "viewer",cascade = CascadeType.ALL)
    private List<Evaluation> articles;

    public Viewer(String nom, String prenom, Date naissance, String tel, String ville, String nationalite, String photo, String specialite, int sexe, int type,String spec) {
        super(nom, prenom, naissance, tel, ville, nationalite, photo, specialite, sexe, type);
        this.spec = spec;
    }
    
    public Viewer(int id,String nom, String prenom, Date naissance, String tel, String ville, String nationalite, String photo, String specialite, int sexe, int type,String spec) {
        super(id,nom, prenom, naissance, tel, ville, nationalite, photo, specialite, sexe, type);
        this.spec = spec;
    }

    public Viewer() {
    }

    public Viewer(String spec) {
        this.spec = spec;
    }


    public List<Evaluation> getArticles() {
        return articles;
    }

    public void setArticles(List<Evaluation> articles) {
        this.articles = articles;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
    
}
