package com.example.applicationregistro;

import java.io.Serializable;

public class DatosUsuarios implements Serializable {
    private String nombres;
    private final String apellidos;
    private int edad;
    private String correo;

    public DatosUsuarios(String apellidos, String correo, int edad, String nombres) {
        this.apellidos = apellidos;
        this.correo = correo;
        this.edad = edad;
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getCorreo() {
        return correo;
    }
    public int getEdad() {
        return edad;
    }

    public String getNombres() {
        return nombres;
    }





}
