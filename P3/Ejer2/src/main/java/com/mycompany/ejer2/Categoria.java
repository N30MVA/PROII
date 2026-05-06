package com.mycompany.ejer2;

public enum Categoria {
    BENJAMIN(8, 9),
    ALEVIN(10, 11),
    INFANTIL(12, 13),
    CADETE(14, 15),
    JUVENIL(16, 18),
    SENIOR(19, Categoria.EDAD_MAXIMA);

    public static final int EDAD_MAXIMA = 100;
    private final int edadInicial;
    private final int edadFinal;

    private Categoria(int edadInicial, int edadFinal) {
        this.edadInicial = edadInicial;
        this.edadFinal = edadFinal;
    }

    public int getEdadInicial(){
        return edadInicial;
    }
    
    public int getEdadFinal(){
        return edadFinal;
    }
    
    public boolean esCorrecta(int edad)
    {
        return edad >= edadInicial && edad <= edadFinal;
    }
    
    public static Categoria obtenerCategoriaPorEdad(int edad) {
        for (Categoria categoria : Categoria.values()) {
            if (edad >= categoria.edadInicial && edad <= categoria.edadFinal) {
                return categoria;
            }
        }
        return null; // Devuelve null si la edad no encaja en ninguna categoría
    }
    
    /*public Categoria leerCategoria(int numero){
        Categoria cat;
        if (numero >= 8 && numero <= 9) {
            cat = Categoria.BENJAMIN;            
        } else if (numero >= 10 && numero <= 11) {
            cat = Categoria.ALEVIN;
        } else if ( numero >= 12  && numero <= 13) {
            cat = Categoria.INFANTIL;
        } else if (numero >= 14 && numero <= 15) {
            cat = Categoria.CADETE;
        } else if (numero >= 16  && numero <= 18) {
            cat = Categoria.JUVENIL;
        } else if (numero >= 19 && numero <= Categoria.EDAD_MAXIMA) {
            cat = Categoria.SENIOR;
        } else {
            cat = null;
        }
        return cat;
    }
*/
}
