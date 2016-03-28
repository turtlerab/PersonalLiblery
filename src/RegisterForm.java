import java.sql.*;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

public class RegisterForm extends javax.swing.JFrame {

    String ConfirmCode = null; //ตัวแปรที่จะส่งค่าให้กับ Confirm Class
    public RegisterForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lRegisUser = new javax.swing.JLabel();
        tfRegisUser = new javax.swing.JTextField();
        lRegisPass = new javax.swing.JLabel();
        pfRegispass = new javax.swing.JPasswordField();
        lTitleRegis = new javax.swing.JLabel();
        bRegisComfirm = new javax.swing.JButton();
        bRegisClear = new javax.swing.JButton();
        bBacktoLogin = new javax.swing.JButton();
        lbRegisEmail = new javax.swing.JLabel();
        tfRegisEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lRegisUser.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        lRegisUser.setForeground(new java.awt.Color(0, 0, 255));
        lRegisUser.setText("Username:");

        lRegisPass.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        lRegisPass.setForeground(new java.awt.Color(0, 0, 255));
        lRegisPass.setText("Password:");

        pfRegispass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfRegispassActionPerformed(evt);
            }
        });

        lTitleRegis.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lTitleRegis.setForeground(new java.awt.Color(0, 204, 0));
        lTitleRegis.setText("Personal Library Register");

        bRegisComfirm.setText("Comfirm");
        bRegisComfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegisComfirmActionPerformed(evt);
            }
        });

        bRegisClear.setText("Clear");
        bRegisClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegisClearActionPerformed(evt);
            }
        });

        bBacktoLogin.setText("Login");
        bBacktoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBacktoLoginActionPerformed(evt);
            }
        });

        lbRegisEmail.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        lbRegisEmail.setForeground(new java.awt.Color(0, 0, 255));
        lbRegisEmail.setText("Email:");
        lbRegisEmail.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bBacktoLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lTitleRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lRegisPass)
                            .addComponent(lRegisUser)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbRegisEmail)
                                .addGap(16, 16, 16)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfRegisUser, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(pfRegispass)
                            .addComponent(tfRegisEmail)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(bRegisComfirm)
                        .addGap(55, 55, 55)
                        .addComponent(bRegisClear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lTitleRegis)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lRegisUser)
                    .addComponent(tfRegisUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lRegisPass)
                    .addComponent(pfRegispass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRegisEmail)
                    .addComponent(tfRegisEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRegisComfirm)
                    .addComponent(bRegisClear))
                .addComponent(bBacktoLogin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pfRegispassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfRegispassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfRegispassActionPerformed

    private void bRegisClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegisClearActionPerformed
        tfRegisUser.setText(""); //กด Clear จะ set Username ให้ว่าง
        pfRegispass.setText(""); //กด Clear จะ set ว่าง ให้ว่าง
    }//GEN-LAST:event_bRegisClearActionPerformed

    private void bBacktoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBacktoLoginActionPerformed
        dispose(); //เมือกดปุ่ม back จะทำการกลับไปหน้า login
        new LoginForm().setVisible(true);
        
    }//GEN-LAST:event_bBacktoLoginActionPerformed

    private void bRegisComfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegisComfirmActionPerformed
        Connection conn = null;
        PreparedStatement pstmt = null;
        conn = MySqlConnect.ConnectDB(); //เชื่อมต่อกับ database
        try{
            
            String query = "SELECT `Username`, `Password` FROM `member` WHERE `Username` = ?" ; //กำหนดคำสั่งที่จะส่งให้ database
            PreparedStatement checkstmt = conn.prepareStatement(query);
            checkstmt.setString(1, tfRegisUser.getText()); //กำหนดค่าที่จะส่งให้ database
            ResultSet result =  checkstmt.executeQuery(); //เก้บผลลัพธ์ของการส่งค่า
            
            if(result.next()){ //หากมีค่าที่ส่งไปอยู่ใน database แสดงว่า Username ที่สมัครซ้ำ
                    JOptionPane.showMessageDialog(null, "Username Duplicate!!");
            }else{ 
                if(tfRegisUser.getText().equals("")){  //Username ยังไม่ได้กรอก
                    JOptionPane.showMessageDialog(null, "Please Enter Username!!");
                               
                }else if(pfRegispass.getText().equals("")){ //password ยังไม่ได้กรอก
                    JOptionPane.showMessageDialog(null, "Please Enter Password!!");
                }else if(tfRegisEmail.getText().equals("")){ //Email ยังไม่ได้กรอก
                    JOptionPane.showMessageDialog(null, "Please Enter Email!!");
                }else{
                    
                    String[] to = {tfRegisEmail.getText()}; //เก็บ Email ผู้รับ
                    MyStringRandomGen msr = new MyStringRandomGen(); //random Code Confirm
                    ConfirmCode = msr.generateRandomString();
                    System.out.println(ConfirmCode);
                    if(EmailSender.sendMail("PDF_viewer@hotmail.com","abc123456789","Code Confirm for Register:"+ConfirmCode,to)){ //ส่ง codeconfirm ไปให้Email ผู้รับ
                        System.out.println("Send to Email Successful");
                        Confirm confirm = new Confirm(tfRegisUser.getText(),pfRegispass.getPassword(),ConfirmCode); //เมื่อส่งสำเร็จจะสร้างหน้าต่างสำหรับใส่ codeconfirm
                        confirm.setVisible(true); //เปิดหน้าต่างใส่ codeconfirm                       
                    }
                    else System.out.println("Error"); //หากส่งไม่สำเร็จจะแจ้งเตือน Error
                }
            }
                


                
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        } catch (MessagingException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bRegisComfirmActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBacktoLogin;
    private javax.swing.JButton bRegisClear;
    private javax.swing.JButton bRegisComfirm;
    private javax.swing.JLabel lRegisPass;
    private javax.swing.JLabel lRegisUser;
    private javax.swing.JLabel lTitleRegis;
    private javax.swing.JLabel lbRegisEmail;
    private javax.swing.JPasswordField pfRegispass;
    private javax.swing.JTextField tfRegisEmail;
    private javax.swing.JTextField tfRegisUser;
    // End of variables declaration//GEN-END:variables
}
