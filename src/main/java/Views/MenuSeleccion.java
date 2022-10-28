/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author guiro
 */

public class MenuSeleccion extends javax.swing.JFrame {

    /**
     * Creates new form MenuSeleccion
     */
    public MenuSeleccion() {
        initComponents();
        
    }
    
    
    private static void calculadora(){
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    private static void procesadorDeTexto(){
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        botonCalculadora = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        botonProcesadorTxt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Selección");
        setPreferredSize(new java.awt.Dimension(390, 265));
        setResizable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione un programa a ejecutar:");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.GridLayout(2, 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calculadora");
        jPanel3.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Procesador de texto");
        jPanel3.add(jLabel3);

        jPanel5.setLayout(new java.awt.BorderLayout());

        botonCalculadora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonCalculadora.setText("Calculadora");
        botonCalculadora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCalculadora.setMaximumSize(new java.awt.Dimension(165, 55));
        botonCalculadora.setMinimumSize(new java.awt.Dimension(165, 55));
        botonCalculadora.setPreferredSize(new java.awt.Dimension(165, 55));
        botonCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCalculadoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCalculadoraMouseExited(evt);
            }
        });
        botonCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalculadoraActionPerformed(evt);
            }
        });
        jPanel5.add(botonCalculadora, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5);

        jPanel4.setLayout(new java.awt.BorderLayout());

        botonProcesadorTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonProcesadorTxt.setText("Procesador de texto");
        botonProcesadorTxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonProcesadorTxt.setMaximumSize(new java.awt.Dimension(165, 55));
        botonProcesadorTxt.setMinimumSize(new java.awt.Dimension(165, 55));
        botonProcesadorTxt.setPreferredSize(new java.awt.Dimension(165, 55));
        botonProcesadorTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonProcesadorTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonProcesadorTxtMouseExited(evt);
            }
        });
        botonProcesadorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProcesadorTxtActionPerformed(evt);
            }
        });
        jPanel4.add(botonProcesadorTxt, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalculadoraActionPerformed
        // TODO add your handling code here:
        calculadora();
    }//GEN-LAST:event_botonCalculadoraActionPerformed

    private void botonCalculadoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCalculadoraMouseEntered
        // TODO add your handling code here:
        botonCalculadora.setBounds(11, 2, 165, 55);
    }//GEN-LAST:event_botonCalculadoraMouseEntered

    private void botonCalculadoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCalculadoraMouseExited
        // TODO add your handling code here:
        botonCalculadora.setBounds(10, 1, 170, 60);
    }//GEN-LAST:event_botonCalculadoraMouseExited

    private void botonProcesadorTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProcesadorTxtMouseEntered
        // TODO add your handling code here:
        botonProcesadorTxt.setBounds(11, 2, 165, 55);
    }//GEN-LAST:event_botonProcesadorTxtMouseEntered

    private void botonProcesadorTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProcesadorTxtMouseExited
        // TODO add your handling code here:
        botonProcesadorTxt.setBounds(10, 1, 170, 60);
    }//GEN-LAST:event_botonProcesadorTxtMouseExited

    private void botonProcesadorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProcesadorTxtActionPerformed
        // TODO add your handling code here:
        procesadorDeTexto();
    }//GEN-LAST:event_botonProcesadorTxtActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalculadora;
    private javax.swing.JButton botonProcesadorTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
