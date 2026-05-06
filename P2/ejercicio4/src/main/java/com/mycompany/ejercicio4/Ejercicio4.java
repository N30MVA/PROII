package com.mycompany.ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        CuentaBancaria cuenta=new CuentaBancaria(2000);
        System.out.println("-Cantidad original: "+cuenta.toString());
        cuenta.ingreso(100);
        System.out.println("-Cant despues del ingreso: "+cuenta.toString());
        cuenta.retirada(200);
        System.out.println("-Cant despues de la retirada: "+cuenta.toString());
    }
}
