import java.util.ArrayList;


/**
 * Clase que permite almacenar las tareas pendientes que tenemos por hacer.
 */
class Todoist 
{
    
    // Almacena nuestras tareas
    private ArrayList<String> tareas; 

    /**
     * Constructor de la clase Todoist. Crea un gestor con las 3 tareas vacías.
     */
    public Todoist()
    {
        tareas = new ArrayList<String>();
    }
    
    
    /**
     * Inserta una nueva tarea
     */
    public void addTarea(String nombreTarea)
    {
        tareas.add(nombreTarea);
    }
    
    
    /**
     * Muestra por pantalla todas las tareas existentes
     */
    
    public void mostrarTareas()
    {
        System.out.println("Tareas existentes:");
        System.out.println(tareas);
    }
    
    
    /**
     * Devuelve el numero de tareas pendientes
     */     
    public int getNumeroDeTareasPendientes()
    {
      return tareas.size(); 
    }
    
    
    /**
     * Imprime por pantalla el numero de tareas pendientes
     */
    public void mostrarNumeroTareasPendientes()
    {
        System.out.println(tareas.size());
    }
    
    
    /** 
     * Elimina la tarea que ocupa la posicion indicada como
     * parametro (empezando en 0). Devuelve true si la tarea existe y se elimina,
     * false en caso contrario
     */
    public boolean eliminarTarea(int posicionTarea) 
    {
        boolean valorADevolver = false;
        if(esValidoElIndice(posicionTarea)){
            tareas.remove(posicionTarea);
            valorADevolver = true;
        }
        return valorADevolver;
    }
    
    
    /**
     * Metodo que comprueba si una posicion es valida y devuelve true
     * en caso afirmativo o false en otro caso.
     */
    public boolean esValidoElIndice(int indice) 
    {
        return (indice >= 0 && indice < tareas.size());
    }
    
    /**
     * Metodo que devuelve true en caso de que haya tareas por hacer, false
     * en otro caso
     */    
    public boolean hayTareasPendientes(){
        return (getNumeroDeTareasPendientes() > 0);
    }
}

