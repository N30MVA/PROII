// Programa que lee dos enteros y visualiza el resultado de sumarlos
package com.mycompany.ejer2;

import java.util.Scanner; // Importamos la clase Scanner para leer del teclado

public class Ejer2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Introduce primer valor: ");
        num1 = entrada.nextInt();
        System.out.print("Introduce segundo valor: ");
        num2 = entrada.nextInt();

        System.out.println("Suma de " + num1 + " y " + num2 + " es: " + suma(num1, num2));
        System.out.println("Resta de " + num1 + " y " + num2 + " es: " + resta(num1, num2));
        System.out.println("Multiplicanion de " + num1 + " y " + num2 + " es: " + multiplicacion(num1, num2));
        System.out.println("Division de " + num1 + " y " + num2 + " es: " + division(num1, num2));
    }

    public static int suma(int n1, int n2) {
        return n1 + n2;
    }

    public static int resta(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }

    public static float division(int n1, int n2) {
        float toret = 0;
        if(n2 != 0)
        {
            toret = n1 / n2;
        }
        return toret;
    }
}
