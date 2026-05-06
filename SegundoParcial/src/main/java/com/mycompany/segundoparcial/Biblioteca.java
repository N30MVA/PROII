package com.mycompany.segundoparcial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {

    private List<Libro> libros;
    private List<Usuario> usuarios;
    private Entrada en;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    
    public void addUsuario(Usuario u){
        usuarios.add(u);
    }
    
    public void addLibro(Libro libro){
        libros.add(libro);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro.leerLibro());
    }

    public void agregarUsuario() {
        System.out.println("Introduzca datos del usuario:");

        String nombre = en.leerCadena("\nNombre: ");
        String dni = en.leerCadena("\nDNI: ");

        int type;
        Usuario nuevo = null;

        do {
            type = en.leerEntero("\nTipo de usuario [1 = Estudiante, 2 = Profesor]: ");

            switch (type) {
                case 1 ->
                    nuevo = new UsuarioEstudiante(nombre, dni);
                case 2 ->
                    nuevo = new UsuarioProfesor(nombre, dni);
                default ->
                    System.out.println("Tipo no válido. Intente de nuevo.");
            }
        } while (nuevo == null); // repetir hasta que se cree un usuario válido

        usuarios.add(nuevo); // finalmente se añade a la lista
    }

    public Libro buscarLibro(String titulo) {        
        return buscarLibroRecursivo(titulo, 0);
    }
    
    public Libro buscarLibroRecursivo(String titulo, int index){
        if (index >= libros.size()) {
            return null; // No encontrado
        }
        
        Libro actual = libros.get(index);
        
        if (actual.getTitulo().equalsIgnoreCase(titulo)) {
            return actual;
        }
        
        return buscarLibroRecursivo(titulo, index + 1);
    }

    public void listarLibrosDisponiblesPorGenero(Genero genero) {

    }
    
    public void mostrarUsuariosOrdenadosPorNombre() {
        usuarios.sort(Comparator.comparing(Usuario::getNombre));
        
        int i = 0;
        for (Usuario u : usuarios) {
            i++;
            System.out.println(i + ". " + u.getNombre());
        }
    }
}
