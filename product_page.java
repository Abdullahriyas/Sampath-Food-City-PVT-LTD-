/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abdullah
 */
public class product_page extends javax.swing.JFrame {
    private String userType;

    /**
     * Creates new form custamer_page
     */
    public product_page(String userType) {
        this.userType = userType;
        initComponents();
        load_tb();
        
        // Back button
        JButton btnProductPerformance = new JButton("Product Performance");
        btnProductPerformance.setBounds(120, 240, 160, 30); // Adjust bounds as needed
        add(btnProductPerformance);
    }

    product_page() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addDataToDatabaseAndTable(String t_id, String p_id, String c_id, String p_name, int p_qty, double p_price, String p_date, double p_t_price, String region) {
    try {
        // Establish connection
        Connection con = db.Database1.getConnection();

        // Prepare the SQL query using PreparedStatement
        String query = "INSERT INTO super_market (t_id, p_id, c_id, p_name, qty, pr_unit, date, t_price, region) " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query);

        // Set parameters for the query
        pst.setString(1, t_id);
        pst.setString(2, p_id);
        pst.setString(3, c_id);
        pst.setString(4, p_name);
        pst.setInt(5, p_qty);
        pst.setDouble(6, p_price);
        pst.setString(7, p_date);
        pst.setDouble(8, p_t_price);
        pst.setString(9, region);

        // Execute the query
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data added successfully!");

        // Load the updated data into the JTable
        loadTable(con);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}

// Method to load data from the database into the JTable
public void loadTable(Connection con) {
    DefaultTableModel dt = (DefaultTableModel) tblp.getModel();
    dt.setRowCount(0); // Clear existing rows

    try {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM super_market");

        while (rs.next()) {
            Vector<Object> row = new Vector<>();
            row.add(rs.getString("t_id"));
            row.add(rs.getString("p_id"));
            row.add(rs.getString("c_id"));
            row.add(rs.getString("p_name"));
            row.add(rs.getInt("qty"));
            row.add(rs.getDouble("pr_unit"));
            row.add(rs.getString("date"));
            row.add(rs.getDouble("t_price"));
            row.add(rs.getString("region"));
            dt.addRow(row);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error loading table: " + e.getMessage());
    }
}

// Method to load table explicitly
public void load_tb() {
    try {
        DefaultTableModel dt = (DefaultTableModel) tblp.getModel();
        dt.setRowCount(0);

        // Fetch data from the database
        Statement s = db.Database1.getConnection().createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM super_market");

        while (rs.next()) {
            Vector<Object> v = new Vector<>();
            v.add(rs.getString("t_id"));
            v.add(rs.getString("p_id"));
            v.add(rs.getString("c_id"));
            v.add(rs.getString("p_name"));
            v.add(rs.getInt("qty"));
            v.add(rs.getDouble("pr_unit"));
            v.add(rs.getString("date"));
            v.add(rs.getDouble("t_price"));
            v.add(rs.getString("region"));
            dt.addRow(v);
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblp = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_P_c_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tblp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Transaction ID", "Customer ID", "Product ID", "Product name", "Product Qty", "Price per Unit", "Date", "TotalPrice ", "Region"
            }
        ));
        tblp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblp.setGridColor(new java.awt.Color(255, 255, 255));
        tblp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblp);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search icon.png"))); // NOI18N
        jLabel6.setText("Search The Product");

        txt_P_c_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_P_c_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_P_c_nameKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Product Performance");

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back icon 2.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(340, 340, 340)
                        .addComponent(jLabel7)
                        .addContainerGap(452, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txt_P_c_name, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_P_c_name))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1233, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpMouseClicked
        // TODO add your handling code here: table click
  
    }//GEN-LAST:event_tblpMouseClicked

    private void txt_P_c_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_P_c_nameKeyReleased
        // tbl search code
        String name = txt_P_c_name.getText().trim(); // Get the text from the search field and trim any extra spaces

    try {
        DefaultTableModel dt = (DefaultTableModel) tblp.getModel();
        dt.setRowCount(0); // Clear existing rows from the table

        // Query the database for products matching the search criteria
        String query = "SELECT * FROM super_market WHERE p_name LIKE ?";
        PreparedStatement pst = db.Database1.getConnection().prepareStatement(query);
        pst.setString(1, "%" + name + "%");

        ResultSet rs = pst.executeQuery();

        // Populate the table with matching results
        while (rs.next()) {
            Vector<Object> row = new Vector<>();

            row.add(rs.getString("t_id"));       // Product ID
            row.add(rs.getString("p_id"));       // Product ID
            row.add(rs.getString("c_id"));       // Customer ID
            row.add(rs.getString("p_name"));     // Product Name
            row.add(rs.getInt("qty"));           // Quantity
            row.add(rs.getDouble("pr_unit"));    // Price per unit
            row.add(rs.getString("date"));       // Date
            row.add(rs.getDouble("t_price"));    // Total Price
            row.add(rs.getString("region"));     // Region

            dt.addRow(row); // Add the row to the table model
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading search results: " + e.getMessage());
        load_tb(); // Reload the table with all data if an error occurs
    }
        
    }//GEN-LAST:event_txt_P_c_nameKeyReleased

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        if ("admin".equalsIgnoreCase(userType)) {
            // Go back to the Admin Dashboard
            new Admin_dash_borad().setVisible(true);
        } else if ("user".equalsIgnoreCase(userType)) {
            // Go back to the User Dashboard
            new user_dash_borad().setVisible(true);
        } else {
            // If userType is not recognized, show an error message and navigate to login page
            JOptionPane.showMessageDialog(this, "Unknown user type. Returning to login.", "Error", JOptionPane.ERROR_MESSAGE);
            new login_page().setVisible(true);
        }
        this.dispose(); // Close the current BestSellingProductPage

    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(product_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new product_page("admin").setVisible(true); // Test with "admin" or "user"
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblp;
    private javax.swing.JTextField txt_P_c_name;
    // End of variables declaration//GEN-END:variables
}
