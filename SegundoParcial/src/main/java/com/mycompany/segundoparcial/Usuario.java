package com.mycompany.segundoparcial;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {

    private String nombre;
    private String dni;
    private List<Libro> prestados;
    private Entrada en;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.prestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public List<Libro> getPrestados() {
        return prestados;
    }

    public void prestarLibro(Libro libro) throws LimitePrestamosExcedidoException {
        if (prestados.size() == maximoPrestamos()) {
            throw new LimitePrestamosExcedidoException("Maximo de libros prestadp alcanzado");
        }

        try {
            libro.prestar();
            prestados.add(libro);

        } catch (LibroYaPrestadoException lype) {
            System.err.println(lype.getMessage());
        }
    }

    public void devolverLibro(Libro libro) {
        if (!libro.isPrestado()) {
            libro.devolver();
            prestados.remove(libro);
        }
    }

    
    public abstract int maximoPrestamos();

    public abstract String tipoUsuario();
}
