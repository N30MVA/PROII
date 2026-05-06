package com.mycompany.ejer3;

public class Persona {
    private String nombre;
    private String apellidos;
    private String numDni;
    private char letraDni;
    
    public Persona(String nombre, String apellidos, String numDni){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.numDni=numDni;
        this.letraDni=getLetraDni(Integer.parseInt(numDni));
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public String getNumDni(){
        return numDni;
    }
    
    public char getLetraDni(int numDni){
        String letras="TRWAGMYFPDXBNJZSQVHLCKE";
        int pos=numDni%23;
        return letras.charAt(pos);
    }
    
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append(getNombre()).append(getApellidos()).append(", ").append(getNumDni()).append(letraDni);
        return salida.toString();
    }
}
