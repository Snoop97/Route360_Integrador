package com.example.route360_v3.Entidades;

public class Usuario {

    private Integer id;
    private String nom;
    private String ape;
    private String email;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public Usuario(Integer id, String nom, String ape, String email, String password) {
        this.id = id;
        this.nom = nom;
        this.ape = ape;
        this.email = email;
        this.password = password;
    }

    public Usuario() {

    }
}
