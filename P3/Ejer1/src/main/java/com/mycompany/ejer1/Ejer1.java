package com.mycompany.ejer1;

import java.util.Scanner;

class Ejer1 {
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        while (true) {
            try {
                System.out.print("\nIntroduzca dividendo: ");
                num1 = Integer.parseInt(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Error: Introduzca un número entero válido.");
            }
        }

        while (true) {
            try {
                System.out.print("\nIntroduzca divisor: ");
                num2 = Integer.parseInt(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Error: Introduzca un número entero válido.");
            }
        }

        try {
            System.out.println("\nEl resultado es: " + divide(num1, num2));
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

