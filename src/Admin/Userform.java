/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import config.dbconnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author ASUS
 */
public class Userform extends javax.swing.JFrame {


 public Userform() {
  initComponents();
  displayData();
   

 }
   Color navcolor = new Color(240,240,240);
  Color hovercolor = new Color(204,0,0);
 public void displayData() {
        try {
            dbconnector dbc = new dbconnector();
            ResultSet rs = dbc.getData("SELECT * FROM table_user");

            // Create a DefaultTableModel to hold the data
            DefaultTableModel model = new DefaultTableModel();

            // Add column names to the model
            model.addColumn("ID");
            model.addColumn("First Name");
            model.addColumn("Last Name");
            model.addColumn("Email");
            model.addColumn("Type");
             model.addColumn("status");
            // Add rows to the model
            while (rs.next()) {
                String id = rs.getString("u_id");
                String fname = rs.getString("u_fname");
                String lname = rs.getString("u_lname");
                String email = rs.getString("u_email");
                String type = rs.getString("u_type");
                String status = rs.getString("u_status");
                model.addRow(new Object[]{id, fname, lname, email, type, status});
            }

            // Set the model to the JTable
            usertable.setModel(model);

            // Close the ResultSet
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error fetching data: " + ex.getMessage());
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        pp_add = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p_edit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        p_back = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        acc_name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        pp_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pp_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pp_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pp_addMouseExited(evt);
            }
        });

        jLabel1.setText("add");

        javax.swing.GroupLayout pp_addLayout = new javax.swing.GroupLayout(pp_add);
        pp_add.setLayout(pp_addLayout);
        pp_addLayout.setHorizontalGroup(
            pp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp_addLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pp_addLayout.setVerticalGroup(
            pp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp_addLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        p_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_editMouseExited(evt);
            }
        });

        jLabel2.setText("edit");

        javax.swing.GroupLayout p_editLayout = new javax.swing.GroupLayout(p_edit);
        p_edit.setLayout(p_editLayout);
        p_editLayout.setHorizontalGroup(
            p_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_editLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_editLayout.setVerticalGroup(
            p_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_editLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        p_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout p_backLayout = new javax.swing.GroupLayout(p_back);
        p_back.setLayout(p_backLayout);
        p_backLayout.setHorizontalGroup(
            p_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        p_backLayout.setVerticalGroup(
            p_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pp_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(pp_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(p_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(p_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 510));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 520, 30));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        acc_name.setBackground(new java.awt.Color(0, 0, 0));
        acc_name.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        acc_name.setText("User Form");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(acc_name)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(acc_name)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 140, 140));

        jScrollPane1.setViewportView(usertable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 760, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 private void pp_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pp_addMouseClicked
  addform af = new addform();
  af.setVisible(true);
  this.dispose();
 }//GEN-LAST:event_pp_addMouseClicked

 private void pp_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pp_addMouseEntered
 
  pp_add.setBackground(hovercolor);

 }//GEN-LAST:event_pp_addMouseEntered

 private void pp_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pp_addMouseExited
 
  pp_add.setBackground(navcolor);

 }//GEN-LAST:event_pp_addMouseExited

 private void p_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_backMouseEntered
  p_back.setBackground(hovercolor);

 }//GEN-LAST:event_p_backMouseEntered

 private void p_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_backMouseExited
 p_back.setBackground(navcolor);
 }//GEN-LAST:event_p_backMouseExited

 private void p_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_backMouseClicked
   Admindashb ab = new Admindashb();
  ab.setVisible(true);
  this.dispose();
 }//GEN-LAST:event_p_backMouseClicked

 private void p_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_editMouseEntered
   p_edit.setBackground(hovercolor);
 }//GEN-LAST:event_p_editMouseEntered

 private void p_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_editMouseExited
  p_edit.setBackground(navcolor);
 }//GEN-LAST:event_p_editMouseExited

 private void p_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_editMouseClicked
     int rowIndex = usertable.getSelectedRow();

    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(this, "Please select a row to edit.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            dbconnector dbc = new dbconnector();
            String userId = usertable.getValueAt(rowIndex, 0).toString(); // Get the user ID from the selected row
            ResultSet rs = dbc.getData("SELECT * FROM table_user WHERE u_id = " + userId);

            if (rs.next()) {
                updateform uf = new updateform();
                
                // Set the u_id field (non-editable)
                uf.uid.setText(rs.getString("u_id")); // Ensure u_id is set
                
                // Set other fields
                uf.fn.setText(rs.getString("u_fname"));
                uf.ln.setText(rs.getString("u_lname"));
                uf.e.setText(rs.getString("u_email"));
                uf.num.setText(rs.getString("u_contact"));
                uf.un.setText(rs.getString("u_username"));
                
                // Display the password in plain text (unhashed)
                uf.pass.setText(rs.getString("u_password")); // Display the password as stored in the database
                
                uf.ut.setSelectedItem(rs.getString("u_type"));
                uf.us.setSelectedItem(rs.getString("u_status"));

                uf.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "User not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
 }//GEN-LAST:event_p_editMouseClicked

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
   java.util.logging.Logger.getLogger(Userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (InstantiationException ex) {
   java.util.logging.Logger.getLogger(Userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (IllegalAccessException ex) {
   java.util.logging.Logger.getLogger(Userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
   java.util.logging.Logger.getLogger(Userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  }
  //</editor-fold>

  /* Create and display the form */
  java.awt.EventQueue.invokeLater(new Runnable() {
   public void run() {
    new Userform().setVisible(true);
   }
  });
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel p_back;
    private javax.swing.JPanel p_edit;
    private javax.swing.JPanel pp_add;
    private javax.swing.JTable usertable;
    // End of variables declaration//GEN-END:variables
}
