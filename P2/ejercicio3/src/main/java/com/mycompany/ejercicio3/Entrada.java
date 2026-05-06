package com.mycompany.ejercicio3;
import java.util.Scanner;

public class Entrada {
    public static Scanner teclado;
    
    public Entrada(){
        teclado=new Scanner(System.in);    
    }
  
    public String leerCadena(String mensaje){
        String toRet;
        do{
            System.out.println(mensaje);
            toRet=teclado.nextLine();
        }while(toRet.equals(" ")); //== compara q el objeto sea el mismo
        return toRet;
    }
    
    public int leerEntero(String numero){
        return Integer.parseInt(leerCadena(numero));
    }
    
    public double leerDouble(String numero){
        return Double.parseDouble(leerCadena(numero));
    }
    
    public double leerChar(String caracter){
        String toRet;
        do{
            System.out.println(caracter);
            toRet=teclado.nextLine();
        }while(toRet.length()!=1);
        return toRet.charAt(0);
    }
    
    TipoLibro leerTipoLibro(String mensaje){
        int op;
        TipoLibro tp=null;
        do{
            System.out.println("1=novela // 2=historia // 3=tecnologia");
            op=leerEntero("Tu opcion: ");
        }while(op<1 || op>3);
        
        switch (op){
            case 1:
                tp=TipoLibro.NOVELA;
                break;
            case 2:
                tp=TipoLibro.HISTORIA;
                break;
            case 3:
                tp=TipoLibro.TECNOLOGIA;
                break;
        }
        return tp;
    }
}
