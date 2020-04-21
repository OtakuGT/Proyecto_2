/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Frm_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Principal
     */
    public Frm_Principal() {
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

        jMenu3 = new javax.swing.JMenu();
        Workbench = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        FrmMantDepto_Call = new javax.swing.JMenuItem();
        FrmMantCargos_Call = new javax.swing.JMenuItem();
        FrmMantEmp_Call = new javax.swing.JMenuItem();
        FrmMantConcepto_Call = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Salir_Sistema = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Nóminas");
        setResizable(false);

        Workbench.setBackground(new java.awt.Color(80, 80, 80));

        javax.swing.GroupLayout WorkbenchLayout = new javax.swing.GroupLayout(Workbench);
        Workbench.setLayout(WorkbenchLayout);
        WorkbenchLayout.setHorizontalGroup(
            WorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        WorkbenchLayout.setVerticalGroup(
            WorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jMenuBar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu5.setText("Operaciones");
        jMenu5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jMenu1.setText("Cálcular Nóminas");
        jMenu1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jMenuItem1.setText("Cálcular Nóminas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Imprimir Nóminas");
        jMenu1.add(jMenuItem2);

        jMenu5.add(jMenu1);

        jMenu2.setText("Mantenimientos");
        jMenu2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        FrmMantDepto_Call.setText("Departamentos");
        FrmMantDepto_Call.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmMantDepto_CallActionPerformed(evt);
            }
        });
        jMenu2.add(FrmMantDepto_Call);

        FrmMantCargos_Call.setText("Cargos");
        FrmMantCargos_Call.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmMantCargos_CallActionPerformed(evt);
            }
        });
        jMenu2.add(FrmMantCargos_Call);

        FrmMantEmp_Call.setText("Empleados");
        FrmMantEmp_Call.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmMantEmp_CallActionPerformed(evt);
            }
        });
        jMenu2.add(FrmMantEmp_Call);

        FrmMantConcepto_Call.setText("Conceptos de Nómina");
        FrmMantConcepto_Call.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmMantConcepto_CallActionPerformed(evt);
            }
        });
        jMenu2.add(FrmMantConcepto_Call);

        jMenu5.add(jMenu2);
        jMenu5.add(jSeparator1);

        Salir_Sistema.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Salir_Sistema.setText("Salir del Sistema");
        Salir_Sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_SistemaActionPerformed(evt);
            }
        });
        jMenu5.add(Salir_Sistema);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Workbench)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Workbench)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FrmMantCargos_CallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmMantCargos_CallActionPerformed
        Llamar_Formas("Cargos");
    }//GEN-LAST:event_FrmMantCargos_CallActionPerformed
    private void Llamar_Formas(String forma){
        JInternalFrame frm;
        Dimension workbenchSize = Workbench.getSize();
        
        switch(forma){
            case "Cargos":
                frm = new FrmMantCargos();
                Dimension frameSize1 = frm.getSize();
                frm.setLocation((workbenchSize.width - frameSize1.width)/2, (workbenchSize.height - frameSize1.height)/2);
                Workbench.add(frm);
                frm.setVisible(true);
                break;
            case "Deptos":
                frm = new FrmMantDeptos();
                Dimension frameSize2 = frm.getSize();
                frm.setLocation((workbenchSize.width - frameSize2.width)/2, (workbenchSize.height - frameSize2.height)/2);
                Workbench.add(frm);
                frm.setVisible(true);
                break;
            case "Conceptos":
                frm = new FrmMantConcepto();
                Dimension frameSize3 = frm.getSize();
                frm.setLocation((workbenchSize.width - frameSize3.width)/2, (workbenchSize.height - frameSize3.height)/2);
                Workbench.add(frm);
                frm.setVisible(true);
                break;
            case "Empleado":
                frm = new FrmMantEmp();
                Dimension frameSize4 = frm.getSize();
                frm.setLocation((workbenchSize.width - frameSize4.width)/2, (workbenchSize.height - frameSize4.height)/2);
                Workbench.add(frm);
                frm.setVisible(true);
                break;
            case "GenNom":
                frm = new FrmGenNom();
                Dimension frameSize5 = frm.getSize();
                frm.setLocation((workbenchSize.width - frameSize5.width)/2, (workbenchSize.height - frameSize5.height)/2);
                Workbench.add(frm);
                frm.setVisible(true);
                break;
        }
        
    }
    private void Salir_SistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_SistemaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Salir_SistemaActionPerformed

    private void FrmMantDepto_CallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmMantDepto_CallActionPerformed
        Llamar_Formas("Deptos");
    }//GEN-LAST:event_FrmMantDepto_CallActionPerformed

    private void FrmMantConcepto_CallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmMantConcepto_CallActionPerformed
        Llamar_Formas("Conceptos");
    }//GEN-LAST:event_FrmMantConcepto_CallActionPerformed

    private void FrmMantEmp_CallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmMantEmp_CallActionPerformed
        Llamar_Formas("Empleado");
    }//GEN-LAST:event_FrmMantEmp_CallActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       int r = JOptionPane.showConfirmDialog(null, "¿DESEA GENERAR UNA NUEVA NÓMINA?", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       if(r==0){
           Llamar_Formas("GenNom");
       }
       else{
           JOptionPane.showMessageDialog(null, "NO");
       }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem FrmMantCargos_Call;
    private javax.swing.JMenuItem FrmMantConcepto_Call;
    private javax.swing.JMenuItem FrmMantDepto_Call;
    private javax.swing.JMenuItem FrmMantEmp_Call;
    private javax.swing.JMenuItem Salir_Sistema;
    private javax.swing.JDesktopPane Workbench;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
