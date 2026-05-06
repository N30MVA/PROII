package com.mycompany.practica_5;

public class Comunicacion extends Publicacion{
    private String nombreCongreso;
    private String ciudad;
    private String pais;
    
    public Comunicacion(String nombreCongreso, String ciudad, String pais, String titulo, int ano, int numCitas, Autor primerAutor){
        super(titulo, ano, numCitas, primerAutor);
        this.nombreCongreso=nombreCongreso;
        this.ciudad=ciudad;
        this.pais=pais;
    }
    
    public String getNombreCongreso(){
        return nombreCongreso;
    }
    
    public void setNombreCongreso(String nombreCongreso){
        this.nombreCongreso=nombreCongreso;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }
    
    public String getPais(){
        return pais;
    }
    
    public void setPais(String pais){
        this.pais=pais;
    }
    
    public double getPeso(){
        return 0.6;
    }
    
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append(super.toString());
        salida.append("\n-Nombre del congreso: ").append(getNombreCongreso());
        salida.append("\n-Ciudad: ").append(getCiudad());
        salida.append("\n-Pais: ").append(getPais());
        return salida.toString();
    }
}
