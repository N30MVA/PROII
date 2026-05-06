package com.mycompany.segundoparcial;

import java.util.List;

public class UsuarioEstudiante extends Usuario{

    public UsuarioEstudiante(String nombre, String dni) {
        super(nombre, dni);
    }

    @Override
    public int maximoPrestamos(){
        return 3;
    }
    
    @Override
    public String tipoUsuario(){
        return "Estudiante";
    }
}
