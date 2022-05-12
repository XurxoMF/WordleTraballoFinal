/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xurxo.martinez.wordle.gui;

/**
 *
 * @author alumno
 */
public class GestionMotorJDialog extends javax.swing.JDialog {

    /**
     * Creates new form GestionMotorJDialog
     */
    public GestionMotorJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        tituloJLabel.setText("Gestión Motor");
        tituloJPanel.add(tituloJLabel, new java.awt.GridBagConstraints());

        mainJPanel.add(tituloJPanel, java.awt.BorderLayout.CENTER);

        contenedorJPanel.setBackground(new java.awt.Color(204, 204, 204));
        contenedorJPanel.setPreferredSize(new java.awt.Dimension(400, 220));
        contenedorJPanel.setLayout(new java.awt.GridLayout(2, 1));

        anhadirJPanel.setBackground(new java.awt.Color(204, 204, 204));
        anhadirJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alta palabra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        anhadirJPanel.setLayout(new java.awt.GridLayout(2, 1));

        controlAnhadirJPalen.setBackground(new java.awt.Color(204, 204, 204));

        anhadirJTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        anhadirJTextField.setPreferredSize(new java.awt.Dimension(160, 23));
        controlAnhadirJPalen.add(anhadirJTextField);

        anhadirJButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        anhadirJButton.setText("Añadir");
        controlAnhadirJPalen.add(anhadirJButton);

        anhadirJPanel.add(controlAnhadirJPalen);

        infoAnhadirJPanel.setBackground(new java.awt.Color(204, 204, 204));
        infoAnhadirJPanel.setLayout(new java.awt.GridBagLayout());

        infoAnhadirJLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        infoAnhadirJLabel.setText("Hola");
        infoAnhadirJLabel.setToolTipText("");
        infoAnhadirJPanel.add(infoAnhadirJLabel, new java.awt.GridBagConstraints());

        anhadirJPanel.add(infoAnhadirJPanel);

        contenedorJPanel.add(anhadirJPanel);

        eliminarJPanel.setBackground(new java.awt.Color(204, 204, 204));
        eliminarJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrado palabra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        eliminarJPanel.setLayout(new java.awt.GridLayout(2, 1));

        controlEliminarJPanel.setBackground(new java.awt.Color(204, 204, 204));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        controlEliminarJPanel.setLayout(flowLayout1);

        eliminarJTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        eliminarJTextField.setPreferredSize(new java.awt.Dimension(160, 23));
        controlEliminarJPanel.add(eliminarJTextField);

        eliminarJButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        eliminarJButton.setText("Eliminar");
        controlEliminarJPanel.add(eliminarJButton);

        eliminarJPanel.add(controlEliminarJPanel);

        infoEliminarJPanel.setBackground(new java.awt.Color(204, 204, 204));
        infoEliminarJPanel.setLayout(new java.awt.GridBagLayout());

        infoEliminarJLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        infoEliminarJLabel.setText("Hola");
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
                GestionMotorJDialog dialog = new GestionMotorJDialog(new javax.swing.JFrame(), true);
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