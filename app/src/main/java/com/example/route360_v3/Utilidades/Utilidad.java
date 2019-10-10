package com.example.route360_v3.Utilidades;

public class Utilidad {

    public static final String TABLA_USUARIO = "Usuario";

    public static final String CAMPO_ID_US = "id";

    public static final String CAMPO_NOMBRE_US = "nom";

    public static final String CAMPO_APELLIDO_US = "ape";

    public static final String CAMPO_CORREO_US = "email";

    public static final String CAMPO_CONTRA_US = "password";

    public static final String CREATE_TABLE_USUARIO = "CREATE TABLE "+TABLA_USUARIO+
            "("+CAMPO_ID_US+" INTEGER PRIMARY KEY AUTOINCREMENT, "+CAMPO_NOMBRE_US+" TEXT, "
            +CAMPO_APELLIDO_US+" TEXT, "+CAMPO_CORREO_US+" TEXT, "+CAMPO_CONTRA_US+" TEXT)";



}
