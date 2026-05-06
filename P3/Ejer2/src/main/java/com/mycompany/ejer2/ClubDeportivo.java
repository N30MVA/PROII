package com.mycompany.ejer2;

public class ClubDeportivo {

    private Deportista[] deportistas;
    private Entrada entrada;
    private int numMaxDeportistas;
    private int numDeportistas;

    public ClubDeportivo(int numMaxDeportistas) {
        this.numMaxDeportistas = numMaxDeportistas;
        this.deportistas = new Deportista[numMaxDeportistas];
        this.entrada = new Entrada();
        this.numDeportistas = 0;
    }

    public int getNumDeportistas() {
        return numDeportistas;
    }

    public void anadirDeportista() {
        if (numDeportistas >= numMaxDeportistas) {
            System.out.println("No hay espacio libre");
            return;
        }
        String dni = "";
        int edad = 0;
        Categoria cat = null;
                
        do {
            try {
                dni = entrada.leerCadena("\tEscribe el dni: ");
                Deportista.validarDni(dni);
            } catch (IllegalArgumentException iae) {
                System.err.println("ERROR: dni no valido");
                dni = "";
            }
        } while (dni.contentEquals(""));        

        String nombre = entrada.leerCadena("\tEscribe el nombre: ");
        try{
            edad = entrada.leerEntero("\tEscribe la edad: ");
            cat = entrada.leerCategoria(edad);
        }catch (NumberFormatException nfe) {
            System.err.println("\tInutil de mierda no distingues los colores de los numeros");
        }catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
        }
        
        if (cat == null) {
            System.out.println("\tEdad fuera de rango para una categoría válida.");
            return;
        }

        Deportista deportista = new Deportista(nombre, dni, edad, cat);
        deportistas[numDeportistas++] = deportista;
    }

    public void obtenerDeportista(int pos) {
        if (pos >= 0 && pos < numDeportistas) {
            System.out.println(deportistas[pos]);
        } else {
            System.out.println("Error, la posición no está guardada");
        }
    }

    public void obtenerDeportista() {
        obtenerDeportista(entrada.leerEntero("\tIntroduzca posición del deportista: "));
    }

    public int numDeportistas() {
        return numDeportistas;
    }

    public int capacidadMaxima() {
        return numMaxDeportistas;
    }

    public void mostrarDeportistas() {
        if (numDeportistas == 0) {
            System.out.println("No hay deportistas en el club.");
        } else {
            for (int i = 0; i < numDeportistas; i++) {
                System.out.println(deportistas[i]);
            }
        }
    }

    public void eliminarDeportistaPos() {
        if (numDeportistas == 0) {
            System.out.println("\tNo hay deportistas en el club");
        } else {
            int posicion = entrada.leerEntero("\tIntroduzca la posición del deportista a eliminar: ");

            if (posicion >= 0 && posicion < numDeportistas) {
                for (int i = posicion; i < numDeportistas - 1; i++) {
                    deportistas[i] = deportistas[i - 1];
                }
                deportistas[--numDeportistas] = null;
                System.out.println("\tDeportista eliminado correctamente.");
            } else {
                System.out.println("\tPosición inválida.");
            }
        }
    }

    public void eliminarDeportistaDNI() {
        if (numDeportistas == 0) {
            System.out.println("\tNo hay deportistas en el club");
        } else {
            String dniBuscado;
            Deportista depor = null;
            dniBuscado = entrada.leerCadena("\tCual es el dni del deportista que quiere borrar?");

            if (depor.validarDni(dniBuscado)) {
                for (int i = 0; i < numDeportistas; i++) {
                    if (dniBuscado.equals(deportistas[i].getDni())) {
                        for (int j = i + 1; j < numDeportistas; j++) {
                            deportistas[i] = deportistas[i - 1];
                        }
                        numDeportistas--;
                    }
                }
            }
        }
    }

    public int sumarEdades() {
        int suma = 0;
        for (int i = 0; i < numDeportistas; i++) {
            suma += deportistas[i].getEdad();
        }
        return suma;
    }

    public void cambiarEdadDeportista() {
        String dni = entrada.leerCadena("\tIntroduzca el DNI del deportista: ");
        for (int i = 0; i < numDeportistas; i++) {
            if (deportistas[i].getDni().equals(dni)) {
                int nuevaEdad = entrada.leerEntero("\tIntroduzca la nueva edad: ");
                Categoria nuevaCategoria = Categoria.obtenerCategoriaPorEdad(nuevaEdad);
                if (nuevaCategoria != null) {
                    deportistas[i].setEdad(nuevaEdad);
                    deportistas[i].setCategoria(nuevaCategoria);
                    System.out.println("\tEdad y categoría actualizadas correctamente.");
                } else {
                    System.out.println("\tEdad fuera de rango para una categoría válida.");
                }
                return;
            }
        }
        System.out.println("\tDeportista no encontrado.");
    }

    public void cambiarCategoriaDeportista() {
        String dni = entrada.leerCadena("\tIntroduzca el DNI del deportista: ");
        for (int i = 0; i < numDeportistas; i++) {
            if (deportistas[i].getDni().equals(dni)) {
                System.out.println("\tCategorías disponibles:");
                for (Categoria c : Categoria.values()) {
                    System.out.println("\t- " + c);
                }
                String nuevaCategoriaStr = entrada.leerCadena("\tIntroduzca la nueva categoría: ").toUpperCase();
                try {
                    Categoria nuevaCategoria = Categoria.valueOf(nuevaCategoriaStr);
                    if (nuevaCategoria.esCorrecta(deportistas[i].getEdad())) {
                        deportistas[i].setCategoria(nuevaCategoria);
                        System.out.println("\tCategoría actualizada correctamente.");
                    } else {
                        System.out.println("\tLa edad del deportista no es válida para esta categoría.");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("\tCategoría no válida.");
                }
                return;
            }
        }
        System.out.println("\tDeportista no encontrado.");
    }

    public void listarCategorias() {
        int cat;
        //Categoria comp;

        do {
            cat = entrada.leerEntero("\tIntroduzca un numero del 1 al 6 para seleccionar una categoria:");
            switch (cat) {
                case 1:
                    for (int i = 0; i < numDeportistas; i++) {
                        if (deportistas[i].getCategoria() == Categoria.BENJAMIN) {
                            System.out.println(deportistas[i]);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < numDeportistas; i++) {
                        if (deportistas[i].getCategoria() == Categoria.ALEVIN) {
                            System.out.println(deportistas[i]);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < numDeportistas; i++) {
                        if (deportistas[i].getCategoria() == Categoria.INFANTIL) {
                            System.out.println(deportistas[i]);
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < numDeportistas; i++) {
                        if (deportistas[i].getCategoria() == Categoria.CADETE) {
                            System.out.println(deportistas[i]);
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < numDeportistas; i++) {
                        if (deportistas[i].getCategoria() == Categoria.JUVENIL) {
                            System.out.println(deportistas[i]);
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < numDeportistas; i++) {
                        if (deportistas[i].getCategoria() == Categoria.SENIOR) {
                            System.out.println(deportistas[i]);
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } while (cat < 6 && cat > 1);
    }
}
