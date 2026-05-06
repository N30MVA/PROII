package com.mycompany.ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        Libro libro=new Libro("Thinking in Java", "Bruce Eckel", "Prentice Hall", 2007, "0131872486", TipoLibro.NOVELA);
        System.out.println(libro.toString());
    }
    
    public static Libro leerLibro(){
        String titulo;
        String autor;
        String editorial;
        int anoPub;
        String isbn;
        TipoLibro tp;
        Entrada entrada=new Entrada();
        
        titulo=entrada.leerCadena("Escribe el titulo: ");
        autor=entrada.leerCadena("Escribe el autor: ");
        editorial=entrada.leerCadena("Escribe la editorial: ");
        anoPub=entrada.leerEntero("Escribe el año de publicacion: ");
        isbn=entrada.leerCadena("Escribe el isbn: ");
        tp=entrada.leerTipoLibro("Tipo de libro: ");
        
        return new Libro(titulo, autor, editorial, anoPub, isbn, tp);
    }
}