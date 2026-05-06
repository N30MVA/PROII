package com.mycompany.practica_5;

public class Hora {
    private int hora;
    private int min;
    
    public Hora(int hora, int min){
        this.hora=hora;
        this.min=min;
    }
    
    public int getHora(){
        return hora;
    }
    
    public int getMin(){
        return min;
    }
    
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append(getHora()).append(":").append(getMin());
        return salida.toString();
    }
}
