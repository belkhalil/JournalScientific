package com.article_informatique.Model;

import java.io.Serializable;

public class EvaluationId implements Serializable {

    private int articleId;
    private int viewerId;

    @Override
    public int hashCode() {
        return (articleId + viewerId);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof EvaluationId) {
            EvaluationId otherId = (EvaluationId) object;
            return (otherId.articleId == this.articleId) && (otherId.viewerId == this.viewerId);
        }
        return false;
    }

    public int getViewerId() {
        return viewerId;
    }

    public void setViewerId(int viewerId) {
        this.viewerId = viewerId;
    }

    public int getArtilceId() {
        return articleId;
    }

    public void setArtilceId(int articleId) {
        this.articleId = articleId;
    }

}
