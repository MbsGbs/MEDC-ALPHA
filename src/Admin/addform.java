/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import config.dbconnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import loginreg.GUI;

/**
 *
 * @author ASUS
 */
public class addform extends javax.swing.JFrame {

 public addform() {
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

  right = new javax.swing.JPanel();
  Left = new javax.swing.JPanel();
  jLabel1 = new javax.swing.JLabel();
  fname = new javax.swing.JLabel();
  Lname = new javax.swing.JLabel();
  Add = new javax.swing.JButton();
  a = new javax.swing.JLabel();
  Password = new javax.swing.JLabel();
  User = new javax.swing.JLabel();
  un = new javax.swing.JTextField();
  Cancel = new javax.swing.JButton();
  User1 = new javax.swing.JLabel();
  e = new javax.swing.JTextField();
  num = new javax.swing.JTextField();
  fn = new javax.swing.JTextField();
  pass = new javax.swing.JTextField();
  ln = new javax.swing.JTextField();
  ut = new javax.swing.JComboBox<>();
  us = new javax.swing.JComboBox<>();
  Password1 = new javax.swing.JLabel();
  Password2 = new javax.swing.JLabel();
  refresh = new javax.swing.JButton();
  clear = new javax.swing.JButton();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

  right.setBackground(new java.awt.Color(88, 72, 72));

  Left.setBackground(new java.awt.Color(236, 45, 45));

  javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
  Left.setLayout(LeftLayout);
  LeftLayout.setHorizontalGroup(
   LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGap(0, 243, Short.MAX_VALUE)
  );
  LeftLayout.setVerticalGroup(
   LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGap(0, 0, Short.MAX_VALUE)
  );

  jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
  jLabel1.setForeground(new java.awt.Color(204, 204, 204));
  jLabel1.setText("Add User");

  fname.setBackground(new java.awt.Color(204, 204, 204));
  fname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
  fname.setForeground(new java.awt.Color(204, 204, 204));
  fname.setText("First Name");

  Lname.setBackground(new java.awt.Color(204, 204, 204));
  Lname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
  Lname.setForeground(new java.awt.Color(204, 204, 204));
  Lname.setText("Last Name");

  Add.setBackground(new java.awt.Color(236, 45, 45));
  Add.setText("Add");
  Add.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseClicked(java.awt.event.MouseEvent evt) {
    AddMouseClicked(evt);
   }
  });
  Add.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    AddActionPerformed(evt);
   }
  });

  a.setBackground(new java.awt.Color(204, 204, 204));
  a.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
  a.setForeground(new java.awt.Color(204, 204, 204));
  a.setText("Email");

  Password.setBackground(new java.awt.Color(204, 204, 204));
  Password.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
  Password.setForeground(new java.awt.Color(204, 204, 204));
  Password.setText("Type");

  User.setBackground(new java.awt.Color(204, 204, 204));
  User.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
  User.setForeground(new java.awt.Color(204, 204, 204));
  User.setText("Username");

  un.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    unActionPerformed(evt);
   }
  });

  Cancel.setBackground(new java.awt.Color(236, 45, 45));
  Cancel.setText("Cancel");
  Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseClicked(java.awt.event.MouseEvent evt) {
    CancelMouseClicked(evt);
   }
  });
  Cancel.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    CancelActionPerformed(evt);
   }
  });

  User1.setBackground(new java.awt.Color(204, 204, 204));
  User1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
  User1.setForeground(new java.awt.Color(204, 204, 204));
  User1.setText("Contact number");

  e.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    eActionPerformed(evt);
   }
  });

  num.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    numActionPerformed(evt);
   }
  });

  fn.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    fnActionPerformed(evt);
   }
  });

  pass.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    passActionPerformed(evt);
   }
  });

  ln.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    lnActionPerformed(evt);
   }
  });

  ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "user", "admin" }));
  ut.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    utActionPerformed(evt);
   }
  });

  us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", " Pending" }));
  us.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    usActionPerformed(evt);
   }
  });

  Password1.setBackground(new java.awt.Color(204, 204, 204));
  Password1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
  Password1.setForeground(new java.awt.Color(204, 204, 204));
  Password1.setText("password");

  Password2.setBackground(new java.awt.Color(204, 204, 204));
  Password2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
  Password2.setForeground(new java.awt.Color(204, 204, 204));
  Password2.setText("Status");

  refresh.setBackground(new java.awt.Color(236, 45, 45));
  refresh.setText("Refresh");
  refresh.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseClicked(java.awt.event.MouseEvent evt) {
    refreshMouseClicked(evt);
   }
  });
  refresh.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    refreshActionPerformed(evt);
   }
  });

  clear.setBackground(new java.awt.Color(236, 45, 45));
  clear.setText("Clear");
  clear.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseClicked(java.awt.event.MouseEvent evt) {
    clearMouseClicked(evt);
   }
  });
  clear.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    clearActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
  right.setLayout(rightLayout);
  rightLayout.setHorizontalGroup(
   rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(rightLayout.createSequentialGroup()
    .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(rightLayout.createSequentialGroup()
      .addGap(50, 50, 50)
      .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        .addGroup(rightLayout.createSequentialGroup()
         .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(fname)
          .addComponent(Lname))
         .addGap(10, 10, 10)
         .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGroup(rightLayout.createSequentialGroup()
         .addComponent(User1)
         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
         .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(rightLayout.createSequentialGroup()
         .addComponent(a)
         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
         .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(rightLayout.createSequentialGroup()
         .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(User)
          .addComponent(Password)
          .addComponent(Password2)
          .addComponent(Password1))
         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
         .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(ut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGroup(rightLayout.createSequentialGroup()
         .addComponent(Add)
         .addGap(17, 17, 17))
        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rightLayout.createSequentialGroup()
         .addGap(54, 54, 54)
         .addComponent(refresh)))
       .addGroup(rightLayout.createSequentialGroup()
        .addGap(324, 324, 324)
        .addComponent(clear)))
      .addContainerGap(54, Short.MAX_VALUE))
     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
        .addComponent(Cancel)
        .addContainerGap())
       .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
        .addComponent(jLabel1)
        .addGap(176, 176, 176))))))
  );
  rightLayout.setVerticalGroup(
   rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   .addGroup(rightLayout.createSequentialGroup()
    .addContainerGap()
    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(3, 3, 3)
    .addComponent(jLabel1)
    .addGap(41, 41, 41)
    .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(fname)
     .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(Lname)
     .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(a)
     .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(11, 11, 11)
    .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(User1)
     .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(8, 8, 8)
    .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(User)
     .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(Password1))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(Password)
     .addComponent(ut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(Password2)
     .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
    .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addContainerGap())
  );

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGap(0, 728, Short.MAX_VALUE)
   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
     .addGap(0, 0, Short.MAX_VALUE)
     .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGap(0, 0, Short.MAX_VALUE)))
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGap(0, 430, Short.MAX_VALUE)
   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
     .addGap(0, 0, Short.MAX_VALUE)
     .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGap(0, 0, Short.MAX_VALUE)))
  );

  pack();
  setLocationRelativeTo(null);
 }// </editor-fold>//GEN-END:initComponents

 private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked

       String firstName = fn.getText().trim();
    String lastName = ln.getText().trim();
    String userEmail = e.getText().trim();
    String contactNumber = num.getText().trim();
    String userName = un.getText().trim();
    String userPassword = pass.getText().trim();
    String userType = ut.getSelectedItem().toString(); // Get selected user type (user or admin)
    String userStatus = us.getSelectedItem().toString().trim(); // Get selected user status (Active or Pending)

    // Validate First Name, Last Name, Username, and Password
    if (firstName.isEmpty() || lastName.isEmpty() || userEmail.isEmpty() || contactNumber.isEmpty() || userName.isEmpty() || userPassword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields are required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;  // Stop execution here if validation fails
    }

    // Validate Email format using regex
    if (!isValidEmail(userEmail)) {
        JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;  // Stop execution here if validation fails
    }

    // Validate Password length (at least 8 characters)
    if (userPassword.length() < 8) {
        JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;  // Stop execution here if validation fails
    }

    // Validate Contact Number (must be exactly 11 digits and contain only numbers)
    if (!contactNumber.matches("\\d{11}")) {
        JOptionPane.showMessageDialog(this, "Contact number must be exactly 11 digits and contain only numbers.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;  // Stop execution here if validation fails
    }

    // Check for duplicate email or username in the database
    dbconnector dbc = new dbconnector();
    if (dbc.isDuplicate(userEmail, userName)) {
        JOptionPane.showMessageDialog(this, "This email or username is already registered.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;  // Stop execution here if validation fails
    }

    // Hash the password before storing it in the database
    String hashedPassword;
    try {
        hashedPassword = passwordHasher.hashPassword(userPassword);
    } catch (NoSuchAlgorithmException ex) {
        JOptionPane.showMessageDialog(this, "Error hashing password.", "Error", JOptionPane.ERROR_MESSAGE);
        return;  // Stop execution if hashing fails
    }

    // If all validations pass, proceed with database insertion
    String sql = "INSERT INTO table_user (u_fname, u_lname, u_email, u_contact, u_username, u_password, u_type, u_status) "
               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    boolean isInserted = dbc.insertData(sql,
        firstName,
        lastName,
        userEmail,
        contactNumber,
        userName,
        hashedPassword,  // Use the hashed password here
        userType, // Use the selected user type
        userStatus // Use the selected user status
    );

    if (isInserted) {
        JOptionPane.showMessageDialog(null, "User added successfully!");
        Userform uf = new Userform(); // Open the admin dashboard
        uf.setVisible(true);
        this.dispose(); // Close the add user form
    } else {
        JOptionPane.showMessageDialog(null, "Connection Error. Please try again.");
    }
 }//GEN-LAST:event_AddMouseClicked

 private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

 }//GEN-LAST:event_AddActionPerformed

 private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
  // TODO add your handling code here:
 }//GEN-LAST:event_unActionPerformed

 private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
  Admindashb ads = new Admindashb();
  ads.setVisible(true);
  this.dispose();
 }//GEN-LAST:event_CancelMouseClicked

 private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
  Userform uf = new Userform();
  uf.setVisible(true);
  this.dispose();
 }//GEN-LAST:event_CancelActionPerformed

 private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
  // TODO add your handling code here:
 }//GEN-LAST:event_eActionPerformed

 private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
  // TODO add your handling code here:
 }//GEN-LAST:event_numActionPerformed

 private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
  // TODO add your handling code here:
 }//GEN-LAST:event_fnActionPerformed

 private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
  // TODO add your handling code here:
 }//GEN-LAST:event_passActionPerformed

 private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
  // TODO add your handling code here:
 }//GEN-LAST:event_lnActionPerformed

 private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
  // TODO add your handling code here:
 }//GEN-LAST:event_utActionPerformed

 private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
  // TODO add your handling code here:
 }//GEN-LAST:event_usActionPerformed

 private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
  // TODO add your handling code here:
 }//GEN-LAST:event_refreshMouseClicked

 private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
  // TODO add your handling code here:
 }//GEN-LAST:event_refreshActionPerformed

 private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
  // TODO add your handling code here:
 }//GEN-LAST:event_clearMouseClicked

 private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
  // TODO add your handling code here:
 }//GEN-LAST:event_clearActionPerformed

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
   java.util.logging.Logger.getLogger(addform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (InstantiationException ex) {
   java.util.logging.Logger.getLogger(addform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (IllegalAccessException ex) {
   java.util.logging.Logger.getLogger(addform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
   java.util.logging.Logger.getLogger(addform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  }
  //</editor-fold>

  /* Create and display the form */
  java.awt.EventQueue.invokeLater(new Runnable() {
   public void run() {
    new addform().setVisible(true);
   }
  });
 }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 public javax.swing.JButton Add;
 private javax.swing.JButton Cancel;
 private javax.swing.JPanel Left;
 private javax.swing.JLabel Lname;
 private javax.swing.JLabel Password;
 private javax.swing.JLabel Password1;
 private javax.swing.JLabel Password2;
 private javax.swing.JLabel User;
 private javax.swing.JLabel User1;
 private javax.swing.JLabel a;
 private javax.swing.JButton clear;
 public javax.swing.JTextField e;
 public javax.swing.JTextField fn;
 private javax.swing.JLabel fname;
 private javax.swing.JLabel jLabel1;
 public javax.swing.JTextField ln;
 public javax.swing.JTextField num;
 public javax.swing.JTextField pass;
 private javax.swing.JButton refresh;
 private javax.swing.JPanel right;
 public javax.swing.JTextField un;
 public javax.swing.JComboBox<String> us;
 public javax.swing.JComboBox<String> ut;
 // End of variables declaration//GEN-END:variables

 private boolean isValidEmail(String userEmail) {
   // Regular expression for validating an email address
      String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return userEmail.matches(emailRegex); // Use userEmail instead of email
    
 }
}
