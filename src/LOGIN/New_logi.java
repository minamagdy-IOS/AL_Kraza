/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LOGIN;

import java.awt.Font;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class New_logi extends javax.swing.JFrame {

    /**
     * Creates new form New_logi
     */
    public New_logi() {
        initComponents();
        txtname.setBackground(new java.awt.Color(0, 0, 0, 1));
txtpass.setBackground(new java.awt.Color(0, 0, 0, 1));
txtmail.setBackground(new java.awt.Color(0, 0, 0, 1));
txtpho.setBackground(new java.awt.Color(0, 0, 0, 1));
jButton2.setBackground(new java.awt.Color(0, 0, 0, 1));
B.setBackground(new java.awt.Color(0, 0, 0, 1));
FONT1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtpho = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        job = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        A = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        FONT1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        imge = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("_______________________________________________________________");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 450, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 0, 32, 32));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 0, 32, 32));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("_______________________________________________________________________________");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 640, 450, 32));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("البريد الإلكتروني");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 500, 32));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("_______________________________________________________________");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 450, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("تسجيل حساب جديد");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 460, 41));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("_______________________________________________________________");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 450, 40));

        txtpho.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        txtpho.setBorder(null);
        getContentPane().add(txtpho, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, 410, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("كلمة المرور");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 500, 96));

        txtpass.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        txtpass.setBorder(null);
        txtpass.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 410, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("اسم المستخدم");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 500, 64));

        txtmail.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        txtmail.setBorder(null);
        getContentPane().add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 410, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("اهلا بك");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 460, -1));

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 0, 255));
        jToggleButton1.setText(" تسجل الدخول");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 51)));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 820, 190, 32));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(25, 118, 211));
        jButton1.setText("تسجيل");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 740, 380, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("رقم الهاتف ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, 500, 32));

        job.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        job.setForeground(new java.awt.Color(0, 153, 204));
        job.setMaximumRowCount(2);
        job.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "خادم ", "خادمة", "أمين خدمة" }));
        getContentPane().add(job, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 350, 150, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("هل تريد الرجوع صفحة تسجل الدخول؟");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 820, 310, 30));

        txtname.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        txtname.setBorder(null);
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 410, 30));

        B.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        B.setBorder(null);
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 610, 410, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("الأجابة");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 550, 280, 70));

        A.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        A.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "من هوا قديسك المفضل؟", "من هو مخدومك او خادمك المفضل؟", "ما هو اسمك رباعي؟" }));
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 610, 320, 60));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("أجب عن أحدا الاسئله الاتية");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 540, 300, 70));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("_______________________________________________________________");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, 450, 40));

        FONT1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 0));
        jButton4.setText("OK");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        FONT1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 110, 50));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 255, 51));
        jLabel17.setText("Size");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FONT1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 60));
        FONT1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, 40));

        imge.setBackground(new java.awt.Color(0, 51, 153));
        imge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/wallpaperflare.com_wallpaper (3).jpg"))); // NOI18N
        FONT1.add(imge, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 350, 460));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("FONT");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("X");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 40, 40));

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 40, 40));

        FONT1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 40));

        getContentPane().add(FONT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 350, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/wallpaperflare.com_wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar1.setForeground(new java.awt.Color(255, 0, 51));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(44, 55));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(50, 24));

        jMenu1.setBackground(new java.awt.Color(255, 0, 51));
        jMenu1.setForeground(new java.awt.Color(204, 0, 51));
        jMenu1.setText("Setting");
        jMenu1.setToolTipText("");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem3.setText("Font");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        new LOGI().setVisible(true);
            dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String   name =txtname.getText();
        String   pass=txtpass.getText();
        int phone = Integer.parseInt(txtpho.getText());
        String    email=txtmail.getText();
        String jo = (String) job.getSelectedItem();
         String a = A.getSelectedItem().toString();
        String   b =B.getText();

        try{

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "123");
            PreparedStatement ps=c.prepareStatement("INSERT INTO LOgi_AL_KRAZA VALUES ('"+name+"','"+pass+"',"+phone+",'"+email+"','"+ jo+"','"+a+"','"+b+"',SYSDATE)");
            PreparedStatement psco=c.prepareStatement("COMMIT");

            ps.executeUpdate();
            psco.execute();
            JOptionPane.showMessageDialog(null, "تم انشاء الحساب");

            dispose();
            new LOGI().setVisible(true);

            ps.close();
            c.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
FONT1.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int l = Integer.parseInt(jTextField1.getText());

        B.setFont(new Font(null,Font.BOLD,l));
        txtmail.setFont(new Font(null,Font.PLAIN,l));
        txtname.setFont(new Font(null,Font.PLAIN,l));
        txtpass.setFont(new Font(null,Font.PLAIN,l));
        txtpho.setFont(new Font(null,Font.PLAIN,l));
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
FONT1.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed
    
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
            java.util.logging.Logger.getLogger(New_logi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_logi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_logi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_logi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_logi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> A;
    private javax.swing.JTextField B;
    private javax.swing.JPanel FONT1;
    private javax.swing.JLabel imge;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> job;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtpho;
    // End of variables declaration//GEN-END:variables
}
