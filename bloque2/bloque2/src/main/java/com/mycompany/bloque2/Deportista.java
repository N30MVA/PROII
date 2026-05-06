package com.mycompany.bloque2;
import java.util.List;
import java.util.ArrayList;

public abstract class Deportista {
    private final String dni;
    private final String nombre;
    private String  categoria;
    private int edad;
    private List<Marca> listaMarcas;

    public Deportista(String dni, String nombre, String categoria, int edad) {
        this.dni=dni;
        this.nombre=nombre;
        this.categoria=categoria;
        this.listaMarcas=new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getEdad() {
        return edad;
    }
    
    public void anadirMarca(Marca m){
        listaMarcas.add(m);
    }
    
    public void eliminarMarca(int pos){
        listaMarcas.remove(pos);
    }
    
    public Marca getMarca(int pos){
        return listaMarcas.get(pos);
    }
    
    public abstract double getRepeticionesMarca(int pos);

    @Override
    public String toString() {
        StringBuilder salida = new StringBuilder();
        
        salida.append("\nNombre: ").append(getNombre());
        salida.append("\nDNI: ").append(getDni());
        salida.append("\nEdad: ").append(getEdad()).append(" años");
        salida.append("\nCategoría: ").append(getCategoria().toString().toLowerCase());
        for(int i=0; i<listaMarcas.size(); i++){
            salida.append("\nMarca ").append(i+1);
            salida.append(getMarca(i));
            salida.append("\nRepeticiones: ").append(getRepeticionesMarca(i));
        }
        return salida.toString();
    }	 
}
