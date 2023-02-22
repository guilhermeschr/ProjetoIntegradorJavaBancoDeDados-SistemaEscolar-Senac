package view;

import controller.ControllerEscolaDB;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.ModelAluno;
import model.ModelEscola;

/**
 *
 * @author Gelvazio Camargo
 */
public class ViewManutencaoEscola extends javax.swing.JFrame {


    ViewConsultaEscola cons = new ViewConsultaEscola(this, true);

    ControllerEscolaDB escoladb = new ControllerEscolaDB();

    public ViewManutencaoEscola() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edtCodigo = new javax.swing.JTextField();
        edtNome = new javax.swing.JTextField();
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
        jLabel2.setText("Cadastro de Escolas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 650, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Código");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nome");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

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

        edtNome.setEnabled(false);
        edtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNomeActionPerformed(evt);
            }
        });
        edtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtNomeKeyPressed(evt);
            }
        });
        getContentPane().add(edtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 410, -1));

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
        String auxCodigo = edtCodigo.getText();
        String nome = edtNome.getText();
        
        // valida campos vazios
        if(validaCamposVazios(auxCodigo, nome)){
            int codigo = Integer.parseInt(auxCodigo);
            //Double preco = Double.parseDouble(nome);

            ModelEscola escola = new ModelEscola(codigo, nome);
            
            ModelEscola escolaBanco=  escoladb.getEscola(codigo);
            if (escolaBanco.getCodigo() > 0) {
                if(escoladb.gravarAlteracaoEscola(escola)){
                   JOptionPane.showMessageDialog(null, "Escola alterado com sucesso!");            

                    limpaCampos();

                    habilitaCampos(false);

                    edtCodigo.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao gravar alteração do escola!");
                }
            } else {
                if(escoladb.gravarInsercaoEscola(escola)){
                    JOptionPane.showMessageDialog(null, "Escola inserido com sucesso!");            

                    limpaCampos();

                    habilitaCampos(false);

                    edtCodigo.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao inserir escola!");
                }
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Existem campos não preenchidos!");            
        
    }
        
                                           

//        if (cli.GravarAlterar(Integer.parseInt(jTextField2.getText()), jTextField3.getText(),
//                jTextField4.getText(), jTextField1.getText())) {
//
//           JOptionPane.showMessageDialog(null, "Cliente gravado/alterado com sucesso!");           limpaCampos();            habilitaCampos(false);
//         jTextField2.requestFocus();        }

    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       int codigoEscola = Integer.parseInt(edtCodigo.getText());


            if (escoladb.excluirEscola(codigoEscola)) {
                JOptionPane.showMessageDialog(null, "Escola excluído com sucesso!");
                
                limpaCampos();
				
                habilitaCampos(false);
                
                edtCodigo.requestFocus();
            }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void edtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCodigoKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER) || (evt.getKeyCode() == KeyEvent.VK_TAB)) {
            if (edtCodigo.getText().equals("")) {

                edtCodigo.setText(String.valueOf(escoladb.getUltimoCodigo("tbescola", "codigo")));

                habilitaCampos(true);

                edtCodigo.requestFocus();
            } else {
                int codigo = Integer.parseInt(edtCodigo.getText());
                ModelEscola escolaBanco = new ModelEscola();
                escolaBanco = escoladb.getEscola(codigo);
                if (escolaBanco.getCodigo() > 0) {
                    edtNome.setText(escolaBanco.getNome());

                    habilitaCampos(true);
                    edtNome.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Escola não existe!");

                    habilitaCampos(false);

                    edtCodigo.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_edtCodigoKeyPressed

    private void edtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtNomeKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//        }
    }//GEN-LAST:event_edtNomeKeyPressed

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
        edtCodigo.setText(String.valueOf(escoladb.getUltimoCodigo("tbescola", "codigo")));

        habilitaCampos(true);
        btnExcluir.setVisible(false);
        edtNome.requestFocus();
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

    private void edtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNomeActionPerformed

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
            java.util.logging.Logger.getLogger(ViewManutencaoEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewManutencaoEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewManutencaoEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewManutencaoEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ViewManutencaoEscola().setVisible(true);
            }
        });
    }

    public void habilitaCampos(boolean habilita) {
        edtNome.setEnabled(habilita);
        btnGravar.setEnabled(habilita);
        btnExcluir.setEnabled(habilita);
        btnCancelar.setEnabled(habilita);

        edtCodigo.setEnabled(!habilita);
        btnConsulta.setEnabled(!habilita);
        btnAdicionar.setEnabled(!habilita);
        btnSair.setEnabled(!habilita);
    }

    public void limpaCampos() {
        edtCodigo.setText("");
        edtNome.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JTextField edtNome;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
    
    
    private boolean validaCamposVazios(String auxCodigo, String nome) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      if(auxCodigo.equals("")){
            return false;
        }
        
        if(nome.equals("")){
            return false;
        }
        
        return true;
    }
}