package com.mycompany.practica5_3;

public class MensajeApp extends Mensaje{
    
    public MensajeApp(String texto){
        super(texto);
    }
    
    public String enviar(){
        StringBuilder salida=new StringBuilder();
        salida.append("App: ").append(getTexto());
        return salida.toString();
    }

}
