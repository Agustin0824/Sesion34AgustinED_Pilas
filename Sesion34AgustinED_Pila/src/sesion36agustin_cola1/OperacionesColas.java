//clase para logica de negocio - Programación contiene los metodos de operaciones de las colas
package sesion36agustin_cola1;

import javax.swing.JOptionPane;


public class OperacionesColas {//inicia clase
    //Atributos y caracterisitcas de las colas principales
    private int frente;
    private int fin;
    protected Object[] listaCola;
    //constructor que inicializa los componentes principales de las colas
    public OperacionesColas(int tamMax) {
        this.frente = 0;
        this.fin = -1;
        listaCola = new Object[tamMax];
    }//termina constructor
    
    //metodo para insertar los elementos de la estructura de la cola
    public void insertar(Object dato) throws Exception{
        if (!colaLlena()) {
            fin++;
            listaCola[fin] = dato;
        } else {
            JOptionPane.showMessageDialog(null, "\nError 1 al insertar : Cola llena");
        }//termina metodo para insertar
        
    }
    
    //metodo para identificar cola llena 
    public boolean colaLlena(){
        int tamMax = 0;
        return fin == tamMax - 1;
    }//termina metodo para identificar cola llena
    
    //tamaño de la ED cola
    public int tamMax(){
        return listaCola.length;
    }//termina tamaño de la ED cola
    
    //metodo para imprimir elementos de la cola
    public void imprimir(){
        for (int i = 0; i < tamMax(); i++) {
            Object datoActual = listaCola[i];
            
            if (datoActual != null) {
                JOptionPane.showMessageDialog(null, datoActual+ "    :    ");
            }
        }
    }//termina metodo para imprimir elementos de la cola
    
}//termina clase
