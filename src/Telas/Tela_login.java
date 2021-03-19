package Telas;

import javax.swing.JOptionPane;

public class Tela_login extends javax.swing.JFrame {

    int tentativas;
    
    public Tela_login() {
        initComponents();
        lbl_erro1.setVisible(false);
        tentativas=3;      
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_user = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        lbl_senha = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        btn_acessar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        lbl_erro1 = new javax.swing.JLabel();
        lbl_degrade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_user.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        lbl_user.setText("Usuário:");
        getContentPane().add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 80, -1));
        getContentPane().add(txt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 240, -1));

        lbl_senha.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        lbl_senha.setText("Senha:");
        getContentPane().add(lbl_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 70, 20));
        getContentPane().add(txt_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 240, -1));

        btn_acessar.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btn_acessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login-square-arrow-button-outline_icon-icons.com_73220.png"))); // NOI18N
        btn_acessar.setText("Acessar");
        btn_acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acessarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_acessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        btn_sair.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/door_out.png"))); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 90, -1));

        btn_limpar.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btn_limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit_delete_delete_1189.png"))); // NOI18N
        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 90, -1));

        lbl_erro1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_erro1.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        lbl_erro1.setForeground(new java.awt.Color(204, 0, 0));
        lbl_erro1.setText("Login e/ou senha incorreto(s), por favor tente novamente.");
        getContentPane().add(lbl_erro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 370, -1));

        lbl_degrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo_degradê.png"))); // NOI18N
        getContentPane().add(lbl_degrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
       txt_login.setText(null);
       txt_senha.setText(null);
       lbl_erro1.setVisible(false);
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
           System.exit(0);  
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_acessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acessarActionPerformed
        
       
        while (txt_login.getText().equals("User") && (txt_senha.getText().equals("1234"))) {
        
            Tela_Secundaria obj = new Tela_Secundaria();
            obj.setVisible(true);
            dispose ();
            break;
        } 
        
        while (!txt_login.getText().equals("User") || (!txt_senha.getText().equals("1234"))){
         tentativas -=1;
         lbl_erro1.setVisible(true);
         JOptionPane.showMessageDialog(null,"Usuário e/ou incorreto(s). Tente novamente! Vc só tem mais " +tentativas+ " tentativa(s)");
         break;
        }
        
         if (tentativas==0){   
         JOptionPane.showMessageDialog(null, "Número limite de tentativas atingido! Por favor contacte o administrador");
         btn_acessar.setVisible(false);
         }
        
    }//GEN-LAST:event_btn_acessarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acessar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel lbl_degrade;
    private javax.swing.JLabel lbl_erro1;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JTextField txt_login;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables
}
