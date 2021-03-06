/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xurxo.martinez.wordle.gui;

import xurxo.martinez.wordle.io.IMotorPalabras;
import xurxo.martinez.wordle.io.MotorTest;

/**
 *
 * @author alumno
 */
public class GestionMotorJDialog extends javax.swing.JDialog {

    private IMotorPalabras motor;

    /**
     * Creates new form GestionMotorJDialog
     *
     * @param parent
     * @param modal
     * @param motor
     */
    public GestionMotorJDialog(java.awt.Frame parent, boolean modal, IMotorPalabras motor) {
        super(parent, modal);
        initComponents();
        this.motor = motor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainJPanel = new javax.swing.JPanel();
        tituloJPanel = new javax.swing.JPanel();
        tituloJLabel = new javax.swing.JLabel();
        contenedorJPanel = new javax.swing.JPanel();
        anhadirJPanel = new javax.swing.JPanel();
        controlAnhadirJPalen = new javax.swing.JPanel();
        anhadirJTextField = new javax.swing.JTextField();
        anhadirJButton = new javax.swing.JButton();
        infoAnhadirJPanel = new javax.swing.JPanel();
        infoAnhadirJLabel = new javax.swing.JLabel();
        eliminarJPanel = new javax.swing.JPanel();
        controlEliminarJPanel = new javax.swing.JPanel();
        eliminarJTextField = new javax.swing.JTextField();
        eliminarJButton = new javax.swing.JButton();
        infoEliminarJPanel = new javax.swing.JPanel();
        infoEliminarJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainJPanel.setBackground(new java.awt.Color(204, 204, 204));
        mainJPanel.setLayout(new java.awt.BorderLayout());

        tituloJPanel.setBackground(new java.awt.Color(204, 204, 204));
        tituloJPanel.setPreferredSize(new java.awt.Dimension(400, 80));
        tituloJPanel.setLayout(new java.awt.GridBagLayout());

        tituloJLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tituloJLabel.setText("Gesti??n Motor");
        tituloJPanel.add(tituloJLabel, new java.awt.GridBagConstraints());

        mainJPanel.add(tituloJPanel, java.awt.BorderLayout.CENTER);

        contenedorJPanel.setBackground(new java.awt.Color(204, 204, 204));
        contenedorJPanel.setPreferredSize(new java.awt.Dimension(400, 220));
        contenedorJPanel.setLayout(new java.awt.GridLayout(2, 1));

        anhadirJPanel.setBackground(new java.awt.Color(204, 204, 204));
        anhadirJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Alta palabra"));
        anhadirJPanel.setLayout(new java.awt.GridLayout(2, 1));

        controlAnhadirJPalen.setBackground(new java.awt.Color(204, 204, 204));

        anhadirJTextField.setPreferredSize(new java.awt.Dimension(160, 23));
        controlAnhadirJPalen.add(anhadirJTextField);

        anhadirJButton.setText("A??adir");
        anhadirJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anhadirJButtonActionPerformed(evt);
            }
        });
        controlAnhadirJPalen.add(anhadirJButton);

        anhadirJPanel.add(controlAnhadirJPalen);

        infoAnhadirJPanel.setBackground(new java.awt.Color(204, 204, 204));
        infoAnhadirJPanel.setLayout(new java.awt.GridBagLayout());

        infoAnhadirJLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        infoAnhadirJLabel.setToolTipText("");
        infoAnhadirJPanel.add(infoAnhadirJLabel, new java.awt.GridBagConstraints());

        anhadirJPanel.add(infoAnhadirJPanel);

        contenedorJPanel.add(anhadirJPanel);

        eliminarJPanel.setBackground(new java.awt.Color(204, 204, 204));
        eliminarJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Borrado palabra"));
        eliminarJPanel.setLayout(new java.awt.GridLayout(2, 1));

        controlEliminarJPanel.setBackground(new java.awt.Color(204, 204, 204));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        controlEliminarJPanel.setLayout(flowLayout1);

        eliminarJTextField.setPreferredSize(new java.awt.Dimension(160, 23));
        controlEliminarJPanel.add(eliminarJTextField);

        eliminarJButton.setText("Eliminar");
        eliminarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarJButtonActionPerformed(evt);
            }
        });
        controlEliminarJPanel.add(eliminarJButton);

        eliminarJPanel.add(controlEliminarJPanel);

        infoEliminarJPanel.setBackground(new java.awt.Color(204, 204, 204));
        infoEliminarJPanel.setLayout(new java.awt.GridBagLayout());

        infoEliminarJLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        infoEliminarJLabel.setToolTipText("");
        infoEliminarJPanel.add(infoEliminarJLabel, new java.awt.GridBagConstraints());

        eliminarJPanel.add(infoEliminarJPanel);

        contenedorJPanel.add(eliminarJPanel);

        mainJPanel.add(contenedorJPanel, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anhadirJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anhadirJButtonActionPerformed
        String palabra = anhadirJTextField.getText().toUpperCase();
        if(motor.checkPalabra(palabra)) {
            if(motor.anhadirPalabra(palabra)) {
                infoAnhadirJLabel.setText("A??adida correctamente");
                infoAnhadirJLabel.setForeground(PrincipalJForm.VERDE);
            } else {
                infoAnhadirJLabel.setText("Error al agregar la palabra!");
                infoAnhadirJLabel.setForeground(PrincipalJForm.ROJO);
            }
        } else {
            infoAnhadirJLabel.setText("La palabra no cumple el formato AAAAA!");
            infoAnhadirJLabel.setForeground(PrincipalJForm.ROJO);
        }
    }//GEN-LAST:event_anhadirJButtonActionPerformed

    private void eliminarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarJButtonActionPerformed
        String palabra = eliminarJTextField.getText().toUpperCase();
        if(motor.checkPalabra(palabra)) {
            if(motor.eliminarPalabra(palabra)) {
                infoEliminarJLabel.setText("Palabra eliminada con ??xito!");
                infoEliminarJLabel.setForeground(PrincipalJForm.VERDE);
            } else {
                infoEliminarJLabel.setText("La palabra no existe o no se pudo eliminar!");
                infoEliminarJLabel.setForeground(PrincipalJForm.ROJO);
            }
        } else {
            infoEliminarJLabel.setText("La palabra no cumple el formato AAAAA!");
            infoEliminarJLabel.setForeground(PrincipalJForm.ROJO);
        }
    }//GEN-LAST:event_eliminarJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GestionMotorJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionMotorJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionMotorJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionMotorJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IMotorPalabras motor = new MotorTest();
                GestionMotorJDialog dialog = new GestionMotorJDialog(new javax.swing.JFrame(), true, motor);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anhadirJButton;
    private javax.swing.JPanel anhadirJPanel;
    private javax.swing.JTextField anhadirJTextField;
    private javax.swing.JPanel contenedorJPanel;
    private javax.swing.JPanel controlAnhadirJPalen;
    private javax.swing.JPanel controlEliminarJPanel;
    private javax.swing.JButton eliminarJButton;
    private javax.swing.JPanel eliminarJPanel;
    private javax.swing.JTextField eliminarJTextField;
    private javax.swing.JLabel infoAnhadirJLabel;
    private javax.swing.JPanel infoAnhadirJPanel;
    private javax.swing.JLabel infoEliminarJLabel;
    private javax.swing.JPanel infoEliminarJPanel;
    private javax.swing.JPanel mainJPanel;
    private javax.swing.JLabel tituloJLabel;
    private javax.swing.JPanel tituloJPanel;
    // End of variables declaration//GEN-END:variables
}
