
package com.mycompany.ejer5;

public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int ano;
    private String isbn;

    public Libro(String titulo, String autor, String editorial, int ano, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.ano = ano;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        StringBuilder toret = new StringBuilder();
        toret.append("Titulo: ").append(titulo);
        toret.append("Autor: ").append(autor);
        toret.append("Editorial: ").append(editorial);
        toret.append("Año: ").append(ano);
        toret.append("ISBN: ").append(isbn);
        return toret.toString();
    }
    
    
}
