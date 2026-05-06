package com.mycompany.ejercicio2;

public class Articulo {
    private String nombre;
    private double precio;
    private Iva tipoIva;
    
    public Articulo(String nombre, double precio, Iva tipoIva){
        this.nombre=nombre;
        this.precio=precio;
        this.tipoIva=tipoIva;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public double getPrecioIva(){
        return precio+(precio*tipoIva.getAñadido());
    }
    
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append("-Nombre: ").append(getNombre());
        salida.append("\n-Precio: ").append(getPrecio());
        salida.append("\n-Precio total: ").append(getPrecioIva());
        return salida.toString();
    }
}
