/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialii;

import javax.swing.JOptionPane;

/**
 *
 * @author soporte
 */
public class parcial extends javax.swing.JFrame {
    private Object JT2;

    /**
     * Creates new form parcial
     */
    public parcial() {
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

        jPanel2 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JL1 = new javax.swing.JLabel();
        JL2 = new javax.swing.JLabel();
        JL3 = new javax.swing.JLabel();
        JT1 = new javax.swing.JTextField();
        JJT2 = new javax.swing.JTextField();
        JT3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JL4 = new javax.swing.JLabel();
        JL5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JT4 = new javax.swing.JTextField();
        JT5 = new javax.swing.JTextField();
        JT6 = new javax.swing.JTextField();
        CH1 = new javax.swing.JCheckBox();
        CH3 = new javax.swing.JCheckBox();
        CH2 = new javax.swing.JCheckBox();
        CH4 = new javax.swing.JCheckBox();
        JB1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("EJERCICIO 1");

        JL1.setText("NUMERO 1");

        JL2.setText("NUMERO 2");

        JL3.setText("RESULTADO");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("SUMA");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("RESTA");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("MULTIPLICCAR");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("DIVIR");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JL1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JL3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JT1)
                            .addComponent(JJT2)
                            .addComponent(JT3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jRadioButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jRadioButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jRadioButton4))
                            .addComponent(jRadioButton2))
                        .addGap(42, 42, 42)))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JJT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addContainerGap())
        );

        jTabbedPane1.addTab("RADIO", jPanel1);

        jLabel2.setText("EJERCICIO 2");

        JL4.setText("NUMERO 1");

        JL5.setText("NUMERO 2");

        jLabel5.setText("RESULTADO");

        JT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT5ActionPerformed(evt);
            }
        });

        CH1.setText("SUMA");
        CH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CH1ActionPerformed(evt);
            }
        });

        CH3.setText("MULTRIPLICAR");
        CH3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CH3ActionPerformed(evt);
            }
        });

        CH2.setText("RESTA");
        CH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CH2ActionPerformed(evt);
            }
        });

        CH4.setText("DIVIDIR");
        CH4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CH4ActionPerformed(evt);
            }
        });

        JB1.setText("RESULTADO");
        JB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL4)
                            .addComponent(JL5)
                            .addComponent(jLabel5))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JT4, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(JT5)
                            .addComponent(JT6)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CH4)
                                .addGap(18, 18, 18)
                                .addComponent(CH3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CH1)
                                .addGap(33, 33, 33)
                                .addComponent(CH2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(JB1)))))
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JL4)
                            .addComponent(JT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JL5)
                            .addComponent(JT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CH2)
                            .addComponent(CH1))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB1)
                        .addGap(3, 3, 3)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CH4)
                    .addComponent(CH3))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CHEQUEO", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
      try{
        int a,b,c;
       String a1, b1;
       a1=this.JT1.getText();
       b1=this.JJT2.getText();
       a=Integer.parseInt(a1);
       b=Integer.parseInt(b1);
       c=a+b;
      this.JT3.setText(String.valueOf(c));
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "no se puede realizar ninguna operacion");
       }        // TODO add your ha
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
try{
        int a,b,c;
       String a1, b1;
       a1=this.JT1.getText();
       b1=this.JJT2.getText();
       a=Integer.parseInt(a1);
       b=Integer.parseInt(b1);
       c=a-b;
       this.JT3.setText(String.valueOf(c));
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "no se puede realizar ninguna operacion");
       }        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        try{
        int a,b,c;
       String a1, b1;
       a1=this.JT1.getText();
       b1=this.JJT2.getText();
       a=Integer.parseInt(a1);
       b=Integer.parseInt(b1);
       c=a*b;
       this.JT3.setText(String.valueOf(c));
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "no se puede realizar ninguna operacion");
       }        // TODO add your ha
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        try{
        int a,b,c;
       String a1, b1;
       a1=this.JT1.getText();
       b1=this.JJT2.getText();
       a=Integer.parseInt(a1);
       b=Integer.parseInt(b1);
       c=a/b;
       this.JT3.setText(String.valueOf(c));
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "no se puede realizar ninguna operacion");
       }        // TODO add your ha
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void JT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT5ActionPerformed

    private void CH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CH1ActionPerformed
       
    }//GEN-LAST:event_CH1ActionPerformed

    private void CH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CH2ActionPerformed
       
    }//GEN-LAST:event_CH2ActionPerformed

    private void CH3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CH3ActionPerformed
        
    }//GEN-LAST:event_CH3ActionPerformed

    private void CH4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CH4ActionPerformed
       
    }//GEN-LAST:event_CH4ActionPerformed

    private void JB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB1ActionPerformed
     
        
        
        if(CH1.isSelected()){
           try{
        int a,b,c;
       String a1, b1;
       a1=this.JT4.getText();
       b1=this.JT5.getText();
       a=Integer.parseInt(a1);
       b=Integer.parseInt(b1);
       c=a+b;
       this.JT6.setText(String.valueOf(c));
       JOptionPane.showMessageDialog(null, "resultado suma");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "no se puede realizar ninguna operacion");
       }        
      }
       if(CH2.isSelected()){
           try{
        int a,b,c;
       String a1, b1;
       a1=this.JT4.getText();
       b1=this.JT5.getText();
       a=Integer.parseInt(a1);
       b=Integer.parseInt(b1);
       c=a-b;
       this.JT6.setText(String.valueOf(c));
       JOptionPane.showMessageDialog(null, "resultado resta");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "no se puede realizar ninguna operacion");
       }        
      }
        if(CH3.isSelected()){
           try{
        int a,b,c;
       String a1, b1;
       a1=this.JT4.getText();
       b1=this.JT5.getText();
       a=Integer.parseInt(a1);
       b=Integer.parseInt(b1);
       c=a*b;
       this.JT6.setText(String.valueOf(c));
       JOptionPane.showMessageDialog(null, "resultado multiplicacion");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "no se puede realizar ninguna operacion");
       }        
      }
         if(CH4.isSelected()){
           try{
        int a,b,c;
       String a1, b1;
       a1=this.JT4.getText();
       b1=this.JT5.getText();
       a=Integer.parseInt(a1);
       b=Integer.parseInt(b1);
       c=a/b;
       this.JT6.setText(String.valueOf(c));
       JOptionPane.showMessageDialog(null, "resultado division");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "no se puede realizar ninguna operacion");
       }        
      }
        
            
        
    }//GEN-LAST:event_JB1ActionPerformed

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
            java.util.logging.Logger.getLogger(parcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(parcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(parcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(parcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parcial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CH1;
    private javax.swing.JCheckBox CH2;
    private javax.swing.JCheckBox CH3;
    private javax.swing.JCheckBox CH4;
    private javax.swing.JButton JB1;
    private javax.swing.JTextField JJT2;
    private javax.swing.JLabel JL1;
    private javax.swing.JLabel JL2;
    private javax.swing.JLabel JL3;
    private javax.swing.JLabel JL4;
    private javax.swing.JLabel JL5;
    private javax.swing.JTextField JT1;
    private javax.swing.JTextField JT3;
    private javax.swing.JTextField JT4;
    private javax.swing.JTextField JT5;
    private javax.swing.JTextField JT6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
