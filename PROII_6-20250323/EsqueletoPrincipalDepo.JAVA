public class EsqueletoPrincipalDeportista {

        public static void main(String[] args) {
        int opc = 0;
        int pos;
        Club miclub;
        int maxDeportistas;

        do {
            maxDeportistas = leerEntero("Cuantos deportistas como maximo"
                    + " va a tener el club: ");
        } while (maxDeportistas <= 0);
        miclub = new Club(maxDeportistas);

        do {
            try {
                opc = menu();
                switch (opc) {
                    case 1:
                        //Insertar Deportista
                        break;
                    case 2:
                        //Datos por posicion
                        break;
                    case 3:
                        //Número de deportistas
                        break;
                    case 4:
                        //Número máximo deportistas
                        break;
                    case 5:
                        // Listar Deportistas
                        break;
                    case 6:
                       //Eliminar deportista por posición
                        break;
                    case 7:
                       //Eliminar deportista por dni
                        break;
                        //......RESTO OPCIONES
                }
            } catch (NumberFormatException exc) {
                System.err.println("Error. Formato numérico no válido.");
            } catch (IllegalArgumentException exc) {
                System.err.println("Error Argumento ilegal. "
                        + exc.getMessage());
            }
        } while (opc != 0);

    }

    private static Deportista leerDeportista() {
        String dni;
        String nombre;
        TipoCategoria categoria;
        int edad;
        Deportista d = null;

        do {
            try {
                
                dni = leerCadena("Introduce DNI: ", false);
                nombre = leerCadena("Introduce nombre: ", false);
                categoria = leerCategoria();
                edad = leerEntero("Introduce edad: ");
                d = new Deportista(dni, nombre, categoria, edad);
                
            } catch (NumberFormatException exc) {
                System.err.println("Error. Formato numérico no válido.");
            } catch (IllegalArgumentException exc) {
                System.err.println("Error. " + exc.getMessage());
            }
        } while (d == null);

        return d;
    }

    private static int menu() {
        int opc;

        do {
            System.out.println("MENU");
            System.out.println("1. Insertar deportista (Comprobar previamente que no exista ya).");
            System.out.println("2. Obtener los datos de un deportista");
            System.out.println("3. Saber cuandos deportista tiene el club");
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
            opc = leerEntero("\tIntroduce opcion: ");
        } while ((opc < 0) || (opc > 8));

        return opc;
    }
}
