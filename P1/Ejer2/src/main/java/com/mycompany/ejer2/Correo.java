/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejer2;

/**
 *
 * @author natha
 */
public class Correo {
    private String nombre;
    private String apellidos;
    private String usuario;
    public static final String SERVIDOR = "esei.uvigo.es";

    //Dan usuario
    public Correo(String nombre, String apellidos, String usuario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
    }
    
    //No dan usuario
    public Correo(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = getUsuario(nombre,apellidos);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public String getUsuario(String nombre, String apellidos){
        char inicial = nombre.charAt(0);
        String apellido1 = apellidos.split(" ")[0];
        return (apellido1 + inicial).toLowerCase();
    }    
    
    @Override
    public String toString(){
        StringBuilder salida = new StringBuilder();
        
        salida.append(getApellidos()).append(" ").append(getNombre()).append(": ");
        salida.append(getUsuario()).append("@").append(SERVIDOR);
        return salida.toString();
    }
    
}
