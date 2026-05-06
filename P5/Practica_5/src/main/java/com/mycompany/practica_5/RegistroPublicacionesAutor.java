package com.mycompany.practica_5;
import java.util.ArrayList;

public class RegistroPublicacionesAutor {
    private Autor autor;
    private ArrayList <Publicacion> publicaciones;
    
    public RegistroPublicacionesAutor(Autor autor){
        this.autor=autor;
        this.publicaciones=new ArrayList<>();
    }
    
    public Autor getAutor(){
        return autor;
    }
    
    public ArrayList <Publicacion> getPublicaciones(){
        return publicaciones;
    }
    
    public void anadirPublicacion(Publicacion pub){
        publicaciones.add(pub);
    }
    
    public double calcularIndiceC(){
        double indice=0;
        for(Publicacion p:publicaciones){
            indice+=p.getNumCitas()*p.getPeso();
        }
        return indice;
    }
    
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append("#AUTOR#\n").append(autor.toString());
        salida.append("\n#PUBLICACIONES#");
        for(Publicacion p:publicaciones){
            salida.append(p.toString());
        }
        salida.append("\n#INDICE#\n").append(calcularIndiceC()).append("\n");
        return salida.toString();
    }
}
