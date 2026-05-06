/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer2;

/**
 *
 * @author natha
 */
public class Ejer2 {

    public static void main(String[] args) {
        
        Correo correoConUsuario = new Correo("Nani", "Milf", "cachondita68");
        Correo correoSinUsuario = new Correo("Marcos", "Lamelo Piña");
        System.out.println(correoConUsuario.toString());
        System.out.println(correoSinUsuario.toString());
    }
}
