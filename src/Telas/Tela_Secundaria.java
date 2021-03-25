package Telas;


public class Tela_Secundaria extends javax.swing.JFrame {

    
    public Tela_Secundaria() {
        initComponents();
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCor = new javax.swing.JPanel();
        btn_cod = new javax.swing.JButton();
        lbl_cod = new javax.swing.JLabel();
        btn_voltar1 = new javax.swing.JButton();
        txt_cod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelCor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cod.setText("Gerar código");
        btn_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_codActionPerformed(evt);
            }
        });
        PainelCor.add(btn_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 100, 40));

        lbl_cod.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_cod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PainelCor.add(lbl_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 180, 50));

        btn_voltar1.setText("Voltar");
        btn_voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltar1ActionPerformed(evt);
            }
        });
        PainelCor.add(btn_voltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 100, 40));

        txt_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codActionPerformed(evt);
            }
        });
        PainelCor.add(txt_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 180, 50));

        getContentPane().add(PainelCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void senha() {
        
         String[] carct ={"0","1","2","3","4","5","6","7","8","9"};
         String senha="";
            for (int x=0; x<4; x++){
            int j = (int) (Math.random()*carct.length);
            senha += carct[j];
            }

            lbl_cod.setText(senha);
           
    }
    
    private void btn_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_codActionPerformed

        senha ();
        
        
    }//GEN-LAST:event_btn_codActionPerformed

    private void btn_voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltar1ActionPerformed
       
        String vnome = lbl_cod.getText();
        String vnome2 = txt_cod.getText();
                     
       
        if (vnome == vnome2){
            
            Tela_login obj = new Tela_login();
            obj.setVisible(true);
            dispose ();
            
        }
       
        
    }//GEN-LAST:event_btn_voltar1ActionPerformed

    private void txt_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codActionPerformed
      
    }//GEN-LAST:event_txt_codActionPerformed

    
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
            java.util.logging.Logger.getLogger(Tela_Secundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Secundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Secundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Secundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Secundaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCor;
    private javax.swing.JButton btn_cod;
    private javax.swing.JButton btn_voltar1;
    private javax.swing.JLabel lbl_cod;
    private javax.swing.JTextField txt_cod;
    // End of variables declaration//GEN-END:variables
}
