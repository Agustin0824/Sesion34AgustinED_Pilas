
package sesion34agustined_pila;

import java.util.Stack;
import javax.swing.JOptionPane;


public class Sesion34AgustinED_Pila {

    
    public static void main(String[] args) {
        // Declaración de pila
        Stack<Integer> pilaAgustin = new Stack<>();
        
        pilaAgustin.push(100);
        pilaAgustin.push(150);
        pilaAgustin.push(230);
        pilaAgustin.push(10);
        pilaAgustin.push(160);
        
        JOptionPane.showMessageDialog(null, "Datos de pila ordenada es: \n" +pilaAgustin);
    }
    
}
