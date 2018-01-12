import java.util.ArrayList;
/** 
 * Cabecera: luis
 * Atributos: Gian carlo
 * Constructor: Aitor
 * mostrarTareasNumeradas: Samuel
 * agregarTarea: Omar
 * marcarTareaComoCompletada: Cristian
 **/

public class Todoist2{

    private ArrayList<Tarea> listaDeTareas; 

    /**
     * Constructor de la clase Todoist2
     */
    public Todoist2(){
        listaDeTareas = new ArrayList<Tarea>();
    }

    /**
     * Mostrar tareas numeradasif
     */
    public void mostrarTareasNumeradas()
    {
        int posicionTareaActual = 0;
        while (posicionTareaActual < listaDeTareas.size()) {
            System.out.println((posicionTareaActual+1) + ". " + listaDeTareas.get(posicionTareaActual).getDatosTarea());
            posicionTareaActual++;
        }
    }

    /**
     * Añade una tarea
     */
    public void addTarea(String tarea)
    {
        Tarea nuevaTarea = new Tarea(tarea);
        listaDeTareas.add(nuevaTarea);

    }

    /**
     * Marca como completada la tarea indicada como parametro. Por ejemplo,
     * si el parámetro es 0 marca como completada la primera tarea, si es 1 la
     * segunda, etc.
     */
    public void marcarComoCompletada(int indiceTarea)
    {
        Tarea tareaActual = listaDeTareas.get(indiceTarea);
        tareaActual.tareaCompletada();
    }
    
    /**
     * Cambia la prioridad de la tarea indicada.Por ejemplo,
     * si el parámetro es 0 cambia la prioridad de la primera tarea, si es 1 la
     * segunda, etc. Si el usuario indica una posicion no válida, el metodo no
     * hace nada.
     */
    public void cambiarPrioridad(int indiceTarea,int nuevaPrioridad)
    {
        if(indiceTarea>=0 && indiceTarea<listaDeTareas.size()) {
            Tarea tareaActual = listaDeTareas.get(indiceTarea);
            tareaActual.setPrioridad(nuevaPrioridad);
        }
    }
    
    
    /**
     * Imprime todos los datos de la tarea con mayor prioridad. Si hay empate,
     * imprime la última encontrada. Si no hay tareas no imprime nada.
     */
    public void imprimirTareaMasPrioritaria(){
        if(listaDeTareas.size()>0) {
            Tarea tareaPrioridadMaxima = listaDeTareas.get(0);

            for(Tarea tareaActual : listaDeTareas) {
                if(tareaActual.getPrioridad() >= tareaPrioridadMaxima.getPrioridad()){
                    tareaPrioridadMaxima = tareaActual;

                }
            }
            System.out.println(tareaPrioridadMaxima.getDatosTarea());
        }
    }

}



