/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.contacts.view;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class ContactsSystem extends javax.swing.JFrame {

    /**
     * Creates new form ContactsSystem
     */
    public ContactsSystem() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuContacts = new javax.swing.JMenu();
        itmContactGo = new javax.swing.JMenuItem();
        mnuManagement = new javax.swing.JMenu();
        itmGo = new javax.swing.JMenuItem();
        mnuSettings = new javax.swing.JMenu();
        itmModify = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        itmHowTo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuContacts.setText("Contacts");
        mnuContacts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuContacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuContactsMouseClicked(evt);
            }
        });

        itmContactGo.setText("Go");
        mnuContacts.add(itmContactGo);

        mnuManagement.setText("Management");
        mnuManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        itmGo.setText("Go");
        itmGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itmGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmGoActionPerformed(evt);
            }
        });
        mnuManagement.add(itmGo);

        mnuContacts.add(mnuManagement);

        jMenuBar1.add(mnuContacts);

        mnuSettings.setText("Settings");

        itmModify.setText("Modify");
        mnuSettings.add(itmModify);

        jMenuBar1.add(mnuSettings);

        mnuHelp.setText("Help");

        itmAbout.setText("About");
        mnuHelp.add(itmAbout);

        itmHowTo.setText("How to use");
        mnuHelp.add(itmHowTo);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmGoActionPerformed
        FrmContact frmContact;
        frmContact = new FrmContact();
        frmContact.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmGoActionPerformed

    private void mnuContactsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuContactsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuContactsMouseClicked

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
            java.util.logging.Logger.getLogger(ContactsSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactsSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactsSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactsSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactsSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmContactGo;
    private javax.swing.JMenuItem itmGo;
    private javax.swing.JMenuItem itmHowTo;
    private javax.swing.JMenuItem itmModify;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuContacts;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuManagement;
    private javax.swing.JMenu mnuSettings;
    // End of variables declaration//GEN-END:variables
}
