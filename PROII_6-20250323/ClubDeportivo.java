package [especificarPaquete];

public class ClubDeportivo {
    private Deportista[] deportistas;
    private int numDeportistas;
 
    /** Nuevo Club Deportivo con un número máximo de deportistas
     * @param maxDeportistas el número máximo de deportistas, como entero
     */
    public ClubDeportivo(int maxDeportistas)
    {
        // completar
    }
 
    /**
     * Devuelve el deportista de la posición pos
     * @param pos la posición en el vector de deportistas
     * @return el objeto Deportista correspondiente
     */
    public Deportista getDeportista(int pos)
    {
        // completar
    }
    
 
    /** Devuelve el número de deportistas creados
     * @return el número de deportistas disponibles en el vector, como entero
     */
    public int getNumDeportistas()
    {
        // completar
    }
 
    /** Devuelve el máximo de deportistas
     * @return el número de deportistas máximo, como entero
     */
    public int getMaxDeportistas()
    {
        // completar
    }
 
    /** Inserta un nuevo deportista
     * @param d el nuevo objeto deportista
     */
    public void insertaDeportista(Deportista d)
    {
        // completar
    }    
    
    
    
    /** Devuelve la información de los deportistas del club deportivo
     * @return como string
     */
    public String toString() 
    {
        StringBuilder toret = new StringBuilder();
 
        if (getNumDeportistas() == 0) {
            toret.append("El club no tiene deportistas");
        } else {
            for (int i = 0 ; i<getNumDeportistas() ; ++i) {
                toret.append("\nDeportista: ").append((i + 1));
                toret.append(deportistas[i].toString()).append("\n");
            }
        }
        return toret.toString();
    }
}