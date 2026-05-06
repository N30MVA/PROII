package com.mycompany.practica_5;

public class Poster extends Comunicacion{
    private String nombreSesion;
    private String sala;
    private Hora hora;
    
    public Poster(String nombreSesion, String sala, Hora hora, String nombreCongreso, String ciudad, String pais, String titulo, int ano, int numCitas, Autor primerAutor){
        super(nombreCongreso, ciudad, pais, titulo, ano, numCitas, primerAutor);
        this.nombreSesion=nombreSesion;
        this.sala=sala;
        this.hora=hora;
    }
    
    public String getNombreSesion(){
        return nombreSesion;
    }
    
    public String getSala(){
        return sala;
    }
    
    public Hora getHora(){
        return hora;
    }
    
    public double getPeso(){
        return 0.2;
    }
    
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append(super.toString());
        salida.append("\n-Nombre de la sesion: ").append(getNombreSesion());
        salida.append("\n-Sala: ").append(getSala());
        salida.append("\n-Hora: ").append(getHora());
        return salida.toString();
    }
}
