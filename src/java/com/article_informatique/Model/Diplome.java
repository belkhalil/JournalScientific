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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlRootElement
public class Diplome implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    @Temporal(TemporalType.DATE)
    private Date obtention;
    private String etablissement;

    @ManyToOne
    private Auteur auteur;

    public Diplome(int id, String titre, Date obtention, String etablissement) {
        this.id = id;
        this.titre = titre;
        this.obtention = obtention;
        this.etablissement = etablissement;
    }

    public Diplome() {
    }

    public Diplome(String titre, Date obtention, String etablissement) {
        this.titre = titre;
        this.obtention = obtention;
        this.etablissement = etablissement;
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
        if (!(object instanceof Diplome)) {
            return false;
        }
        Diplome other = (Diplome) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.article_informatique.Model.Diplome[ id=" + id + " ]";
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getObtention() {
        return obtention;
    }

    public void setObtention(Date obtention) {
        this.obtention = obtention;
    }

    public String getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    @XmlTransient
    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

}
