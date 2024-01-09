
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() throws ClassNotFoundException{
        conn = Connector.ConnectDatabase();
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

        lblID = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        fieldID = new javax.swing.JTextField();
        fieldPassword = new javax.swing.JPasswordField();
        comboBox = new javax.swing.JComboBox<>();
        btnSignUp = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblID.setText("ID");
        lblID.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 175, 55, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword.setText("PASSWORD");
        lblPassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 233, -1, -1));

        lblType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblType.setText("TYPE");
        getContentPane().add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 289, -1, -1));

        fieldID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fieldID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIDActionPerformed(evt);
            }
        });
        getContentPane().add(fieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 170, -1));

        fieldPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fieldPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 170, -1));

        comboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teacher", "Student" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 160, -1));

        btnSignUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSignUp.setText("SignUp");
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 90, -1));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 110, -1));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblImage)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIDActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        choice = comboBox.getSelectedItem().toString();
    }//GEN-LAST:event_comboBoxActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        setVisible(false);
                SignUp sign;
                try {
                    sign = new SignUp();
                    sign.setLocationRelativeTo(null);
                    sign.setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        boolean found = false;
                
                try {
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery("SELECT * FROM "+choice);
                    int userID = Integer.parseInt(fieldID.getText());
                    String userPassword = Hash.getHash(fieldPassword.getText());
                    
                    while(rs.next()){
                        int dataBaseID = rs.getInt("ID");
                        String dataBasePassword = rs.getString("Password");
                        String fName = rs.getString("First_Name");
                        String lName = rs.getString("Last_Name");
                        String name = fName + " " + lName;
                        
                        if(userID==dataBaseID && userPassword.equals(dataBasePassword)){
                            found = true;
                            
                            if(choice.equals("Administrator")){
                                setVisible(false);
                                try {
                                    Administrator admin = new Administrator();
                                    admin.setLocationRelativeTo(null);
                                    admin.setVisible(true);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            
                            
                            else if(choice.equals("Student")){
                                setVisible(false);
                                Student student;
                                try {
                                    student = new Student(userID,name);
                                    student.setLocationRelativeTo(null);
                                    student.setVisible(true);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            
                            else{
                                setVisible(false);
                                Teacher teacher;
                                try {
                                    teacher = new Teacher(userID,name);
                                    teacher.setLocationRelativeTo(null);
                                    teacher.setVisible(true);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                    
                    if(!found){
                        JDialog dialog = new JDialog();
                        dialog.setAlwaysOnTop(true);    
                        JOptionPane.showMessageDialog(dialog, "UserID or Password is incorrect" , null , JOptionPane.PLAIN_MESSAGE );
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_btnLoginActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginPage lp = new LoginPage();
                    lp.setLocationRelativeTo(null);
                    lp.setVisible(true);
                    //new LoginPage().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTextField fieldID;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblType;
    // End of variables declaration//GEN-END:variables
    private String choice;
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
}

