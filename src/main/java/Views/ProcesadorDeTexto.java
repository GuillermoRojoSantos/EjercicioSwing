/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import java.awt.Font;
import java.io.BufferedReader;
import javax.swing.JFileChooser;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color.*;

/**
 *
 * @author guiro
 */
public class ProcesadorDeTexto extends javax.swing.JFrame {

    /**
     * Creates new form ProcesadorDeTexto
     */
    public ProcesadorDeTexto() {
        initComponents();
        modalDialog.setLocationRelativeTo(null);
        dialogFuente.setLocationRelativeTo(null);
    }
    
    private float fontSize =12f;
    private final Font arial = new Font("Arial",Font.PLAIN,12);
    private final Font arialBlack = new Font("Arial Black", Font.PLAIN, 12);
    private final Font timesNRoman = new Font("Times New Roman", Font.PLAIN, 12);
    private final Font microsoftHimalaya = new Font("Microsoft Himalaya", Font.PLAIN, 12);
    private final Font comicSans = new Font("Comic Sans MS", Font.PLAIN, 12);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser("C:\\Users\\pc\\Documents");
        modalDialog = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRepo = new javax.swing.JButton();
        dialogFuente = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btnAceptarFuente = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaTamanoFuente = new javax.swing.JList<>();
        comboBoxFuentes = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPrueba = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        jLabel1 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        txtTamaño = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 32767));
        jLabel4 = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaUbi = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        jLabel2 = new javax.swing.JLabel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuAbrir = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MeunGuardar = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnColor = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        modalDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        modalDialog.setTitle("Acerca de...");
        modalDialog.setMinimumSize(new java.awt.Dimension(324, 216));
        modalDialog.setModal(true);
        modalDialog.setPreferredSize(new java.awt.Dimension(324, 216));
        modalDialog.setResizable(false);

        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Program made my Guillermo Rojo Santos");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel7, java.awt.BorderLayout.NORTH);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel5.setText("Version 1.0");
        jPanel8.add(jLabel5, java.awt.BorderLayout.WEST);

        jLabel6.setText("IDE: Apache Netbeans 15");
        jPanel8.add(jLabel6, java.awt.BorderLayout.EAST);

        btnRepo.setText("Repositorio de GutHub");
        btnRepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepoActionPerformed(evt);
            }
        });
        jPanel8.add(btnRepo, java.awt.BorderLayout.SOUTH);

        jPanel4.add(jPanel8, java.awt.BorderLayout.CENTER);

        modalDialog.getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        dialogFuente.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogFuente.setTitle("Fuentes");
        dialogFuente.setMinimumSize(new java.awt.Dimension(507, 346));
        dialogFuente.setModal(true);
        dialogFuente.setPreferredSize(new java.awt.Dimension(507, 346));

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setLayout(new java.awt.BorderLayout());

        btnAceptarFuente.setText("Aceptar");
        btnAceptarFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarFuenteActionPerformed(evt);
            }
        });
        jPanel10.add(btnAceptarFuente, java.awt.BorderLayout.EAST);

        jPanel9.add(jPanel10, java.awt.BorderLayout.SOUTH);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        listaTamanoFuente.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaTamanoFuente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaTamanoFuente.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaTamanoFuenteValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaTamanoFuente);

        jPanel12.add(jScrollPane3);

        comboBoxFuentes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Arial Black", "Times New Roman", "Helvetica", "Comic Sans" }));
        comboBoxFuentes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxFuentesItemStateChanged(evt);
            }
        });
        jPanel12.add(comboBoxFuentes);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txtPrueba.setText("Texto de prueba");
        txtPrueba.setAutoscrolls(false);
        txtPrueba.setFocusable(false);
        txtPrueba.setMinimumSize(new java.awt.Dimension(200, 200));
        txtPrueba.setPreferredSize(new java.awt.Dimension(200, 200));
        txtPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPruebaActionPerformed(evt);
            }
        });
        jScrollPane4.setViewportView(txtPrueba);

        jPanel12.add(jScrollPane4);

        jPanel9.add(jPanel12, java.awt.BorderLayout.CENTER);

        dialogFuente.getContentPane().add(jPanel9, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Procesador de texto");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));
        jPanel3.add(filler1);

        jLabel1.setText("Tamaño");
        jPanel3.add(jLabel1);
        jPanel3.add(filler2);

        txtTamaño.setFocusable(false);
        txtTamaño.setMinimumSize(new java.awt.Dimension(100, 22));
        jPanel3.add(txtTamaño);

        jPanel2.add(jPanel3);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));
        jPanel6.add(filler3);

        jLabel4.setText("Ubicación");
        jPanel6.add(jLabel4);
        jPanel6.add(filler4);

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtAreaUbi.setColumns(20);
        txtAreaUbi.setRows(1);
        txtAreaUbi.setText("No file Selected\n");
        txtAreaUbi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAreaUbi.setFocusable(false);
        jScrollPane2.setViewportView(txtAreaUbi);

        jPanel6.add(jScrollPane2);

        jPanel2.add(jPanel6);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));
        jPanel5.add(filler5);

        jLabel2.setText("Hora");
        jPanel5.add(jLabel2);
        jPanel5.add(filler6);

        rSLabelHora1.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelHora1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel5.add(rSLabelHora1);
        jPanel5.add(filler7);

        jPanel2.add(jPanel5);

        jPanel1.add(jPanel2, java.awt.BorderLayout.SOUTH);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 300));
        jScrollPane1.setViewportView(texto);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        MenuAbrir.setText("Abrir");
        MenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(MenuAbrir);

        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        MeunGuardar.setText("Guardar como...");
        MeunGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeunGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(MeunGuardar);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Acerca de...");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        btnColor.setText("Fuente");
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });
        jMenu2.add(btnColor);

        jMenuItem5.setText("Color");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAbrirActionPerformed
        // TODO add your handling code here:
        int r = fileChooser.showOpenDialog(rootPane);
        
        if (r==JFileChooser.APPROVE_OPTION){
            String direccion = fileChooser.getSelectedFile().getAbsolutePath();
            txtAreaUbi.setText(direccion);
            texto.setText("");
            
            try(
                    //var bfr = new BufferedReader(new FileReader(direccion));
                    //var bfw = new BufferedWriter(new FileWriter(direccion));
                    var bfr = new BufferedReader(new InputStreamReader(new FileInputStream(direccion),"UTF-8"))
                ){
                String s;
                while((s=bfr.readLine())!=null){
                    texto.setText(texto.getText()+s+"\n");
                }
                        
            }catch(IOException e){
                Logger.getLogger(ProcesadorDeTexto.class.getName()).log(Level.SEVERE, null, e);
            }
            var file = new File(direccion);
            txtTamaño.setText(Long.toString(file.length()));
        }
    }//GEN-LAST:event_MenuAbrirActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        modalDialog.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void MeunGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeunGuardarActionPerformed
        // TODO add your handling code here:
        int r = fileChooser.showSaveDialog(rootPane);
        if(r == JFileChooser.APPROVE_OPTION){
            String direccion=fileChooser.getSelectedFile().getAbsolutePath();
            txtAreaUbi.setText(direccion);
            try(
                    var sc = new Scanner(texto.getText());
                    var bfw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(direccion),"UTF-8"));
            ){
                sc.useDelimiter("\n");
                while(sc.hasNext()){
                    bfw.write(sc.nextLine());
                    bfw.newLine();
                }
                sc.close();
            }catch(IOException e){
                Logger.getLogger(ProcesadorDeTexto.class.getName()).log(Level.SEVERE, null, e);
            }
            var file = new File(direccion);
            txtTamaño.setText(Long.toString(file.length()));
        }
    }//GEN-LAST:event_MeunGuardarActionPerformed

    private void btnRepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepoActionPerformed
        // TODO add your handling code here:
        openWebPage("https://github.com/GuillermoRojoSantos/EjercicioSwing.git");
    }//GEN-LAST:event_btnRepoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        String direccion = txtAreaUbi.getText();
        try (
                 var sc = new Scanner(texto.getText());  var bfw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(direccion), "UTF-8"));) {
            sc.useDelimiter("\n");
            while (sc.hasNext()) {
                bfw.write(sc.nextLine());
                bfw.newLine();
            }
            sc.close();
        } catch (IOException e) {
            Logger.getLogger(ProcesadorDeTexto.class.getName()).log(Level.SEVERE, null, e);
        }
        var file = new File(direccion);
        txtTamaño.setText(Long.toString(file.length()));;
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        // TODO add your handling code here:
        dialogFuente.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnColorActionPerformed

    private void listaTamanoFuenteValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaTamanoFuenteValueChanged
        // TODO add your handling code here:
        int result = listaTamanoFuente.getSelectedIndex();
        switch (result) {
            case 0 -> {
                txtPrueba.setFont(texto.getFont().deriveFont(12f));
                fontSize = 12f;
            }
            case 1 -> {
                txtPrueba.setFont(texto.getFont().deriveFont(14f));
                fontSize = 14f;
            }
            case 2 -> {
                txtPrueba.setFont(texto.getFont().deriveFont(16f));
                fontSize = 16f;
            }
            case 3 -> {
                txtPrueba.setFont(texto.getFont().deriveFont(18f));
                fontSize = 18f;
            }
            case 4 -> {
                txtPrueba.setFont(texto.getFont().deriveFont(20f));
                fontSize = 20f;
            }
            case 5 -> {
                txtPrueba.setFont(texto.getFont().deriveFont(22f));
                fontSize = 22f;
            }
            case 6 -> {
                txtPrueba.setFont(texto.getFont().deriveFont(24f));
                fontSize = 24f;
            }
            case 7 -> {
                txtPrueba.setFont(texto.getFont().deriveFont(26f));
                fontSize = 26f;
            }
            case 8 -> {
                txtPrueba.setFont(texto.getFont().deriveFont(28f));
                fontSize = 28f;
            }
            case 9 -> {
                txtPrueba.setFont(texto.getFont().deriveFont(30f));
                fontSize = 30f;
            }
            case 10 -> {
                txtPrueba.setFont(texto.getFont().deriveFont(32f));
                fontSize = 32f;
            }
            case 11 -> {
                txtPrueba.setFont(texto.getFont().deriveFont(34f));
                fontSize = 34f;
            }
            case 12 -> {
                txtPrueba.setFont(texto.getFont().deriveFont(36f));
                fontSize = 36f;
            }
            case 13 -> {
                txtPrueba.setFont(texto.getFont().deriveFont(38f));
                fontSize = 38f;
            }
            default -> {
            }
        }
        txtPrueba.setFont(txtPrueba.getFont());
    }//GEN-LAST:event_listaTamanoFuenteValueChanged

    private void comboBoxFuentesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxFuentesItemStateChanged
        // TODO add your handling code here:
        int fuente = comboBoxFuentes.getSelectedIndex();
        switch (fuente) {
            case 0 ->
                txtPrueba.setFont(arial.deriveFont(fontSize));
            case 1 ->
                txtPrueba.setFont(arialBlack.deriveFont(fontSize));
            case 2 ->
                txtPrueba.setFont(timesNRoman.deriveFont(fontSize));
            case 3 ->
                txtPrueba.setFont(microsoftHimalaya.deriveFont(fontSize));
            case 4 ->
                txtPrueba.setFont(comicSans.deriveFont(fontSize));
            default -> {
            }
        }
    }//GEN-LAST:event_comboBoxFuentesItemStateChanged

    private void btnAceptarFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarFuenteActionPerformed
        // TODO add your handling code here:
        int fuente = comboBoxFuentes.getSelectedIndex();
        int result = listaTamanoFuente.getSelectedIndex();
        switch (result) {
            case 0 -> {
                texto.setFont(texto.getFont().deriveFont(12f));
                fontSize = 12f;
            }
            case 1 -> {
                texto.setFont(texto.getFont().deriveFont(14f));
                fontSize = 14f;
            }
            case 2 -> {
                texto.setFont(texto.getFont().deriveFont(16f));
                fontSize = 16f;
            }
            case 3 -> {
                texto.setFont(texto.getFont().deriveFont(18f));
                fontSize = 18f;
            }
            case 4 -> {
                texto.setFont(texto.getFont().deriveFont(20f));
                fontSize = 20f;
            }
            case 5 -> {
                texto.setFont(texto.getFont().deriveFont(22f));
                fontSize = 22f;
            }
            case 6 -> {
                texto.setFont(texto.getFont().deriveFont(24f));
                fontSize = 24f;
            }
            case 7 -> {
                texto.setFont(texto.getFont().deriveFont(26f));
                fontSize = 26f;
            }
            case 8 -> {
                texto.setFont(texto.getFont().deriveFont(28f));
                fontSize = 28f;
            }
            case 9 -> {
                texto.setFont(texto.getFont().deriveFont(30f));
                fontSize = 30f;
            }
            case 10 -> {
                texto.setFont(texto.getFont().deriveFont(32f));
                fontSize = 32f;
            }
            case 11 -> {
                texto.setFont(texto.getFont().deriveFont(34f));
                fontSize = 34f;
            }
            case 12 -> {
                texto.setFont(texto.getFont().deriveFont(36f));
                fontSize = 36f;
            }
            case 13 -> {
                texto.setFont(texto.getFont().deriveFont(38f));
                fontSize = 38f;
            }
            default -> {
            }
        }
        texto.setFont(texto.getFont());
        
        switch (fuente) {
            case 0 ->
                texto.setFont(arial.deriveFont(fontSize));
            case 1 ->
                texto.setFont(arialBlack.deriveFont(fontSize));
            case 2 ->
                texto.setFont(timesNRoman.deriveFont(fontSize));
            case 3 ->
                texto.setFont(microsoftHimalaya.deriveFont(fontSize));
            case 4 ->
                texto.setFont(comicSans.deriveFont(fontSize));
            default -> {
            }
        }
        dialogFuente.dispose();
    }//GEN-LAST:event_btnAceptarFuenteActionPerformed

    private void txtPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPruebaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPruebaActionPerformed

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
            java.util.logging.Logger.getLogger(ProcesadorDeTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcesadorDeTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcesadorDeTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcesadorDeTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcesadorDeTexto().setVisible(true);
            }
        });
    }
    
    public void openWebPage(String url) {
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAbrir;
    private javax.swing.JMenuItem MeunGuardar;
    private javax.swing.JButton btnAceptarFuente;
    private javax.swing.JMenuItem btnColor;
    private javax.swing.JButton btnRepo;
    private javax.swing.JComboBox<String> comboBoxFuentes;
    private javax.swing.JDialog dialogFuente;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listaTamanoFuente;
    private javax.swing.JDialog modalDialog;
    private rojeru_san.RSLabelHora rSLabelHora1;
    private javax.swing.JTextPane texto;
    private javax.swing.JTextArea txtAreaUbi;
    private javax.swing.JTextField txtPrueba;
    private javax.swing.JTextField txtTamaño;
    // End of variables declaration//GEN-END:variables
}
