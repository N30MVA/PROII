package com.mycompany.bloque2;

public class Marca {
    private int tiempo;
    private int distancia;
    private String referencia;
    private Fecha fechaMarca;
    
    public Marca(int tiempo, int distancia, String referencia, int dia, int mes, int ano){
        this.tiempo=tiempo;
        this.distancia=distancia;
        this.referencia=referencia;
        this.fechaMarca=new Fecha(dia, mes, ano);
    }
    
    public int getTiempo(){
        return tiempo;
    }
    
    public int getDistancia(){
        return distancia;
    }
    
    public String getReferencia(){
        return referencia;
    }
    
    public Fecha getFechaMarca(){
        return fechaMarca;
    }
    
    @Override
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append("\n-Tiempo: ").append(getTiempo());
        salida.append("\n-Distancia: ").append(getDistancia());
        salida.append("\n-Referencia: ").append(getReferencia());
        salida.append("\n-Fecha: ").append(getFechaMarca());
        return salida.toString();
    }
}
