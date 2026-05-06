package com.mycompany.segundoparcial;

import java.util.List;

public class UsuarioProfesor extends Usuario implements Recomendable{

    public UsuarioProfesor(String nombre, String dni) {
        super(nombre, dni);
    }
    
    @Override
    public int maximoPrestamos(){
        return 6;
    }
    
    @Override
    public String tipoUsuario(){
        return "Profesor";
    }
    
    @Override
    public List<Libro> recomendarLibros(Biblioteca b){
        
        
        return null;
    }
}
