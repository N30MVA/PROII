package com.mycompany.ejer2;

import java.util.Scanner;

public class Entrada {
    public static Scanner teclado;
    
    public Entrada(){
        teclado=new Scanner(System.in);
    }
    
    public String leerCadena(String mensaje){
        String toRet;
        do{
            System.out.print(mensaje);
            toRet=teclado.nextLine();
        }while(toRet.equals(" "));
        return toRet;
    }
    
    public int leerEntero(String numero){
        return Integer.parseInt(leerCadena(numero));
    }
    
    public Categoria leerCategoria(int numero) throws IllegalArgumentException{
        Categoria cat;
        if (numero >= 8 && numero <= 9) {
            cat = Categoria.BENJAMIN;            
        } else if (numero >= 10 && numero <= 11) {
            cat = Categoria.ALEVIN;
        } else if ( numero >= 12  && numero <= 13) {
            cat = Categoria.INFANTIL;
        } else if (numero >= 14 && numero <= 15) {
            cat = Categoria.CADETE;
        } else if (numero >= 16  && numero <= 18) {
            cat = Categoria.JUVENIL;
        } else if (numero >= 19 && numero <= Categoria.EDAD_MAXIMA) {
            cat = Categoria.SENIOR;
        } else {
            throw new IllegalArgumentException("\tError en la base de datos");
        }
        return cat;
    }
}
