package com.article_informatique.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    @Temporal(TemporalType.TIMESTAMP)
    private Date naissance;
    private String tel;
    private String ville;
    private String nationalite;
    private String photo;
    private String specialite;
    private int sexe;
    private int type;

    @XmlTransient
    @OneToOne(cascade = CascadeType.ALL)
    private Compte compte;

    public User() {
    }

    public User(int id, String nom, String prenom, Date naissance, String tel, String ville, String nationalite, String photo, String specialite, int sexe, int type, Compte compte) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
        this.tel = tel;
        this.ville = ville;
        this.nationalite = nationalite;
        this.photo = photo;
        this.specialite = specialite;
        this.sexe = sexe;
        this.type = type;
        this.compte = compte;
    }

    public User(String nom, String prenom, Date naissance, String tel, String ville, String nationalite, String photo, String specialite, int sexe, int type, Compte compte) {
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
        this.tel = tel;
        this.ville = ville;
        this.nationalite = nationalite;
        this.photo = photo;
        this.specialite = specialite;
        this.sexe = sexe;
        this.type = type;
        this.compte = compte;
    }
    
    public User(String nom, String prenom, Date naissance, String tel, String ville, String nationalite, String photo, String specialite, int sexe, int type) {
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
        this.tel = tel;
        this.ville = ville;
        this.nationalite = nationalite;
        this.photo = photo;
        this.specialite = specialite;
        this.sexe = sexe;
        this.type = type;
    }

    public User(int id, String nom, String prenom, Date naissance, String tel, String ville, String nationalite, String photo, String specialite, int sexe, int type) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
        this.tel = tel;
        this.ville = ville;
        this.nationalite = nationalite;
        this.photo = photo;
        this.specialite = specialite;
        this.sexe = sexe;
        this.type = type;
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.article_informatique.Model.User[ id=" + id + " ]";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public int getSexe() {
        return sexe;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }
    
    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
