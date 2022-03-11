/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_victorvalladares_12141026;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author valla
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        crearTabla();
        cargarArchivo();
    }
    private void cargarArchivo(){
        AdminCarros ac = new AdminCarros ("./carros.cbm");
        ac.cargarArchivo();
        lista = ac.getListaCarros();
        DefaultComboBoxModel modelo
                    = new DefaultComboBoxModel(
                            ac.getListaCarros().toArray());
        cb_corredores.setModel(modelo);
    }
    
    private void crearTabla(){
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Numero", "Nombre", "Distancia"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_distancia = new javax.swing.JLabel();
        bt_comenzar = new javax.swing.JButton();
        bt_pausar = new javax.swing.JButton();
        progress_bar = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        cb_corredores = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        tf_numero = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb_tipo = new javax.swing.JComboBox<>();
        bt_color = new javax.swing.JButton();
        bt_guardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tf_pista = new javax.swing.JTextField();
        tf_distancia = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("PISTA: ");

        label_nombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_nombre.setText("___");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("DISTANCIA:");

        label_distancia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_distancia.setText("___");

        bt_comenzar.setText("Comenzar");
        bt_comenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_comenzarMouseClicked(evt);
            }
        });

        bt_pausar.setText("Pausar");
        bt_pausar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_pausarMouseClicked(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel3.setText("Numero identificador");

        jLabel4.setText("Nommbre del corredor");

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "McQueen", "Convertible", "Nascar" }));

        bt_color.setText("Color");
        bt_color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_colorMouseClicked(evt);
            }
        });

        bt_guardar.setText("Guardar");
        bt_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_guardarMouseClicked(evt);
            }
        });

        jLabel5.setText("Nombre de pista");

        jButton2.setText("Usar Pista");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Reiniciar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel6.setText("Distancia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                        .addComponent(progress_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bt_comenzar)
                            .addGap(30, 30, 30)
                            .addComponent(bt_pausar)
                            .addGap(58, 58, 58)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label_nombre)
                            .addGap(66, 66, 66)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(label_distancia)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(bt_color)
                                .addGap(26, 26, 26)
                                .addComponent(bt_guardar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_corredores, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1)
                                    .addComponent(tf_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(tf_numero))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_distancia, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(tf_pista)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(label_nombre)
                    .addComponent(jLabel2)
                    .addComponent(label_distancia)
                    .addComponent(bt_pausar)
                    .addComponent(bt_comenzar))
                .addGap(18, 18, 18)
                .addComponent(progress_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_corredores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel5)
                    .addComponent(tf_pista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(tf_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_color)
                    .addComponent(bt_guardar)
                    .addComponent(jButton3))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_colorMouseClicked
        color = JColorChooser.showDialog(
                        this, "Seleccione un color", 
                        Color.yellow);
    }//GEN-LAST:event_bt_colorMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        nombre = tf_pista.getText();
        distancia = Integer.parseInt(tf_distancia.getText());
        label_nombre.setText(nombre);
        label_distancia.setText("" + distancia);
        tf_pista.setText("");
        tf_distancia.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void bt_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_guardarMouseClicked
        try{
            String nombre_carro = tf_nombre.getText();
            int num = Integer.parseInt(tf_numero.getText());
            boolean val = true;
            for (Carro c : lista){
                if (num == c.getNumero()){
                    val = false;
                }
            }
            String tipo;
            if (cb_tipo.getSelectedIndex() == 0){
                tipo = "McQueen";
            }else if (cb_tipo.getSelectedIndex() == 1){
                tipo = "Convertible";
            }else {
                tipo = "Nascar";
            }
            if (val == true){
                Carro c = new Carro (nombre_carro, num, color, tipo);

                AdminCarros ac = new AdminCarros ("./carros.cbm");
                ac.cargarArchivo();
                ac.setCarro(c);
                DefaultComboBoxModel modelo
                        = new DefaultComboBoxModel(
                                ac.getListaCarros().toArray());
                cb_corredores.setModel(modelo);
                ac.escribirArchivo();

                JOptionPane.showMessageDialog(null, "Se ha creado el corredor");
                tf_nombre.setText("");
                tf_numero.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Este numero ya existe");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se ha podido crear el corredor");
        }
        
    }//GEN-LAST:event_bt_guardarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Carro carro = (Carro) cb_corredores.getSelectedItem();
        listaTabla.add(carro);
        Object[] newrow = {
            carro.getNumero(),
            carro.getNombre(),
            carro.getDistancia()
        };  
        DefaultTableModel modelo
                    = (DefaultTableModel) tabla.getModel();
        modelo.addRow(newrow);
        tabla.setModel(modelo);
    }//GEN-LAST:event_jButton1MouseClicked

    private void bt_comenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_comenzarMouseClicked
        int pos = 0;
        progress_bar.setMaximum(distancia);
        if (tabla.getSelectedRow() > 0){
            pos = tabla.getSelectedRow();
        }
        Carro carro = lista.get(pos);
        
        //System.out.println(tabla.getRowCount());
        pg = new hiloProgressBar(progress_bar, carro);
        Thread proceso1 = new Thread (pg);
        proceso1.start();
        
        tb = new hiloTabla(listaTabla, tabla, distancia);
        Thread proceso2 = new Thread (tb);
        proceso2.start();
    }//GEN-LAST:event_bt_comenzarMouseClicked

    private void bt_pausarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pausarMouseClicked
        pg.setAvanzar(false);
        tb.setAvanzar(false);
    }//GEN-LAST:event_bt_pausarMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        progress_bar.setValue(0);
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        tabla.setModel(modelo);
        label_nombre.setText("___");
        nombre = "";
        label_distancia.setText("___");
        distancia = 0;
        listaTabla.clear();
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_color;
    private javax.swing.JButton bt_comenzar;
    private javax.swing.JButton bt_guardar;
    private javax.swing.JButton bt_pausar;
    private javax.swing.JComboBox<String> cb_corredores;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_distancia;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JProgressBar progress_bar;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tf_distancia;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_numero;
    private javax.swing.JTextField tf_pista;
    // End of variables declaration//GEN-END:variables
    String nombre = "";
    int distancia;
    ArrayList <Carro> lista = new ArrayList();
    ArrayList <Carro> listaTabla = new ArrayList();
    Color color;
    
    hiloProgressBar pg;
    hiloTabla tb;
}

