/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALLGUI;

import javax.swing.JFrame;
import ALLCLASS.*;
//import static ALLCLASS.ReadWriteDataFromFiles.pearsons;
import java.awt.*;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ArtistPage extends javax.swing.JFrame {
    private static final String URL = "jdbc:mysql://localhost:3306/art_management";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "manya123";


    /**
     * Creates new form ArtistPage
     */
    public String userid;
    private String addimagepath;
    private ARTWORK artistartwork[] = new ARTWORK[20];
    private int artworksize = 0;
    private int changephoto;
    
    public ArtistPage(String userid) {
        initComponents();
        this.setLocationRelativeTo(null);
        changephoto = 0;
        this.userid = userid;
        
        
        setprofiledata(this.userid);
//        addphotoid.setText("" + (ReadWriteDataFromFiles.artworksize+1));
//        if(artworksize > 0)
//            set_portfolio_data();
        
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minminze = new javax.swing.JLabel();
        closeicon = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        yourprofiletab1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        idlabel = new javax.swing.JLabel();
        setidlabel = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        setnamelabel1 = new javax.swing.JLabel();
        agelabel = new javax.swing.JLabel();
        setagelabel = new javax.swing.JLabel();
        setnationalitylabel = new javax.swing.JLabel();
        nationaliylabel = new javax.swing.JLabel();
        styleofartslabel = new javax.swing.JLabel();
        setstyleofartslabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        totalearnedmoneylabel = new javax.swing.JLabel();
        nofboughtphotolabel = new javax.swing.JLabel();
        tnofphotolabel = new javax.swing.JLabel();
        settotalearnedmoneylabel = new javax.swing.JLabel();
        settnofphotolabel = new javax.swing.JLabel();
        setnofboughtphotolabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Head.setBackground(new java.awt.Color(0, 0, 0));
        Head.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Head.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ART GALLERY");

        minminze.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        minminze.setForeground(new java.awt.Color(255, 255, 255));
        minminze.setText("-");
        minminze.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minminze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minminzeMouseClicked(evt);
            }
        });

        closeicon.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        closeicon.setForeground(new java.awt.Color(255, 255, 255));
        closeicon.setText("X");
        closeicon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeiconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minminze)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeicon)
                .addGap(18, 18, 18))
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minminze)
                    .addComponent(closeicon))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jTabbedPane1.setInheritsPopupMenu(true);

        yourprofiletab1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        idlabel.setBackground(new java.awt.Color(204, 255, 51));
        idlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idlabel.setText("ID :");
        jPanel1.add(idlabel);
        idlabel.setBounds(20, 50, 34, 35);

        setidlabel.setBackground(new java.awt.Color(204, 255, 51));
        setidlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setidlabel.setText(" ");
        jPanel1.add(setidlabel);
        setidlabel.setBounds(90, 60, 63, 30);

        namelabel.setBackground(new java.awt.Color(204, 255, 51));
        namelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namelabel.setText("Name :");
        jPanel1.add(namelabel);
        namelabel.setBounds(20, 90, 65, 35);

        setnamelabel1.setBackground(new java.awt.Color(204, 255, 51));
        setnamelabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setnamelabel1.setText(" ");
        jPanel1.add(setnamelabel1);
        setnamelabel1.setBounds(100, 100, 63, 30);

        agelabel.setBackground(new java.awt.Color(204, 255, 51));
        agelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        agelabel.setText("Age :");
        jPanel1.add(agelabel);
        agelabel.setBounds(20, 130, 60, 35);

        setagelabel.setBackground(new java.awt.Color(204, 255, 51));
        setagelabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setagelabel.setText(" ");
        jPanel1.add(setagelabel);
        setagelabel.setBounds(90, 130, 93, 30);

        setnationalitylabel.setBackground(new java.awt.Color(204, 255, 51));
        setnationalitylabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setnationalitylabel.setText(" ");
        jPanel1.add(setnationalitylabel);
        setnationalitylabel.setBounds(130, 170, 93, 30);

        nationaliylabel.setBackground(new java.awt.Color(204, 255, 51));
        nationaliylabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nationaliylabel.setText("Nationality : ");
        jPanel1.add(nationaliylabel);
        nationaliylabel.setBounds(20, 170, 120, 35);

        styleofartslabel.setBackground(new java.awt.Color(204, 255, 51));
        styleofartslabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        styleofartslabel.setText("Style of Art :");
        jPanel1.add(styleofartslabel);
        styleofartslabel.setBounds(20, 210, 120, 35);

        setstyleofartslabel.setBackground(new java.awt.Color(204, 255, 51));
        setstyleofartslabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setstyleofartslabel.setText(" ");
        jPanel1.add(setstyleofartslabel);
        setstyleofartslabel.setBounds(150, 220, 170, 22);

        jLabel10.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Personal Information");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 20, 220, 24);

        yourprofiletab1.add(jPanel1);
        jPanel1.setBounds(390, 170, 450, 320);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        totalearnedmoneylabel.setBackground(new java.awt.Color(204, 255, 51));
        totalearnedmoneylabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalearnedmoneylabel.setText("Total Earned Money : ");
        jPanel2.add(totalearnedmoneylabel);
        totalearnedmoneylabel.setBounds(10, 50, 200, 35);

        nofboughtphotolabel.setBackground(new java.awt.Color(204, 255, 51));
        nofboughtphotolabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nofboughtphotolabel.setText("Number of Sold Photos :");
        jPanel2.add(nofboughtphotolabel);
        nofboughtphotolabel.setBounds(10, 90, 240, 35);

        tnofphotolabel.setBackground(new java.awt.Color(204, 255, 51));
        tnofphotolabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tnofphotolabel.setText("Total no. of photos : ");
        jPanel2.add(tnofphotolabel);
        tnofphotolabel.setBounds(10, 130, 190, 35);

        settotalearnedmoneylabel.setBackground(new java.awt.Color(204, 255, 51));
        settotalearnedmoneylabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        settotalearnedmoneylabel.setText(" ");
        jPanel2.add(settotalearnedmoneylabel);
        settotalearnedmoneylabel.setBounds(200, 50, 80, 30);

        settnofphotolabel.setBackground(new java.awt.Color(204, 255, 51));
        settnofphotolabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        settnofphotolabel.setText(" ");
        jPanel2.add(settnofphotolabel);
        settnofphotolabel.setBounds(200, 130, 80, 30);

        setnofboughtphotolabel1.setBackground(new java.awt.Color(204, 255, 51));
        setnofboughtphotolabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setnofboughtphotolabel1.setText(" ");
        jPanel2.add(setnofboughtphotolabel1);
        setnofboughtphotolabel1.setBounds(220, 90, 80, 30);

        jLabel11.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Photos Information");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(80, 20, 200, 24);

        yourprofiletab1.add(jPanel2);
        jPanel2.setBounds(130, 500, 630, 210);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/andreas-fickl-o1xcUi-Yt_w-unsplash.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        yourprofiletab1.add(jLabel2);
        jLabel2.setBounds(0, -170, 1440, 950);

        jTabbedPane1.addTab("Your Profile", yourprofiletab1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    
    private void minminzeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minminzeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minminzeMouseClicked

    private void closeiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeiconMouseClicked
        //System.exit(0);
        this.dispose();
        new LOGINFORM().setVisible(true);
    }//GEN-LAST:event_closeiconMouseClicked

public void setprofiledata(String userId) {
    if (!userId.isEmpty()) { // Check if user ID is not empty
        int getidU = Integer.parseInt(userId); // Convert user ID from String to int
        if (getidU >= 0) { // Ensuring SignInid is valid
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/art_management", "root", "manya123");  
                String queryA = "SELECT artistid FROM artist WHERE password=(SELECT password FROM users WHERE userid=?)";
                PreparedStatement pstmta = con.prepareStatement(queryA);
                pstmta.setInt(1, getidU);
                ResultSet rsa = pstmta.executeQuery();
                if (rsa.next()) { // Check if result set has data
                    int getid = rsa.getInt("artistid"); // Retrieve artist ID
                    System.out.println("Artist ID: " + getid); // Debugging: Print artist ID
                    
                    String query = "SELECT * FROM artist WHERE artistid = ?";
                    PreparedStatement pstmt = con.prepareStatement(query);
                    pstmt.setInt(1, getid);
                    ResultSet rs = pstmt.executeQuery();
                    if (rs.next()) {
                        // Retrieving artist details from the database
                        String name = rs.getString("aname");
                        int age = rs.getInt("age");
                        String nationality = rs.getString("nationality");
                        String styleOfArts = rs.getString("style");

                        // Displaying artist details on the UI
                        setidlabel.setText(String.valueOf(getid));
                        setnamelabel1.setText(name);
                        setagelabel.setText(String.valueOf(age));
                        setnationalitylabel.setText(nationality);
                        setstyleofartslabel.setText(styleOfArts);

                        // Calculating total earned money and total bought photos
                        int totalearnedmoney = 0, totalboughtphotos = 0;
                        Statement stmt = con.createStatement();
                        ResultSet artworkRs = stmt.executeQuery("SELECT * FROM artwork");
                        while (artworkRs.next()) {
                            int artistId = artworkRs.getInt("artistid");
                            if (artistId == getid) {
                                int price = artworkRs.getInt("price");
                                totalearnedmoney += price;
                                totalboughtphotos++;
                            }
                        }
                        // Displaying total earned money and total bought photos on the UI
                        settotalearnedmoneylabel.setText(totalearnedmoney + " $");
                        setnofboughtphotolabel1.setText(String.valueOf(totalboughtphotos));
                        settnofphotolabel.setText(String.valueOf(totalboughtphotos));
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No artist found with the given user ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            
            // Handle case when SignInid is not valid
            // For example, display an error message or take appropriate action
        }
    } else {
        // Handle case when user ID is empty
        // For example, display an error message or take appropriate action
    }
}

    
//    private void set_portfolio_data()
//    {
//         photoplacejLabel2.setIcon(resizeImage(artistartwork[changephoto].getPath(), null,photoplacejLabel2));
//         setidLabel9.setText("" + artistartwork[changephoto].getId());
//         settitleLabel11.setText(artistartwork[changephoto].getTitle());
//         setpriceLabel10.setText("" +artistartwork[changephoto].getPrice()); 
//         seyearLabel12.setText("" +artistartwork[changephoto].getYear()); 
//         setcategoryLabel13.setText(artistartwork[changephoto].getTypeOfArt());
//         
//         if(artistartwork[changephoto].getIdCustomer()> 0 )
//         setcustomerLabel14.setText(ReadWriteDataFromFiles.pearsons[artistartwork[changephoto].getIdCustomer() - 1].getName()); 
//         else
//             setcustomerLabel14.setText("Not Bought Yet");
//         chngenuberlabel.setText((changephoto +1)+ "/" + artworksize);
//    }
    
    
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
            java.util.logging.Logger.getLogger(ArtistPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArtistPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArtistPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArtistPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ArtistPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Head;
    private javax.swing.JLabel agelabel;
    private javax.swing.JLabel closeicon;
    private javax.swing.JLabel idlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel minminze;
    private javax.swing.JLabel namelabel;
    private javax.swing.JLabel nationaliylabel;
    private javax.swing.JLabel nofboughtphotolabel;
    private javax.swing.JLabel setagelabel;
    private javax.swing.JLabel setidlabel;
    private javax.swing.JLabel setnamelabel1;
    private javax.swing.JLabel setnationalitylabel;
    private javax.swing.JLabel setnofboughtphotolabel1;
    private javax.swing.JLabel setstyleofartslabel;
    private javax.swing.JLabel settnofphotolabel;
    private javax.swing.JLabel settotalearnedmoneylabel;
    private javax.swing.JLabel styleofartslabel;
    private javax.swing.JLabel tnofphotolabel;
    private javax.swing.JLabel totalearnedmoneylabel;
    private javax.swing.JPanel yourprofiletab1;
    // End of variables declaration//GEN-END:variables
}
