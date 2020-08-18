
package VISTA;

import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import VISTA.Vista;

public class DatosInsertar extends javax.swing.JFrame {

  
    public DatosInsertar() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("REGISTRO NUEVO");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonINSERTAR2 = new javax.swing.JButton();
        jTextFieldCUENTA = new javax.swing.JTextField();
        jTextFieldCARRERA = new javax.swing.JTextField();
        jTextFieldPROM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaVista = new javax.swing.JTextArea();
        jButtonINICIO = new javax.swing.JButton();
        jTextFieldAP = new javax.swing.JTextField();
        jTextFieldAM = new javax.swing.JTextField();
        jTextFieldNOM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonINSERTAR2.setBackground(new java.awt.Color(255, 0, 0));
        jButtonINSERTAR2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonINSERTAR2.setText("INSERTAR");
        jButtonINSERTAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINSERTAR2ActionPerformed(evt);
            }
        });

        jTextFieldCUENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCUENTAActionPerformed(evt);
            }
        });
        jTextFieldCUENTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCUENTAKeyTyped(evt);
            }
        });

        jTextFieldCARRERA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCARRERAActionPerformed(evt);
            }
        });

        jTextFieldPROM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPROMActionPerformed(evt);
            }
        });
        jTextFieldPROM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPROMKeyTyped(evt);
            }
        });

        jLabel1.setText("ID-Cliente");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("APELLIDO PATERNO");

        jLabel4.setText("APELLIDO MATERNO");

        jLabel5.setText("Numero de Horas");

        jLabel6.setText("Sueldo");

        jTextAreaVista.setColumns(20);
        jTextAreaVista.setRows(5);
        jScrollPane1.setViewportView(jTextAreaVista);

        jButtonINICIO.setBackground(new java.awt.Color(102, 255, 255));
        jButtonINICIO.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonINICIO.setText("INICIO");
        jButtonINICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINICIOActionPerformed(evt);
            }
        });

        jTextFieldAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAPActionPerformed(evt);
            }
        });

        jTextFieldAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAMActionPerformed(evt);
            }
        });

        jTextFieldNOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNOMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldAP)
                    .addComponent(jTextFieldCUENTA, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jTextFieldCARRERA, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jTextFieldPROM, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jTextFieldAM)
                    .addComponent(jTextFieldNOM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonINSERTAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonINICIO)
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButtonINICIO)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCUENTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2))
                    .addComponent(jTextFieldNOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonINSERTAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldCARRERA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPROM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCUENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCUENTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCUENTAActionPerformed

    private void jTextFieldPROMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPROMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPROMActionPerformed

    private void jButtonINICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINICIOActionPerformed
        Vista vis= new Vista();
        vis.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonINICIOActionPerformed

    private void jButtonINSERTAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINSERTAR2ActionPerformed
         Vista vis= new Vista();
        
        String cuenta;
       cuenta= this.jTextFieldCUENTA.getText();
     
       String nombre;
       nombre= this.jTextFieldNOM.getText();
       String ap;
       ap= this.jTextFieldAP.getText();
       String am;
       am= this.jTextFieldAM.getText();
       String car;
       car= this.jTextFieldCARRERA.getText();
       String prom;
       prom= this.jTextFieldPROM.getText();
       
       
       
    File origen= new File(Vista.ruta);//"C:\\Users\\fcojsolares\\Desktop\\prueba\\RegistrosNuevos.dat"
    
    try{
     File infile= new File(Vista.ruta);//"C:\\Users\\fcojsolares\\Desktop\\prueba\\Registros.txt"
     BufferedReader reader= new BufferedReader(new FileReader(infile));
     String busqueda=cuenta;        //"9814635";//Clave a buscar dentro del txt
     String line="";
     StringTokenizer st;
     int i=0;
     while ((line=reader.readLine())!= null){
         st=new StringTokenizer(line);
         while(st.hasMoreTokens()){
             String str= st.nextToken();
             if(str.equals(busqueda)){
              
                JOptionPane.showMessageDialog(this, "Ese numero de cuenta ya existe");
                 i++;
                 break;
             }
              
         }
     }System.out.println("Numero de registros encontrados:"+i);
     if(i==0){
         String insertar=cuenta+" " + nombre+" " + ap+" " + am+" " + car +" "+ prom;//9814648 PEDRO CHAQUETAS oliveros  lia 6.0
        escribirFichero(origen, insertar);
        jTextAreaVista.setText(insertar);
     }
     reader.close();
    } catch(IOException e){
        System.err.println(e);
        System.exit(1);
    } 
    
    
    
    
    }//GEN-LAST:event_jButtonINSERTAR2ActionPerformed

    private void jTextFieldCARRERAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCARRERAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCARRERAActionPerformed

    private void jTextFieldCUENTAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCUENTAKeyTyped
       
        char validar= evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"INGRESA SOLO NUMEROS" );
            
        }
    }//GEN-LAST:event_jTextFieldCUENTAKeyTyped

    private void jTextFieldPROMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPROMKeyTyped
      char validar= evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"INGRESA SOLO NUMEROS" );
            
        }
    }//GEN-LAST:event_jTextFieldPROMKeyTyped

    private void jTextFieldAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAPActionPerformed

    private void jTextFieldNOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNOMActionPerformed

    private void jTextFieldAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAMActionPerformed

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
            java.util.logging.Logger.getLogger(DatosInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosInsertar().setVisible(true);
            }
        });
    }
static void escribirFichero(File origen, String insertar){
    try{
        //si no existe el fichero lo crea
        if(!origen.exists()){
            origen.createNewFile();
        }
        /* abre un flujo de escritura sobre el fichero con codificacion utf-8 
        ademas  en el pedazo sentencial "FileOutputStream(Ffichero, true)",
        true es por si existe el fichero seguir añadiendo texto y no borrar lo que tenia
        */
        
        BufferedWriter Fescribe= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(origen,true),"utf-8"));
        /*
         escribe en el fichero  la cadena que recibe  la funcion.
        el string  "\ r \n significa salto de linea
        */
        Fescribe.write(insertar + "\r\n");
        //cierra el flujo de  escritura 
        Fescribe.close();
       System.out.println("Registro guardado exitosamente");
    }catch( Exception ex){
        //captura un posible error le imprime en pantalla 
    System.out.println(ex.getMessage());
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonINICIO;
    private javax.swing.JButton jButtonINSERTAR2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaVista;
    private javax.swing.JTextField jTextFieldAM;
    private javax.swing.JTextField jTextFieldAP;
    private javax.swing.JTextField jTextFieldCARRERA;
    private javax.swing.JTextField jTextFieldCUENTA;
    private javax.swing.JTextField jTextFieldNOM;
    private javax.swing.JTextField jTextFieldPROM;
    // End of variables declaration//GEN-END:variables
}
