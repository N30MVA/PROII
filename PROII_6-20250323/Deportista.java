package [especificarPaquete];

public class Deportista {
    private final String dni;
    private final String nombre;
    private Categoria categoria;
    private int edad;
 
    /** crea un deportista, asignando su dni, nombre, categoría y edad
     * @param dni, el DNI como String
     * @param nombre, el nombre como String
     * @param categoria, la categoria como un enumerado Categoria
     * @param edad, la edad como un int
     */
    public Deportista(String dni, String nombre, Categoria categoria, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        setCategoria(categoria);
        setEdad(edad);
    }
 
    /** Devuelve el dni del deportista
     *  @return el dni como String
    */
    public String getDni() {
        return dni;
    }
 
    /** Devuelve el nombre del deportista
     *  @return el nombre como String
    */
    public String getNombre() {
        return nombre;
    }
 
    /** Devuelve la categoría del deportista
     *  @return la categoría como enum Categoria
    */
    public Categoria getCategoria() {
        return categoria;
    }
    
    /** Devuelve la edad del deportista
     *  @return la edad como int
    */
    public int getEdad() {
        return edad;
    }

    /** modifica la edad de un deportista, comprobando que esta en rango
     * @param edad 
     */
    public void setEdad(int edad) {
        // completar
    }
    
   
    /** Modifica la categoría de un deportista
     * @param categoria 
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    /** Devuelve la información de un deportista como un String
     * @return String
     */
    public String toString() {
        StringBuilder toret = new StringBuilder();
        
        toret.append("\nNombre: ").append(getNombre());
        toret.append("\nDNI: ").append(getDni());
        toret.append("\nEdad: ").append(getEdad()).append(" años");
        toret.append("\nCategoría: ").append(getCategoria().toString().toLowerCase());
               
        return toret.toString();
    }	 
}
