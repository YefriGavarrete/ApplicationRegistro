package com.example.applicationregistro;

import java.io.Serializable;

public class DatosUsuarios implements Serializable {
    private String nombres;
    private final String apellidos;
    private int edad;
    private String correo;

    public DatosUsuarios( String nombres, String apellidos,  int edad, String correo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.correo = correo;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public String getCorreo() {
        return correo;
    }








}
