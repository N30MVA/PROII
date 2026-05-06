package com.mycompany.segundoparcial;

public enum Genero {
    FICCION, 
    NO_FICCION, 
    POESIA, 
    BIOGRAFIA, 
    CIENCIA, 
    TECNOLOGIA;
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Genero").append(name());
        
        return sb.toString();
    }
}
