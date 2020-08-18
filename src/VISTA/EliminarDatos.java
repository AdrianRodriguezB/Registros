/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import VISTA.Vista;
import javax.swing.JOptionPane;

/**
 *
 * @author fcojsolares
 */
public class EliminarDatos extends javax.swing.JFrame {

    /**
     * Creates new form EliminarDatos
     */
    public EliminarDatos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("ELIMINAR DATOS");
    }
 
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonELIMINAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCUENTa = new javax.swing.JTextField();
        jButtonINICIO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonELIMINAR.setBackground(new java.awt.Color(204, 0, 102));
        jButtonELIMINAR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonELIMINAR.setText("ELIMINAR");
        jButtonELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonELIMINARActionPerformed(evt);
            }
        });
        jButtonELIMINAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButtonELIMINARKeyTyped(evt);
            }
        });

        jLabel1.setText("ID-Cliente");

        jTextFieldCUENTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCUENTaActionPerformed(evt);
            }
        });
        jTextFieldCUENTa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCUENTaKeyTyped(evt);
            }
        });

        jButtonINICIO.setBackground(new java.awt.Color(102, 255, 255));
        jButtonINICIO.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonINICIO.setText("INICIO");
        jButtonINICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINICIOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCUENTa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonINICIO)
                            .addComponent(jButtonELIMINAR))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCUENTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButtonELIMINAR)
                .addGap(43, 43, 43)
                .addComponent(jButtonINICIO)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonELIMINARActionPerformed
        Vista vis= new Vista();
        String cuentas;
        int i=0;
cuentas=this.jTextFieldCUENTa.getText();
       
            String file =Vista.ruta;
           String cuenta =cuentas;
            try{
                File inFile= new File(file);
                if(!inFile.isFile()){
                    System.out.println("parametro no es un archivo");
                    return;
                }
                File tempFile = new File(inFile.getAbsolutePath()+".tmp");
                BufferedReader br=new BufferedReader(new FileReader(file));
                PrintWriter pw =new PrintWriter(new FileWriter(tempFile));
            String line ="";
            StringTokenizer st;
            while((line=br.readLine())!=null){
               st = new StringTokenizer(line);
               while(st.hasMoreTokens()){
                   String str = st.nextToken();
                   if(!str.trim().equals(cuenta)){
                       pw.println(line);
                        
                       
                       break;
                   }else{
                       break;
                   }
                   
               }
              
            }
             JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO");
          
            pw.close(); 
            br.close();
            if(!inFile.delete()){
                System.out.println("no se pudo");
                return;
            }
            if(!tempFile.renameTo(inFile))
                    System.out.println("cambiar el nnombre");
            }
            catch(FileNotFoundException ex){
                ex.printStackTrace();
            }
            catch(IOException ex){
                ex.printStackTrace();;
            }
//         if( i==0){
//         System.out.println("registro no encontrado");
//         JOptionPane.showMessageDialog(this, "No se encuentra ese numero de cuenta");
//     }else{
//              JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO");
//         }
        removeLineFromFile();
        
    }//GEN-LAST:event_jButtonELIMINARActionPerformed

    private void jTextFieldCUENTaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCUENTaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCUENTaActionPerformed

    private void jButtonELIMINARKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonELIMINARKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonELIMINARKeyTyped

    private void jTextFieldCUENTaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCUENTaKeyTyped
        // TODO add your handling code here:
        char validar= evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"INGRESA SOLO NUMEROS" );
            
        }
    }//GEN-LAST:event_jTextFieldCUENTaKeyTyped

    private void jButtonINICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINICIOActionPerformed
        Vista vis= new Vista();
        vis.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonINICIOActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarDatos().setVisible(true);
            }
        });
    }
 
           
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonELIMINAR;
    private javax.swing.JButton jButtonINICIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldCUENTa;
    // End of variables declaration//GEN-END:variables

    private void removeLineFromFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
