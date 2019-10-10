package com.example.route360_v3.Entidades;

public class Empresa {

    private int idEmp;
    private String nomEmp;
    private String rucEmp;
    private String codRut;
    private String dirEmp;

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public String getRucEmp() {
        return rucEmp;
    }

    public void setRucEmp(String rucEmp) {
        this.rucEmp = rucEmp;
    }

    public String getCodRut() {
        return codRut;
    }

    public void setCodRut(String codRut) {
        this.codRut = codRut;
    }

    public String getDirEmp() {
        return dirEmp;
    }

    public void setDirEmp(String dirEmp) {
        this.dirEmp = dirEmp;
    }

    public String getEmailEmp() {
        return emailEmp;
    }

    public void setEmailEmp(String emailEmp) {
        this.emailEmp = emailEmp;
    }

    public String getPswEmp() {
        return pswEmp;
    }

    public void setPswEmp(String pswEmp) {
        this.pswEmp = pswEmp;
    }

    private String emailEmp;
    private String pswEmp;

    public Empresa(int idEmp, String nomEmp, String rucEmp, String codRut, String dirEmp, String emailEmp, String pswEmp) {
        this.idEmp = idEmp;
        this.nomEmp = nomEmp;
        this.rucEmp = rucEmp;
        this.codRut = codRut;
        this.dirEmp = dirEmp;
        this.emailEmp = emailEmp;
        this.pswEmp = pswEmp;
    }


}
