package com.mycompany.segundoparcial;

public class SegundoParcial {

    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();
        
        Libro libro1 = new Libro("El Quijote", "Miguel Cervantes", 0, Genero.FICCION, false);
        Libro libro2 = new Libro("La sombra del cipres es larga", "Miguel Delibes", 1900, Genero.FICCION, false);
        
        Usuario usuario1 = new UsuarioEstudiante("Naim","35609342y");
        Usuario usuario2 = new UsuarioProfesor("Carlos", "36062131e");
        
        
        miBiblioteca.addLibro(libro2);
        miBiblioteca.addLibro(libro1);
        miBiblioteca.addUsuario(usuario2);
        miBiblioteca.addUsuario(usuario1);
        
        miBiblioteca.mostrarUsuariosOrdenadosPorNombre();
    }
}
