import java.time.LocalDate;
/**
 * Crea un objeto que almacena una tarea y su estado (completada o no).
 * 
 * @author 1ºDAM 2017/2018
 * @version 10/11/2018
 */

public class Tarea 
{
    private String descripcion;
    // El estado de la tarea: True: Completada; False: No Completada. 
    private boolean estado;
    private int prioridad;
    private LocalDate fechaTope;
    
/**
     * Constructor de la clase Tarea.
     * @param descripcion La descripción de la tarea
     * Sergio
     */
    public Tarea(String descripcion)
    {
        this.descripcion = descripcion;
        estado = false;
        prioridad = 1;
        fechaTope = null;
    }

    /**
     * Devuelve si el estado es true o false.
     */
    public boolean getEstado()
    {
        return estado;  
    }

    /**
     * Devuelve la descripción de la tarea.
     */
    public String getDescripcion()
    {
        return descripcion;
    }

    /**
     * Devuelve toda la informacion de la tarea en formato String
     */
    public String getDatosTarea()
    {
        String aDevolver = descripcion + " Prioridad: " + prioridad;
        if (estado) {
            aDevolver = "[X] " + aDevolver ;
        }
        else {
            aDevolver = "[ ] " + aDevolver ;
        }
        if (fechaTope != null) {
            aDevolver = aDevolver + " Fecha tope: " + fechaTope;
        }
        return aDevolver; 
    }

    
    
    /**
     * Metodos setter
     * Javier y Jorge
     */
    public void tareaCompletada() {
        estado = true;
    }
    
    /**
     * Cambia la prioridad de la tarea al valor indicado. Si no es un valor legal,
     * la prioridad se queda como esta.
     */
    public void setPrioridad(int prioridad){
        if (prioridad >= 1 && prioridad <= 5){
            this.prioridad = prioridad; 
        }
    }
    
    
    /**
     * Devuelve la prioridad de la tarea
     */
    public int getPrioridad()
    {
        return prioridad;
    }
    
    /**
     * Fija la fecha tope de la tarea
     */
    public void fijarFechaVencimiento(int dia, int mes, int ano) 
    {
        fechaTope = LocalDate.of(ano, mes, dia);
    }
    
    
    /**
     * Devuelve la fecha tope
     */
    public LocalDate getFechaTope() 
    {
        return fechaTope;
    }

}

  




