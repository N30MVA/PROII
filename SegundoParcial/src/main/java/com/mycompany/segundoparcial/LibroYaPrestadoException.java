package com.mycompany.segundoparcial;

public class LibroYaPrestadoException extends Exception{

    /**
     * Creates a new instance of <code>LibroYaPrestadoException</code> without
     * detail message.
     */
    public LibroYaPrestadoException() {
    }

    /**
     * Constructs an instance of <code>LibroYaPrestadoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LibroYaPrestadoException(String msg) {
        super(msg);
    }
}
