package view;

import controller.ControllerNotasDB;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.ModelNota;

/**
 *
 * @author Gelvazio Camargo
 */
public class ViewConsultaNota extends javax.swing.JDialog {

    public int codigoprofessor;
    public int codigomateria;
    public int codigo;
    public int codigoaluno;
    public String datanota;
    public double nota;

    ControllerNotasDB notadb = new ControllerNotasDB();

    public ViewConsultaNota(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        // coloca a tela no centro
        this.setLocationRelativeTo(null);
    }

    public void listaTodosRegistros() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaDados.getModel();

        // Reseta os registros da tabela
        modelo.setRowCount(0);

        // Lista todas as pessoas da classe escoladb
        ArrayList<ModelNota> Nota = notadb.getTodos();

        // Percorre a lista de pessoas recebidas e adiciona na tabela da tela
        //   tipo        apelido     arrayList de pessoas
        for (ModelNota auxNota : Nota) {
            modelo.addRow(new Object[]{
                auxNota.getCodigoprofessor(),
                auxNota.getCodigoaluno(),
                auxNota.getCodigomateria(),
                auxNota.getCodigonota(),
                auxNota.getData(),
                auxNota.getNota()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator8 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 620, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Consulta de Notas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 660, -1));

        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo nota", "codigo professor", "codigo materia", "codigo aluno", "data", "nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDados.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaDadosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                tabelaDadosAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                tabelaDadosAncestorRemoved(evt);
            }
        });
        tabelaDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaDados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 640, 340));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDadosMouseClicked
        codigoaluno = Integer.parseInt(String.valueOf(tabelaDados.getModel().getValueAt(tabelaDados.getSelectedRow(), 0)));
        codigoprofessor = Integer.parseInt(String.valueOf(tabelaDados.getModel().getValueAt(tabelaDados.getSelectedRow(), 0)));
        codigomateria = Integer.parseInt(String.valueOf(tabelaDados.getModel().getValueAt(tabelaDados.getSelectedRow(), 0)));
        codigo = Integer.parseInt(String.valueOf(tabelaDados.getModel().getValueAt(tabelaDados.getSelectedRow(), 0)));
        nota = Integer.parseInt(String.valueOf(tabelaDados.getModel().getValueAt(tabelaDados.getSelectedRow(), 0)));
        datanota = String.valueOf(tabelaDados.getModel().getValueAt(tabelaDados.getSelectedRow(), 1));
        dispose();
    }//GEN-LAST:event_tabelaDadosMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        listaTodosRegistros();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tabelaDadosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaDadosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaDadosAncestorAdded

    private void tabelaDadosAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaDadosAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaDadosAncestorMoved

    private void tabelaDadosAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaDadosAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaDadosAncestorRemoved

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
            java.util.logging.Logger.getLogger(ViewConsultaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewConsultaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewConsultaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewConsultaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewConsultaNota dialog = new ViewConsultaNota(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable tabelaDados;
    // End of variables declaration//GEN-END:variables
}
