package com.mycompany.bloque2;

public class Corredor extends Deportista{
    private double longitudZancada;
    
    public Corredor(double longitudZancada, String dni, String nombre, String categoria, int edad){
        super(dni, nombre, categoria, edad);
        this.longitudZancada=longitudZancada;
    }
    
    public double getLongitudZancada(){
        return longitudZancada;
    }
    
    @Override
    public double getRepeticionesMarca(int pos){
        return super.getMarca(pos).getDistancia()/getLongitudZancada();
    }
    
    @Override
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append(super.toString());
        salida.append("\nLongitud de la zancada: ").append(getLongitudZancada());
        return salida.toString();
    }
}
