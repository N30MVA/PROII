package com.mycompany.bloque2;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class ClubDeportivo {

    private List<Deportista> deportistas;
    private int maxDeportistas;

    public ClubDeportivo(int maxDeportistas) {
        this.deportistas = new ArrayList<>();
        this.maxDeportistas = maxDeportistas;
    }

    public Deportista getDeportista(int pos) {
        if (pos < 0 || pos >= getNumDeportistas()) {
            throw new IllegalArgumentException("Posición inválida");
        }
        return deportistas.get(pos);
    }

    public int getPosDNI(String dni) {
        int pos = 0;
        boolean encontrado = false;
        while (pos < getNumDeportistas() && !encontrado) {
            if (getDeportista(pos).getDni().equals(dni)) {
                encontrado = true;
            } else {
                pos++;
            }
        }
        if (!encontrado) {
            return -1;
        } else {
            return pos;
        }
    }

    public int getNumDeportistas() {
        return deportistas.size();
    }

    public int getMaxDeportistas() {
        return maxDeportistas;
    }

    public void insertaDeportista(Deportista d) {
        final int maxDeportistas = getMaxDeportistas();

        if (getNumDeportistas() >= maxDeportistas) {
            throw new IllegalArgumentException("No caben más deportistas");
        }
        deportistas.add(d);
    }

    public void eliminarDeportista(int pos) {
        if ((pos < 0) || (pos >= getNumDeportistas())) {
            throw new IllegalArgumentException("Posición inválida");
        }
        deportistas.remove(pos);
    }

    //filtra y saca los que sean nadadores
    public List<Deportista> filtrarDeportista(Predicate<Deportista> p) {
        List<Deportista> listaFiltrada = new ArrayList<>();
        deportistas.forEach(dep -> {
            if (p.test(dep)) {
                listaFiltrada.add(dep);
            }
        });
        return listaFiltrada;
    }

    @Override
    public String toString() {
        StringBuilder salida = new StringBuilder();
        if (getNumDeportistas() == 0) {
            salida.append("El club no tiene deportistas");
        } else {
            //forEach lambda
            deportistas.forEach(d -> salida.append("\nDeportista: ").append(deportistas.indexOf(d)).append(d).append("\n"));
            /*forEach java
            for(Deportista d:deportistas){
                salida.append("\nDeportista: ").append(deportistas.indexOf(d)+1);
                salida.append(d).append("\n");
            }*/

 /*for normal
            for (int i = 0 ; i<getNumDeportistas() ; ++i) {
                salida.append("\nDeportista: ").append((i + 1));
                salida.append(deportistas.get(i)).append("\n");
            }*/
        }
        return salida.toString();
    }
}
