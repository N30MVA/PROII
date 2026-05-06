package com.mycompany.practica5_3;
import java.util.List;
import java.util.ArrayList;

public class Practica5_3 {

    public static void main(String[] args) {
        List<Mensaje> mensajes=new ArrayList<>();
        
        mensajes.add(new MensajeEmail("Este es el contenido del email"));
        mensajes.add(new MensajeSms("Este es el contenido del sms"));
        mensajes.add(new MensajeApp("Este es el contenido de la notificacion de la app"));
        
        for(Mensaje m:mensajes){
            System.out.println(m.enviar());
        }
    }
}
