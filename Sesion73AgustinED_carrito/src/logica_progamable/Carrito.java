
package logica_progamable;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import javax.swing.JOptionPane;


public class Carrito {//inicia clase
    //declaracion de estructura de datos dinamica
    private Stack<String> carrito;
    private Map<String, Integer> historialCompras;
    
    //base de conocimiento
    private String [] recomendaciones = {"Leche", "Pan", "Huevo", "Tortilla", "Arroz", "Frijol", "Azucar"};
    
    //constructor inicializar las estructuras de datos dinamicos
    public Carrito() {
        carrito = new Stack<>();
        historialCompras = new HashMap<>();
    }//termina constructor
    
    //Actividades de mantenimiento de informacion
    public void agregarProducto(String producto){//Alta
        carrito.push(producto);
        historialCompras.put(producto, historialCompras.getOrDefault(producto, 0) +1);
        JOptionPane.showMessageDialog(null, "Agregado de producto con exito ");
    }//Alta
}
