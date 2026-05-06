package com.mycompany.segundoparcial;

public class LimitePrestamosExcedidoException extends Exception {

    /**
     * Creates a new instance of <code>LimitePrestamosExcedidoException</code>
     * without detail message.
     */
    public LimitePrestamosExcedidoException() {
    }

    /**
     * Constructs an instance of <code>LimitePrestamosExcedidoException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public LimitePrestamosExcedidoException(String msg) {
        super(msg);
    }
}
