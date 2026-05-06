package com.mycompany.practica5_3;

public class MensajeEmail extends Mensaje{
    
    public MensajeEmail(String texto){
        super(texto);
    }
    
    public String enviar(){
        StringBuilder salida=new StringBuilder();
        salida.append("Email: ").append(getTexto());
        return salida.toString();
    }
}
