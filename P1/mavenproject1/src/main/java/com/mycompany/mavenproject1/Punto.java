/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author natha
 */
public class Punto {
    public final Punto origen = new Punto(0,0);
    private int x;
    private int y;

    public Punto(int coordenadaX, int coordenadaY) {
        this.x = coordenadaX;
        this.y = coordenadaY;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double calcularDistanciaOrigen(){
        double distancia = (x * x + y * y);
        return Math.sqrt(distancia);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
