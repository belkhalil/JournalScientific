package com.article_informatique.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Compte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String login;
    private String motPasse;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creation;
    private int active;
    private int visible;
    private int valide;

    @OneToOne(mappedBy = "compte",cascade = CascadeType.ALL)
    private User user;

    public Compte(int id, String email, String login, String motPasse, Date creation, int active, int visible, int valide, User user) {
        this.id = id;
        this.email = email;
        this.login = login;
        this.motPasse = motPasse;
        this.creation = creation;
        this.active = active;
        this.visible = visible;
        this.valide = valide;
        this.user = user;
    }
    
    public Compte(String email, String login, String motPasse, Date creation, int active, int visible, int valide, User user) {
        this.email = email;
        this.login = login;
        this.motPasse = motPasse;
        this.creation = creation;
        this.active = active;
        this.visible = visible;
        this.valide = valide;
        this.user = user;
    }
    
    public Compte(int id, String email, String login, String motPasse, Date creation, int active, int visible, int valide) {
        this.id = id;
        this.email = email;
        this.login = login;
        this.motPasse = motPasse;
        this.creation = creation;
        this.active = active;
        this.visible = visible;
        this.valide = valide;
    }

    public Compte(String email, String login, String motPasse,int active, int visible, int valide) {
        this.email = email;
        this.login = login;
        this.motPasse = motPasse;
        this.creation = new Date();
        this.active = active;
        this.visible = visible;
        this.valide = valide;
    }

    public Compte() {
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
        if (!(object instanceof Compte)) {
            return false;
        }
        Compte other = (Compte) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.article_informatique.Model.Compte[ id=" + id + " ]";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public int getValide() {
        return valide;
    }

    public void setValide(int valide) {
        this.valide = valide;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
