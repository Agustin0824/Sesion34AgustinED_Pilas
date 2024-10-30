
package sesion35agustinED_pila2;

import java.util.Stack;
import javax.swing.JOptionPane;

public class TestLibroPila extends javax.swing.JFrame {
    //declaración de pila libros
    Stack<Libro> pila = new Stack<Libro>();
    
    Libro libro1 = new Libro("Ceballos", "C++", 2024, "Ed. RAMA");
    Libro libro2 = new Libro("Deitel", "Java", 2023, "Ed. Mc Graw Hill");
    Libro libro3 = new Libro("Grossman", "Angular", 2024, "Ed. Planeta");
    Libro libro4 = new Libro("Ceballos", "C", 2024, "Ed. RAMA");
    Libro libro5 = new Libro("Garcia", "Android", 2023, "Ed. Trillas");
    
    
    public TestLibroPila() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panLibreria = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnConsultarLibro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panLibreria.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setText("Operaciones Libros Biblioteca AGUSTIN");

        btnConsultarLibro.setText("Consultar Libros");
        btnConsultarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLibreriaLayout = new javax.swing.GroupLayout(panLibreria);
        panLibreria.setLayout(panLibreriaLayout);
        panLibreriaLayout.setHorizontalGroup(
            panLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLibreriaLayout.createSequentialGroup()
                .addGroup(panLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panLibreriaLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(lblTitulo))
                    .addGroup(panLibreriaLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(btnConsultarLibro)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        panLibreriaLayout.setVerticalGroup(
            panLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLibreriaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarLibro)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarLibroActionPerformed
        //Agregar informacion de libros
        pila.push(libro1);
        pila.push(libro2);
        pila.push(libro3);
        pila.push(libro4);
        pila.push(libro5);
        
        //imprimir información de libros (en la pila)
       
        
        while (!pila.isEmpty()) {//inicia while
            JOptionPane.showMessageDialog(null, "DATOS DE LIBROS"
                                                +"\n Autor: " +pila.peek().getAutor()
                                                +"\n Titulo: " +pila.peek().getTitulo()
                                                +"\n Fecha publicación: " +pila.peek().getAnio()
                                                +"\n Editorial: " +pila.peek().getEditorial());
            pila.pop();//ultimo elemento de la pila
        }//termina while
              
    }//GEN-LAST:event_btnConsultarLibroActionPerformed

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
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestLibroPila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarLibro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panLibreria;
    // End of variables declaration//GEN-END:variables
}
