package com.article_informatique.Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Evaluation")
@IdClass(EvaluationId.class)
public class Evaluation implements Serializable {

    @Id
    private int articleId;
    @Id
    private int viewerId;

    private int note;
    private String description;
    private int evaluer;
    private String objectif;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "ARTICLEID", referencedColumnName = "ID")
    private Article article;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "VIEWERID", referencedColumnName = "ID")
    private Viewer viewer;

    public Evaluation(String objectif, String description, int note, int evalier) {
        this.note = note;
        this.description = description;
        this.evaluer = evalier;
        this.objectif = objectif;
    }

    public Evaluation(int articleId, int viewerId, int note, String description, int evalier, String objectif, Article article, Viewer viewer) {
        this.articleId = articleId;
        this.viewerId = viewerId;
        this.note = note;
        this.description = description;
        this.evaluer = evalier;
        this.objectif = objectif;
        this.article = article;
        this.viewer = viewer;
    }

    public Evaluation() {
    }

    public int getViewerId() {
        return viewerId;
    }

    public void setViewerId(int viewerId) {
        this.viewerId = viewerId;
    }

    @XmlTransient
    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @XmlTransient
    public Viewer getViewer() {
        return viewer;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public int getEvaluer() {
        return evaluer;
    }

    public void setEvaluer(int evaluer) {
        this.evaluer = evaluer;
    }

}
