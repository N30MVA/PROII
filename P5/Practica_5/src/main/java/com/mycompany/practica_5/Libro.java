package com.mycompany.practica_5;

public class Libro extends Publicacion{
    private String editorial;
    private String lugar;
    
    public Libro(String editorial, String lugar, String titulo, int ano, int numCitas, Autor primerAutor){
        super(titulo, ano, numCitas, primerAutor);
        this.editorial=editorial;
        this.lugar=lugar;
    }
    
    public String getEditorial(){
        return editorial;
    }
    
    public void setEditorial(String editorial){
        this.editorial=editorial;
    }
    
    public String getLugar(){
        return lugar;
    }
    
    public void setLugar(String lugar){
        this.lugar=lugar;
    }
    
    public double getPeso(){
        return 0.8;
    }
    
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append(super.toString());
        salida.append("\n-Editorial: ").append(getEditorial());
        salida.append("\n-Lugar: ").append(getLugar());
        return salida.toString();
    }
}
