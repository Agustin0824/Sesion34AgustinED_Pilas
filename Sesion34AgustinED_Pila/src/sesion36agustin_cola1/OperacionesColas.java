//clase para logica de negocio - Programación contiene los metodos de operaciones de las colas
package sesion36agustin_cola1;

import javax.swing.JOptionPane;


public class OperacionesColas {//inicia clase
    //Estructura inicial y final de la ED cola
    private int frente;
    private int fin;
    protected Object[] listaCola;
    
    public OperacionesColas(int tamMax) {//constructor que pasa parametros inicio y fin de la cola
        frente = 0;
        fin = -1;
        listaCola = new Object[tamMax];
                JOptionPane.showMessageDialog(null, "Operaciones colas");
    }//constructor indica  y autoriza quien va al frente y al fin de la cola
       
    public void insertar(Object dato) throws Exception {//inicial el metodo para insertar nuevos elementos
        if (!colaLlena()) {
            fin++;
            listaCola[fin] = dato;
                        JOptionPane.showMessageDialog(null, "Insertar ");
        } else {
            throw new Exception("Error en la cola: Cola LLena");
        }
    }// termina para insertar
    
        public int tamMax() {//determina el tamaño de los elementos de la ED cola
            return listaCola.length;
        }//termina metodo para el numero de elementos

        public boolean colaLlena() {//metodo que indica que la cola esta llena
            return fin == tamMax() - 1;
        }//termina metodo que indica que la cola esta llena
        
        public boolean colaVacia() {//metodo que indica que la cola esta vacia
            return frente > fin;
        }
        
        public void imprimir() {//metodo para imprimir
            for (int i = 0; i < tamMax(); i++) {
                Object datoActual = listaCola[i];

                if (datoActual != null) {
                     JOptionPane.showMessageDialog(null, "Cola esta LLena de valores : \n"+(datoActual)+ ", ");
                }
            }
        }
       
       
        public int contarDatos() {//inicia metodo contar datos
        int contador = 0;

        for (int i = 0; i < tamMax(); i++) {
            if (listaCola[i] != null) {
                contador++;
            }
        }

        return contador;
        }
}//termina clase
