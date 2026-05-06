package com.mycompany.practica_5;

public class Practica_5 {

    public static void main(String[] args) {
        Autor a1=new Autor("123abc", "bb", "aa", "inst1");
        Autor a2=new Autor("456def", "dd", "cc", "inst2");
        Autor a3=new Autor("789ghi", "ff", "ee", "inst3");
        
        RegistroPublicacionesAutor regA1=new RegistroPublicacionesAutor(a1);
        RegistroPublicacionesAutor regA2=new RegistroPublicacionesAutor(a2);
        RegistroPublicacionesAutor regA3=new RegistroPublicacionesAutor(a3);
        
        try{
            Articulo art=new Articulo("ABC", 1, 1, 200, "Titulo A", 2009, 1, a1);
            regA1.anadirPublicacion(art);
        }catch(PaginaFinalExcepcion err){
            System.err.println(err.getMessage());
        }
        
        Libro libro=new Libro("DEF", "Ourense", "Titulo B", 2010, 2, a2);        
        regA2.anadirPublicacion(libro);
        Comunicacion com=new Comunicacion("GHI", "Ourense", "Espana", "Titulo C", 2011, 3, a3);      
        regA3.anadirPublicacion(com);
        
        
        Hora h=new Hora(16, 30);
        Poster poster=new Poster("Sesion a", "1", h, "JKL", "Carballiño", "Espana", "Titulo D", 2012, 4, a1);
        regA1.anadirPublicacion(poster);
        
        System.out.println(regA1);
        System.out.println(regA2);
        System.out.println(regA3);
    }
}
