package com.mycompany.ejercicio2;

public enum Iva {
    GENERAL(0.21),
    REDUCIDO(0.1),
    SUPERREDUCIDO(0.04),
    EXENTO(0.00);
    
    private final double añadido;
    
    private Iva(double añadido){
        this.añadido=añadido;
    }
    
    public double getAñadido(){
        return añadido;
    }
}
