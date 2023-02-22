package view;

import controller.ControllerTurmaDB;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.ModelAluno;
import model.ModelTurma;


/**
 *
 * @author Guilherme Schröder
 */
public class ViewManutencaoTurma extends javax.swing.JFrame {


    ViewConsultaTurma cons = new ViewConsultaTurma(this, true);

    ControllerTurmaDB turmadb = new ControllerTurmaDB();

    public ViewManutencaoTurma() {
        initComponents();
        this.setLocationRelativeTo(null);
        edtCodigo.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        edtPeriodo = new javax.swing.JTextField();
        edtCodigo = new javax.swing.JTextField();
        edtDescricao = new javax.swing.JTextField();
        edtNivel = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnConsulta = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de Turmas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 650, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Período");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Código");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Descrição");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("nivel");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        edtPeriodo.setEnabled(false);
        edtPeriodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtPeriodoKeyPressed(evt);
            }
        });
        getContentPane().add(edtPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 410, -1));

        edtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCodigoActionPerformed(evt);
            }
        });
        edtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtCodigoKeyPressed(evt);
            }
        });
        getContentPane().add(edtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, -1));

        edtDescricao.setEnabled(false);
        edtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDescricaoActionPerformed(evt);
            }
        });
        edtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtDescricaoKeyPressed(evt);
            }
        });
        getContentPane().add(edtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 410, -1));

        edtNivel.setEnabled(false);
        edtNivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtNivelKeyPressed(evt);
            }
        });
        getContentPane().add(edtNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 410, -1));

        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Valid Green.png"))); // NOI18N
        btnGravar.setText("Gravar");
        btnGravar.setEnabled(false);
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 130, 40));

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Remove Red.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.setPreferredSize(new java.awt.Dimension(101, 41));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 130, 40));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.setPreferredSize(new java.awt.Dimension(101, 41));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 130, 40));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 610, 10));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 610, 10));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 10));

        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Search.png"))); // NOI18N
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 40, 40));

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Add.png"))); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 40, 40));

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Red.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
// Seta os dados da tela no modelo de produto
        String Codigo = edtCodigo.getText();
        String descricao = edtDescricao.getText();
        String nivel = edtNivel.getText();
        String periodo = edtPeriodo.getText();
        
        // valida campos vazios
        if(validaCamposVazios(Codigo, descricao, nivel, periodo )){
            int codigo = Integer.parseInt(Codigo);
            //String nome = String.parseString(auxnome);
            //Double preco = Double.parseDouble(auxnome);

            ModelTurma turma = new ModelTurma(codigo, descricao, nivel, periodo);
            
            ModelTurma turmaBanco = turmadb.getTurma(codigo);
            if (turmaBanco.getCodigo() > 0) {
                if(turmadb.gravarAlteracaoTurma(turma)){
                    JOptionPane.showMessageDialog(null, "Turma alterada com sucesso!");            

                    limpaCampos();

                    habilitaCampos(false);

                    edtCodigo.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao gravar alteração da turma!");
                }
            } else {
                if(turmadb.gravarInsercaoTurma(turma)){
                    JOptionPane.showMessageDialog(null, "Turma inserida com sucesso!");            

                    limpaCampos();

                    habilitaCampos(false);

                    edtCodigo.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao inserir turma!");
                }
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Existem campos não preenchidos!");            
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int codigoTurma = Integer.parseInt(edtCodigo.getText());


            if (turmadb.excluirTurma(codigoTurma)) {
                JOptionPane.showMessageDialog(null, "Turma excluída com sucesso!");
                
                limpaCampos();
				
                habilitaCampos(false);
                
                edtCodigo.requestFocus();
            }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void edtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCodigoKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER) || (evt.getKeyCode() == KeyEvent.VK_TAB)) {
            if (edtCodigo.getText().equals("")) {

                edtCodigo.setText(String.valueOf(turmadb.getUltimoCodigo("tbturma", "codigo")));

                habilitaCampos(true);

                edtCodigo.requestFocus();
            } else {
                int codigo = Integer.parseInt(edtCodigo.getText());
                ModelTurma turmaBanco = new ModelTurma();
                turmaBanco = turmadb.getTurma(codigo);
                if (turmaBanco.getCodigo() > 0) {
                    edtDescricao.setText(turmaBanco.getDescricao());
                    edtNivel.setText(turmaBanco.getNivel());
                    edtPeriodo.setText(turmaBanco.getPeriodo());

                    habilitaCampos(true);
                    edtDescricao.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "turma não existe!");

                    habilitaCampos(false);

                    edtCodigo.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_edtCodigoKeyPressed

    private void edtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtDescricaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            edtDescricao.requestFocus();
        }
    }//GEN-LAST:event_edtDescricaoKeyPressed

    private void edtNivelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtNivelKeyPressed
if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            edtNivel.requestFocus();
        }
    }//GEN-LAST:event_edtNivelKeyPressed

    private void edtPeriodoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPeriodoKeyPressed
if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            edtPeriodo.requestFocus();
        }
    }//GEN-LAST:event_edtPeriodoKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void edtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCodigoActionPerformed

    }//GEN-LAST:event_edtCodigoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        habilitaCampos(false);
        edtCodigo.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        edtCodigo.setText(String.valueOf(turmadb.getUltimoCodigo("tbturma", "codigo")));

        habilitaCampos(true);
        
        btnExcluir.setVisible(false);

        edtDescricao.requestFocus();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed

        cons.setVisible(true);
        btnExcluir.setVisible(true);
        edtCodigo.setText(String.valueOf(cons.codigo));
        edtCodigo.requestFocus();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void edtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDescricaoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewManutencaoTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewManutencaoTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewManutencaoTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewManutencaoTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewManutencaoTurma().setVisible(true);
            }
        });
    }

    public void habilitaCampos(boolean habilita) {
        edtPeriodo.setEnabled(habilita);
        edtDescricao.setEnabled(habilita);
        edtNivel.setEnabled(habilita);
        btnGravar.setEnabled(habilita);
        btnExcluir.setEnabled(habilita);
        btnCancelar.setEnabled(habilita);

        edtCodigo.setEnabled(!habilita);
        btnConsulta.setEnabled(!habilita);
        btnAdicionar.setEnabled(!habilita);
        btnSair.setEnabled(!habilita);
    }

    public void limpaCampos() {
        edtPeriodo.setText("");
        edtCodigo.setText("");
        edtDescricao.setText("");
        edtNivel.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JTextField edtDescricao;
    private javax.swing.JTextField edtNivel;
    private javax.swing.JTextField edtPeriodo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables

    private boolean validaCamposVazios(String auxCodigo, String descricao, String nivel, String periodo) {
     
        if(auxCodigo.equals("")){
            return false;
        }
        
        if(descricao.equals("")){
            return false;
        }
        if(nivel.equals("")){
            return false;
        }
        if(periodo.equals("")){
            return false;
        }
        
        return true;
    }   
    
}
