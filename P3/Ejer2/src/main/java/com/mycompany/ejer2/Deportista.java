package com.mycompany.ejer2;

public class Deportista {
    private String nombre;
    private String dni;
    private Categoria categoria;
    private int edad;
    
    public Deportista(String nombre, String dni, int edad ,Categoria categoria){
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
        this.categoria=categoria;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDni(){
        return dni;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public Categoria getCategoria(){
        return categoria;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public static boolean validarDni(String val) throws IllegalArgumentException{
        boolean dniVal = false;
        
        if (val.length() == 9 && ((val.charAt(8) >= 'a' && val.charAt(8) <= 'z') || (val.charAt(8) >= 'A' && val.charAt(8) <= 'Z'))){
            dniVal = true;
        } else {
            throw new IllegalArgumentException("El DNI ingresado no es válido.");
        }
        return dniVal;
    }
    
    @Override
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append("Nombre: ").append(getNombre());
        salida.append("\nDni: ").append(getDni());
        salida.append("\nCategoria: ").append(getCategoria());
        return salida.toString();
    }
}
