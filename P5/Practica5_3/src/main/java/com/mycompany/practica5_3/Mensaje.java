package com.mycompany.practica5_3;

public abstract class Mensaje implements Enviable{
    private String texto;
    
    public Mensaje(String texto){
        this.texto=texto;
    }
      
    public String getTexto(){
        return texto;
    }
    
    @Override
    public abstract String enviar();
}
