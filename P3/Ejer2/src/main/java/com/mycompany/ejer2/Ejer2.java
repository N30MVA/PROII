package com.mycompany.ejer2;

public class Ejer2 {

    public static void main(String[] args) {
        Entrada en = new Entrada();
        int opc = 0;
        int pos;
        ClubDeportivo miclub;
        int maxDeportistas = 0;

        do {
            try{
                maxDeportistas = en.leerEntero("Cuantos deportistas como maximo"
                    + " va a tener el club: ");
            }catch (IllegalArgumentException iae) {
                System.err.println("que va vuta ibai llanos en el referendum de l'independencia de catalunya");
            }
        } while (maxDeportistas <= 0);
        miclub = new ClubDeportivo(maxDeportistas);

        do {
            try {
                opc = menu();
                switch (opc) {
                    case 1:
                        miclub.anadirDeportista();
                        break;
                    case 2:
                        miclub.mostrarDeportistas();
                        break;
                    case 3:
                        System.out.println(miclub.numDeportistas());
                        break;
                    case 4:
                        System.out.println(miclub.capacidadMaxima());
                        break;
                    case 5:
                        miclub.mostrarDeportistas();
                        break;
                    case 6:
                        miclub.eliminarDeportistaPos();
                        break;
                    case 7:
                        miclub.eliminarDeportistaDNI();
                        break;
                    case 8:
                        System.out.println("La suma de las edades de los"
                                + " deportistas es :" + miclub.sumarEdades());
                        break;
                    case 9:
                        miclub.cambiarEdadDeportista();
                        break;
                    case 10:
                        miclub.cambiarCategoriaDeportista();
                        break;
                    case 11:
                        miclub.listarCategorias();
                        break;
                }
            } catch (NumberFormatException exc) {
                System.err.println("Error. Formato numérico no válido.");
            } catch (IllegalArgumentException exc) {
                System.err.println("Error Argumento ilegal. "
                        + exc.getMessage());
            }
        } while (opc != 0);

    }

    private static int menu() {
        int opc = -1;
        Entrada en = new Entrada();
        do {

            System.out.println("MENU");
            System.out.println("1. Insertar deportista (Comprobar previamente que no exista ya).");
            System.out.println("2. Obtener los datos de un deportista");
            System.out.println("3. Saber cuantos deportistas tiene el club");
            System.out.println("4. Saber el numero maximo de deportistas "
                    + "que puede tener el club");
            System.out.println("5. Listar deportistas");
            System.out.println("6. Eliminar un deportista por su posicion");
            System.out.println("7. Eliminar deportista por DNI");
            System.out.println("8. Sumar las edades de todos los deportistas");
            System.out.println("9. Cambiar la edad de un deportista");
            System.out.println("10. Cambiar la categoría de un deportista");
            System.out.println("11. Listar los deportistas de una categoria");
            System.out.println("0. Salir");
            try {
                opc = en.leerEntero("\tIntroduce opcion: ");
            } catch (NumberFormatException ex) {
                System.err.println("Error chivatil");
            }
        } while ((opc < 0) || (opc > 11));

        return opc;
    }
}
