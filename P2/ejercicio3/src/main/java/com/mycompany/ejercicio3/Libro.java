package com.mycompany.ejercicio3;

public class Libro {
    private String titulo;
    private String autores;
    private String editorial;
    private int anoPublicacion;
    private String isbn;
    private TipoLibro tipoLibro;
    
    public Libro(String titulo, String autores, String editorial, int anoPublicacion, String isbn, TipoLibro tipoLibro){
        this.titulo=titulo;
        this.autores=autores;
        this.editorial=editorial;
        this.anoPublicacion=anoPublicacion;
        this.isbn=isbn;
        this.tipoLibro=tipoLibro;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutores(){
        return autores;
    }
    
    public String getEditorial(){
        return editorial;
    }
    
    public int getAnoPublicacion(){
        return anoPublicacion;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public TipoLibro getTipoLibro(){
        return tipoLibro;
    }
    
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append("-Titulo: ").append(getTitulo());
        salida.append("\n-Autores: ").append(getAutores());
        salida.append("\n-Editorial: ").append(getEditorial());
        salida.append("\n-Ano de publicacion: ").append(getAnoPublicacion());
        salida.append("\n-Isbn: ").append(getIsbn());
        salida.append("\n-Tipo de libro: ").append(getTipoLibro());
        return salida.toString();
    }
}
