/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALLGUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import ALLCLASS.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class LOGINFORM extends javax.swing.JFrame {
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/art_management";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "manya123";
    static int SignInid;

    private Connection conn;
    private String username;
    private String password;

   
    public LOGINFORM() {
        initComponents();
        this.setLocationRelativeTo(null);//center the form

        // Establish database connection
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to connect to the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LOGINHEADERBAR = new javax.swing.JPanel();
        LOGINHEADER = new javax.swing.JLabel();
        CloseBtn = new javax.swing.JLabel();
        MinimizeBtn = new javax.swing.JLabel();
        LOGINBODY = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        usernamelablel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordlabel = new javax.swing.JLabel();
        passwordField2 = new javax.swing.JPasswordField();
        showpasswordCheckBox = new javax.swing.JCheckBox();
        loginbutton = new javax.swing.JButton();
        NewclientButton = new javax.swing.JButton();
        newartistbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ViewGallery = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        LOGINHEADERBAR.setBackground(new java.awt.Color(87, 96, 111));

        LOGINHEADER.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        LOGINHEADER.setForeground(new java.awt.Color(255, 255, 255));
        LOGINHEADER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGINHEADER.setText("ART GALLERY");

        CloseBtn.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        CloseBtn.setForeground(new java.awt.Color(255, 255, 255));
        CloseBtn.setText("X");
        CloseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBtnMouseClicked(evt);
            }
        });

        MinimizeBtn.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        MinimizeBtn.setForeground(new java.awt.Color(255, 255, 255));
        MinimizeBtn.setText("-");
        MinimizeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LOGINHEADERBARLayout = new javax.swing.GroupLayout(LOGINHEADERBAR);
        LOGINHEADERBAR.setLayout(LOGINHEADERBARLayout);
        LOGINHEADERBARLayout.setHorizontalGroup(
            LOGINHEADERBARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGINHEADERBARLayout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(LOGINHEADER, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 448, Short.MAX_VALUE)
                .addComponent(MinimizeBtn)
                .addGap(18, 18, 18)
                .addComponent(CloseBtn)
                .addGap(18, 18, 18))
        );
        LOGINHEADERBARLayout.setVerticalGroup(
            LOGINHEADERBARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGINHEADERBARLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LOGINHEADERBARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(LOGINHEADERBARLayout.createSequentialGroup()
                        .addComponent(CloseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addGroup(LOGINHEADERBARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MinimizeBtn)
                        .addComponent(LOGINHEADER)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LOGINBODY.setBackground(new java.awt.Color(47, 53, 66));
        LOGINBODY.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        usernamelablel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usernamelablel.setForeground(new java.awt.Color(51, 51, 51));
        usernamelablel.setText("Username :");

        usernameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        passwordlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordlabel.setForeground(new java.awt.Color(51, 51, 51));
        passwordlabel.setText("Password :");

        passwordField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        showpasswordCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        showpasswordCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        showpasswordCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        showpasswordCheckBox.setText("showPassword");
        showpasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordCheckBoxActionPerformed(evt);
            }
        });

        loginbutton.setBackground(new java.awt.Color(0, 0, 0));
        loginbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loginbutton.setForeground(new java.awt.Color(255, 255, 255));
        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        NewclientButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        NewclientButton.setText("New Client");
        NewclientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewclientButtonActionPerformed(evt);
            }
        });

        newartistbutton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        newartistbutton.setText("New Artist");
        newartistbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newartistbuttonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN FORM");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-icon.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User-Interface-Password-2-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addComponent(showpasswordCheckBox))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(usernamelablel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(152, 152, 152))))
                .addGap(119, 119, 119))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(NewclientButton)
                        .addGap(105, 105, 105)
                        .addComponent(newartistbutton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(226, 226, 226))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(usernamelablel)
                                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordlabel)
                            .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showpasswordCheckBox)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(loginbutton)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewclientButton)
                    .addComponent(newartistbutton))
                .addGap(24, 24, 24))
        );

        LOGINBODY.add(jPanel1);
        jPanel1.setBounds(1010, 200, 420, 290);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SEE FEATURED ARTS OF BELOVED ARTISTS");

        jButton1.setText("VIKAS CHOPRA");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SHRI VENKATESH");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("ANDREW THOMAS");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        LOGINBODY.add(jPanel3);
        jPanel3.setBounds(30, 70, 800, 110);

        ViewGallery.setBackground(new java.awt.Color(153, 204, 255));
        ViewGallery.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewGallery.setForeground(new java.awt.Color(255, 255, 255));
        ViewGallery.setText("VIEW GALLERY SPACES");
        ViewGallery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewGalleryMouseClicked(evt);
            }
        });
        ViewGallery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewGalleryActionPerformed(evt);
            }
        });
        LOGINBODY.add(ViewGallery);
        ViewGallery.setBounds(30, 680, 310, 40);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG-20240423-WA0007.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        LOGINBODY.add(jLabel2);
        jLabel2.setBounds(-40, -140, 1491, 1010);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        LOGINBODY.add(jPanel2);
        jPanel2.setBounds(220, 170, 590, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOGINHEADERBAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LOGINBODY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(LOGINBODY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(LOGINHEADERBAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 790, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    public String[] checkdata() {
    String[] userData = new String[2]; // Initialize array to store user ID and role
    String username = usernameTextField.getText();
    String password = passwordField2.getText();

    String query = "SELECT userid, role FROM users WHERE username = ? AND password = ?";
    try {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, username);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();
        System.out.println("done"+rs);
        if (rs.next()) {
            // User found in the database
            userData[0] = rs.getString("userid"); // Store user ID
            userData[1] = rs.getString("role"); // Store role
            System.out.println(userData[0]+" "+userData[1]);
            
        } else {
            // No user found with the given credentials
            userData[1] = "fail"; // Set role to "fail"
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        userData[1] = "fail"; // Set role to "fail" in case of database error
    }
    return userData; // Return array containing user ID and role
}
    
    private void CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseBtnMouseClicked

    private void MinimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeBtnMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeBtnMouseClicked

    private void showpasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordCheckBoxActionPerformed
        if(showpasswordCheckBox.isSelected())
        passwordField2.setEchoChar((char)0);
        else {
            passwordField2.setEchoChar('*');
        }

    }//GEN-LAST:event_showpasswordCheckBoxActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed

        username = usernameTextField.getText();
        password = passwordField2.getText();
        String[] userData = checkdata();
        String userId = userData[0];
        String role = userData[1];

    // Perform actions based on the user role (switch-case)

    // Call setprofiledata() method of the corresponding page class
    switch (role) {
        case "artist":
            new ArtistPage(userId).setVisible(true);
            this.dispose();
            //new ArtistPage(userId).setprofiledata(userId); // Pass user ID to setprofiledata() method
            break;

        case "customer":
            new CustomerPage(userId).setVisible(true);
            this.dispose();
//            new CustomerPage().setprofiledata(userId); // Pass user ID to setprofiledata() method
            break;

        case "admin":
            new AdminPage().setVisible(true);
            this.dispose();
//            new AdminPage().setprofiledata(userId); // Pass user ID to setprofiledata() method
            break;

        case "fail":
            JOptionPane.showMessageDialog(LOGINBODY, "Invalid Username or Password", "Welcome", JOptionPane.ERROR_MESSAGE);
            break;

        default:
            break;
    }
        //JOptionPane.showMessageDialog(this,"fail Login.","YaWelcome", JOptionPane.ERROR_MESSAGE);
           
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void NewclientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewclientButtonActionPerformed
        AddNewCustomerForm newcustomerform = new AddNewCustomerForm();
        newcustomerform.setVisible(true);
        newcustomerform.pack();
        newcustomerform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_NewclientButtonActionPerformed

    private void newartistbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newartistbuttonMouseClicked
        AddNewArtistFrom newcustomerform = new AddNewArtistFrom();
        newcustomerform.setVisible(true);
        newcustomerform.pack();
        newcustomerform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_newartistbuttonMouseClicked

    private void ViewGalleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewGalleryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewGalleryActionPerformed

    private void ViewGalleryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewGalleryMouseClicked
        // TODO add your handling code here:
       java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new JtableData().setVisible(true);
        }
    });
    }//GEN-LAST:event_ViewGalleryMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new artist1().setVisible(true);
            
        }
        });
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new artist22().setVisible(true);
        }
        });
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new artist33().setVisible(true);
        }
        });
        
    }//GEN-LAST:event_jButton3MouseClicked
 /** */
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
            java.util.logging.Logger.getLogger(LOGINFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGINFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGINFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGINFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGINFORM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JPanel LOGINBODY;
    private javax.swing.JLabel LOGINHEADER;
    private javax.swing.JPanel LOGINHEADERBAR;
    private javax.swing.JLabel MinimizeBtn;
    private javax.swing.JButton NewclientButton;
    private javax.swing.JButton ViewGallery;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginbutton;
    private javax.swing.JButton newartistbutton;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JCheckBox showpasswordCheckBox;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel usernamelablel;
    // End of variables declaration//GEN-END:variables
}