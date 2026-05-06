package com.mycompany.practica_5;

public class Articulo extends Publicacion{
    private String nombreRevista;
    private int volumen;
    private int pagInicial;
    private int pagFinal;
    
    public Articulo(String nombreRevista, int volumen, int pagInicial, int pagFinal, String titulo, int ano, int numCitas, Autor primerAutor){
        super(titulo, ano, numCitas, primerAutor);
        this.nombreRevista=nombreRevista;
        this.volumen=volumen;
        this.pagInicial=pagInicial;
        if(pagFinal<pagInicial){
            throw new PaginaFinalExcepcion("-Error, la pagina final nunca puede ser menor que la inicial-");
        }else{
            this.pagFinal=pagFinal;
        }
    }
    
    public String getNombreRevista(){
        return nombreRevista;
    }
    
    public void setNombreRevista(String nombreRevista){
        this.nombreRevista=nombreRevista;
    }
    
    public int getVolumen(){
        return volumen;
    }
    
    public void setVolumen(int volumen){
        this.volumen=volumen;
    }
    
    public int getPagInicial(){
        return pagInicial;
    }
    
    public void setPagInicial(int pagInicial){
        this.pagInicial=pagInicial;
    }
    
    public int getPagFinal(){
        return pagFinal;
    }
    
    public void setPagFinal(int pagFinal){
        this.pagFinal=pagFinal;
    }
    
    public double getPeso(){
        return 1;
    }
    
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append(super.toString());
        salida.append("\n-Nombre de la revista: ").append(getNombreRevista());
        salida.append("\n-Volumen: ").append(getVolumen());
        salida.append("\n-Pagina inicial: ").append(getPagInicial());
        salida.append("\n-Pagina final: ").append(getPagFinal());
        return salida.toString();
    }
}
