package com.mycompany.practica_5;

public abstract class Publicacion {
    private String titulo;
    private int ano;
    private int numCitas;
    private Autor primerAutor;
    
    //Composicion debil
    public Publicacion(String titulo, int ano, int numCitas, Autor primerAutor){
        this.titulo=titulo;
        this.ano=ano;
        this.numCitas=numCitas;
        this.primerAutor=primerAutor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano=ano;
    }
    
    public int getNumCitas(){
        return numCitas;
    }
    
    public void setNumCitas(int numCitas){
        this.numCitas=numCitas;
    }
    
    public Autor getPrimerAutor(){
        return primerAutor;
    }
    
    public abstract double getPeso();
    
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append("\n-Titulo: ").append(getTitulo());
        salida.append("\n-Ano: ").append(getAno());
        salida.append("\n-Numero de citas: ").append(getNumCitas());
        salida.append("\n-Primer autor: ").append(getPrimerAutor());
        return salida.toString();
    }
}
