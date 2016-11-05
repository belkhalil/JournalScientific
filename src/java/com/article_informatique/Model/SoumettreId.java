package com.article_informatique.Model;

import java.io.Serializable;

public class SoumettreId implements Serializable{
    
    private int articleId;
    private int auteurId;

    @Override
    public int hashCode() {
        return (articleId + auteurId);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof EvaluationId) {
            SoumettreId otherId = (SoumettreId) object;
            return (otherId.articleId == this.articleId) && (otherId.auteurId == this.auteurId);
        }
        return false;
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

}
