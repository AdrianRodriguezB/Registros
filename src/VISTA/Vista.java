
package VISTA;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Vista extends javax.swing.JFrame {

   
    public Vista() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("BUSCADOR DE REGISTROS");
     
    }
    
     
public static String ruta="";
private File fichero = null;
    
   
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonINSERTAR = new javax.swing.JButton();
        jButtonBUSCAR = new javax.swing.JButton();
        jButtonELIMINAR = new javax.swing.JButton();
        jButtonACTUALIZAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldRUTA = new javax.swing.JTextField();
        seleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));

        jButtonINSERTAR.setBackground(new java.awt.Color(0, 255, 51));
        jButtonINSERTAR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonINSERTAR.setText("INSERTAR");
        jButtonINSERTAR.setBorderPainted(false);
        jButtonINSERTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINSERTARActionPerformed(evt);
            }
        });

        jButtonBUSCAR.setBackground(new java.awt.Color(255, 51, 51));
        jButtonBUSCAR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonBUSCAR.setText("BUSCAR");
        jButtonBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBUSCARActionPerformed(evt);
            }
        });

        jButtonELIMINAR.setBackground(new java.awt.Color(255, 255, 0));
        jButtonELIMINAR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonELIMINAR.setText("ELIMINAR");
        jButtonELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonELIMINARActionPerformed(evt);
            }
        });

        jButtonACTUALIZAR.setBackground(new java.awt.Color(51, 153, 255));
        jButtonACTUALIZAR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonACTUALIZAR.setText("ACTUALIZAR");
        jButtonACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonACTUALIZARActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("          Administrador");

        jLabel2.setText("RUTA DEL ARCHIVO");

        jTextFieldRUTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRUTAActionPerformed(evt);
            }
        });

        seleccionar.setText("SELECCIONAR RUTA");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonACTUALIZAR)
                            .addComponent(jButtonELIMINAR)
                            .addComponent(jButtonBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonINSERTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRUTA, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(seleccionar)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRUTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addComponent(jButtonINSERTAR)
                .addGap(40, 40, 40)
                .addComponent(jButtonBUSCAR)
                .addGap(41, 41, 41)
                .addComponent(jButtonELIMINAR)
                .addGap(34, 34, 34)
                .addComponent(jButtonACTUALIZAR)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonINSERTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINSERTARActionPerformed
      DatosInsertar dat= new DatosInsertar();
      dat.setVisible(true);
      ruta=this.jTextFieldRUTA.getText();
    }//GEN-LAST:event_jButtonINSERTARActionPerformed

    private void jButtonBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBUSCARActionPerformed
        Busqueda bus= new Busqueda();
        bus.setVisible(true);
        dispose();
        ruta=this.jTextFieldRUTA.getText();
       
        
    }//GEN-LAST:event_jButtonBUSCARActionPerformed

    private void jButtonELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonELIMINARActionPerformed
        EliminarDatos eli=new EliminarDatos();
        eli.setVisible(true);
        dispose();
        ruta=this.jTextFieldRUTA.getText();
    }//GEN-LAST:event_jButtonELIMINARActionPerformed

    private void jButtonACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonACTUALIZARActionPerformed
        ACTUALIZAR act=new ACTUALIZAR();
        act.setVisible(true);
        dispose();
        ruta=this.jTextFieldRUTA.getText();
    }//GEN-LAST:event_jButtonACTUALIZARActionPerformed

    private void jTextFieldRUTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRUTAActionPerformed
       
    }//GEN-LAST:event_jTextFieldRUTAActionPerformed

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        // TODO add your handling code here:
        JFileChooser eleccion = new JFileChooser();
        eleccion.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        eleccion.setDialogTitle("Escoja la ruta");
        int n = eleccion.showOpenDialog(this);
        if(n == JFileChooser.APPROVE_OPTION){
            fichero = eleccion.getSelectedFile();
            String x = fichero.getAbsolutePath();
            jTextFieldRUTA.setText(x);
        }
    }//GEN-LAST:event_seleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonACTUALIZAR;
    private javax.swing.JButton jButtonBUSCAR;
    private javax.swing.JButton jButtonELIMINAR;
    private javax.swing.JButton jButtonINSERTAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField jTextFieldRUTA;
    private javax.swing.JButton seleccionar;
    // End of variables declaration//GEN-END:variables

    
}
