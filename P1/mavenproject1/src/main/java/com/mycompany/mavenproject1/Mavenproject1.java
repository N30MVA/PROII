/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author natha
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        
        Punto p = new Punto(0,2);
        
        System.out.println(p.getX());
        System.out.println(p.getY());
        
        Punto p2 = new Punto(10,15);
        System.out.println("Distancia: " + p2.calcularDistanciaOrigen());
    }
}
