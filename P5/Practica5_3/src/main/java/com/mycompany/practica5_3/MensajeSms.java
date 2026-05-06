package com.mycompany.practica5_3;

public class MensajeSms extends Mensaje{
    
    public MensajeSms(String texto){
        super(texto);
    }
    
    public String enviar(){
        StringBuilder salida=new StringBuilder();
        salida.append("Sms: ").append(getTexto());
        return salida.toString();
    }
}
