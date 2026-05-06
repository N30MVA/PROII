package com.mycompany.bloque2;

public class Nadador extends Deportista{
    private double frecuenciaBrazada;
    
    public Nadador(double frecuenciaBrazada, String dni, String nombre, String categoria, int edad){
        super(dni, nombre, categoria, edad);
        this.frecuenciaBrazada=frecuenciaBrazada;
    }
    
    public double getFrecuenciaBrazada(){
        return frecuenciaBrazada;
    }
    
    @Override
    public double getRepeticionesMarca(int pos){
        return super.getMarca(pos).getTiempo()*getFrecuenciaBrazada();
    }
    
    @Override
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append(super.toString());
        salida.append("\nFrecuencia de la brazada: ").append(getFrecuenciaBrazada());
        return salida.toString();
    }
}
