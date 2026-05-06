package [especificarPaquete];

public enum Categoria {
    BENJAMIN(8, 9),
    ALEVIN(10, 11),
    INFANTIL(12, 13),
    CADETE(14, 15),
    JUVENIL(16, 18),
    SENIOR(19, Categoria.EDAD_MAXIMA);

    private static final int EDAD_MAXIMA = 100;
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
}
