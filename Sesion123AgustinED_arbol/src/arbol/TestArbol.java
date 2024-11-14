
package arbol;

import javax.swing.JOptionPane;


public class TestArbol extends javax.swing.JFrame {
    
    public static Nodo raiz;
    
    public TestArbol() {//inicia constructor
        initComponents();
        construirArbol();//lllamada de metodo construir arbol
    }//termina constructor
    
    // Construcción del árbol de decisiones
    private void construirArbol() {
        // Nodo raíz (primera pregunta)
        raiz = new Nodo("¿Te interesa aprender programación?");

        // Nivel 1
        raiz.izquierda = new Nodo("¿Te gustan los lenguajes orientados a objetos?");
        raiz.derecha = new Nodo("¿Te interesa el diseño gráfico y visual?");

        // Nivel 2 - Camino "Sí" de la raíz
        raiz.izquierda.izquierda = new Nodo("Te recomiendo aprender Java o Python.");
        raiz.izquierda.derecha = new Nodo("Tal vez prefieras aprender SQL para manejo de bases de datos.");

        // Nivel 3 - Camino "No" de la raíz
        raiz.derecha.izquierda = new Nodo("Considera aprender HTML y CSS para diseño web.");
        raiz.derecha.derecha = new Nodo("¿Te interesa la inteligencia artificial?");

        // Nivel 4 - Camino "No"->"No"
        raiz.derecha.derecha.izquierda = new Nodo("Te recomiendo explorar Machine Learning con Python.");
        raiz.derecha.derecha.derecha = new Nodo("Tal vez te interese aprender sobre sistemas de redes.");
    }//termina arbol de desiciones
    
    //inicia metodo
    public void iniciarConvesacion() {
        Nodo nodoActual = raiz;
        
        //inicia while
        while (nodoActual.izquierda != null || nodoActual.derecha != null) {            
            JOptionPane.showMessageDialog(null, nodoActual.mensaje);
            String respuesta = JOptionPane.showInputDialog("Escribe 'si' o 'no' ");
            
            if (respuesta.equals("si")) {
                nodoActual = nodoActual.izquierda;
            } else if (respuesta.equals("no")){
                nodoActual = nodoActual.derecha;    
            }else{
                JOptionPane.showMessageDialog(null, "Respuesta no valida\nResponde si o no");
            }
        }//termina while
        
        //imprimir mensaje de recomendaciones mediante IA del arbol
        JOptionPane.showMessageDialog(null, "Chatbot: " +nodoActual.mensaje);      
}//termina metodo

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnArbol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Ejemplo Arbol AGUSTIN");

        btnArbol.setText("Generar Arbol");
        btnArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnArbol)
                        .addGap(147, 147, 147))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitulo)
                .addGap(27, 27, 27)
                .addComponent(btnArbol)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolActionPerformed
        TestArbol arbol1 = new TestArbol();
        JOptionPane.showMessageDialog(null, "Bienvenido al ChatBot Agustin de Programación");
        arbol1.iniciarConvesacion();
    }//GEN-LAST:event_btnArbolActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestArbol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArbol;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
