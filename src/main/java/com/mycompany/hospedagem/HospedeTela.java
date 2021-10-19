
package com.mycompany.hospedagem;

/**
 *
 * @author joyce
 */
public class HospedeTela extends javax.swing.JFrame {
    private Hospede hospede = new Hospede();
    private boolean editando;
    /** Creates new form HospedeTelaTe */
    public HospedeTela() {
        initComponents();
    }

    public HospedeTela(boolean editando, Hospede hospede){
        initComponents();
        this.editando = editando;
        this.hospede = hospede;
        cpfHospede.setText(hospede.getCPF());
        if (editando){
            cpfHospede.setEditable(false);
        }
        
        nomeHospede.setText(hospede.getNome());
        enderecoHospede.setText(hospede.getEndereco());
        celularHospede.setText(hospede.getCelular());
        email.setText(hospede.getEmail());
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        celularHospede = new javax.swing.JTextField();
        emailHospede = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cadastrarHospede = new javax.swing.JButton();
        nome = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        celular = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        nomeHospede = new javax.swing.JTextField();
        cpfHospede = new javax.swing.JTextField();
        enderecoHospede = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Hospede");

        cadastrarHospede.setText("Cadastrar");
        cadastrarHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarHospedeActionPerformed(evt);
            }
        });

        nome.setText("Nome");

        cpf.setText("CPF");

        endereco.setText("Endereço");

        celular.setText("Celular");

        email.setText("Email");

        nomeHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeHospedeActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(nome)
                                .add(39, 39, 39)
                                .add(nomeHospede, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 245, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(endereco)
                                .add(18, 18, 18)
                                .add(enderecoHospede, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 245, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(cpf)
                                .add(47, 47, 47)
                                .add(cpfHospede, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 245, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(email)
                                    .add(celular))
                                .add(33, 33, 33)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(cadastrarHospede)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(celularHospede)
                                        .add(emailHospede, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))))))
                    .add(layout.createSequentialGroup()
                        .add(161, 161, 161)
                        .add(jLabel1)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(38, 38, 38)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(nome)
                    .add(nomeHospede, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cpf)
                    .add(cpfHospede, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(21, 21, 21)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(endereco)
                    .add(enderecoHospede, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(celular, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(celularHospede, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(email)
                    .add(emailHospede, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 25, Short.MAX_VALUE)
                .add(cadastrarHospede)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarHospedeActionPerformed
        // TODO add your handling code here:
        HospedeDao HNovo = new HospedeDao();
        hospede.setNome(nomeHospede.getText());
        hospede.setEndereco(enderecoHospede.getText());
        hospede.setCelular(celularHospede.getText());
        hospede.setEmail(emailHospede.getText());

        if(!editando){
            hospede.setCPF(cpfHospede.getText());
            HNovo.adicionarHospede(hospede);
        } else{
            HNovo.updateHospede(hospede);
        }

        nomeHospede.setText("");
        enderecoHospede.setText("");
        celularHospede.setText("");
        emailHospede.setText("");
        cpfHospede.setText("");
    }//GEN-LAST:event_cadastrarHospedeActionPerformed

    private void nomeHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeHospedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeHospedeActionPerformed

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
            java.util.logging.Logger.getLogger(HospedeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospedeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospedeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospedeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospedeTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarHospede;
    private javax.swing.JLabel celular;
    private javax.swing.JTextField celularHospede;
    private javax.swing.JLabel cpf;
    private javax.swing.JTextField cpfHospede;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailHospede;
    private javax.swing.JLabel endereco;
    private javax.swing.JTextField enderecoHospede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nomeHospede;
    // End of variables declaration//GEN-END:variables

}
