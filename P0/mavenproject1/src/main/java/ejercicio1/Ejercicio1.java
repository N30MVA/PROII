/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) { //empieza el metodo principal
        
        String nombre;
        int edad;
        float nota;
        
        System.out.println("Aprendiendo Java");
        System.out.println("Este es mi progama en java");
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Introduce edad");
        edad = Integer.parseInt(ent.nextLine());
        System.out.println("Introduce nombre");
        nombre = ent.nextLine();
        System.out.println("Introduce nota");
        nota = Float.parseFloat(ent.nextLine());
        
        System.out.println("Edad: " +  edad + " Nombre: " + nombre + " Nota: " + nota);
    }
}