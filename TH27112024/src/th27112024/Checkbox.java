/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package th27112024;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Checkbox extends javax.swing.JFrame {

    /**
     * Creates new form Checkbox
     */
    public Checkbox() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        CBCam = new javax.swing.JCheckBox();
        CBXoai = new javax.swing.JCheckBox();
        CBMit = new javax.swing.JCheckBox();
        CBDua = new javax.swing.JCheckBox();
        CBBuoi = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RBK15 = new javax.swing.JRadioButton();
        RBK16 = new javax.swing.JRadioButton();
        RBK17 = new javax.swing.JRadioButton();
        RBK18 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CBCam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CBCam.setText("Cam");

        CBXoai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CBXoai.setText("Xoài");

        CBMit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CBMit.setText("Mít");

        CBDua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CBDua.setText("Dưa Lưới");

        CBBuoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CBBuoi.setText("Bưởi");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Display");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("HOA QUẢ ƯA THÍCH");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("BẠN ĐANG HỌC KHÓA");

        buttonGroup1.add(RBK15);
        RBK15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        RBK15.setText("K15");

        buttonGroup1.add(RBK16);
        RBK16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        RBK16.setText("K16");

        buttonGroup1.add(RBK17);
        RBK17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        RBK17.setText("K17");

        buttonGroup1.add(RBK18);
        RBK18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        RBK18.setText("K18");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBCam)
                    .addComponent(CBBuoi)
                    .addComponent(CBDua)
                    .addComponent(CBMit)
                    .addComponent(CBXoai))
                .addGap(53, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RBK15, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RBK16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RBK17, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RBK18, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBCam)
                    .addComponent(RBK15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBXoai)
                    .addComponent(RBK16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBMit)
                    .addComponent(RBK17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBDua)
                    .addComponent(RBK18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBBuoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Check Box
        if(CBCam.isSelected()) System.out.println("Bạn thích ăn "+ CBCam.getText());
        if(CBXoai.isSelected()) System.out.println("Bạn thích ăn "+ CBXoai.getText());
        if(CBMit.isSelected()) System.out.println("Bạn thích ăn "+ CBMit.getText());
        if(CBDua.isSelected()) System.out.println("Bạn thích ăn "+ CBDua.getText());
        if(CBBuoi.isSelected()) System.out.println("Bạn thích ăn "+ CBBuoi.getText());
        
        //Radio Button
        if(RBK15.isSelected()) JOptionPane.showMessageDialog(this, "Bạn học "+ RBK15.getText());
        else if(RBK16.isSelected()) JOptionPane.showMessageDialog(this, "Bạn học "+ RBK16.getText());
        else if(RBK17.isSelected()) JOptionPane.showMessageDialog(this, "Bạn học "+ RBK17.getText());
        else JOptionPane.showMessageDialog(this, "Bạn học "+RBK18.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Checkbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkbox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBBuoi;
    private javax.swing.JCheckBox CBCam;
    private javax.swing.JCheckBox CBDua;
    private javax.swing.JCheckBox CBMit;
    private javax.swing.JCheckBox CBXoai;
    private javax.swing.JRadioButton RBK15;
    private javax.swing.JRadioButton RBK16;
    private javax.swing.JRadioButton RBK17;
    private javax.swing.JRadioButton RBK18;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
