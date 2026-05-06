package com.mycompany.segundoparcial;

public class Libro {

    private String titulo;
    private String autor;
    private int anio;
    private Genero genero;
    private boolean prestado;
    private Entrada en;

    public Libro(String titulo, String autor, int anio, Genero genero, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.genero = genero;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public Genero getGenero() {
        return genero;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Libro leerLibro() {
        Libro libro = null;
        
        System.out.println("Introduzca datos del libro:");
        libro.titulo = en.leerCadena("\nTitulo: ");
        libro.autor = en.leerCadena("\nAutor: ");
        libro.anio = en.leerEntero("\nAño: ");
        int gen;
        do {
            gen = en.leerEntero("\nGenero (1 para Ficcion, 2 para no ficcion, "
                    + "3 para poesia, 4 para biografia, 5 para ciencia, 6 para tecnologia):");
            switch (gen) {
                case 1 ->
                    libro.genero = Genero.FICCION;
                case 2 ->
                    libro.genero = Genero.NO_FICCION;
                case 3 ->
                    libro.genero = Genero.POESIA;
                case 4 ->
                    libro.genero = Genero.BIOGRAFIA;
                case 5 ->
                    libro.genero = Genero.CIENCIA;
                case 6 ->
                    libro.genero = Genero.TECNOLOGIA;
                default ->
                    System.err.println("Valor erroneo");
            }

        } while (gen < 1 && gen > 6);

        int pres;
        do {
            pres = en.leerEntero("\nPrestado");

            switch (pres) {
                case 1:
                    libro.prestado = true;
                    break;
                case 0:
                    libro.prestado = false;
                    break;
                default:
                    System.err.println("Valor erroneo");
                    break;
            }
        } while (pres != 1 && pres != 0);
        
        return libro;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar() throws LibroYaPrestadoException {
        if (!prestado) {
            prestado = true;
        } else {
            throw new LibroYaPrestadoException("Ya esta prestado");
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
        } else {
            System.out.println("No esta prestado");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Libro: \nTitulo: ").append(titulo).append("\nAutor: ");
        sb.append(autor).append("\nAño: ").append(anio).append("\n").append(genero);
        sb.append("\nPrestado: ");
        if (prestado) {
            sb.append("Si");
        } else {
            sb.append("No");
        }

        return sb.toString();
    }

}
