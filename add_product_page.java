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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Faz Abdullah
 */
public class add_product_page extends javax.swing.JFrame {

    /**
     * Creates new form custamer_page
     */
    public add_product_page() {
        initComponents();
        
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtPname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPprice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtP_t_price = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPqty = new javax.swing.JTextField();
        btnPdelete = new javax.swing.JToggleButton();
        btnPupdate = new javax.swing.JToggleButton();
        btnPsave = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        txtP_id = new javax.swing.JTextField();
        txtP_date = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtC_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_region = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_t_id = new javax.swing.JTextField();
        btnserach = new javax.swing.JToggleButton();
        btn_back = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Product name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Product price per unit");

        txtPprice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add product.png"))); // NOI18N
        jLabel3.setText("Add product");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Total price");

        txtP_t_price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtP_t_price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Product Qty");

        txtPqty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPqty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPdelete.setText("Delete");
        btnPdelete.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        btnPdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdeleteActionPerformed(evt);
            }
        });

        btnPupdate.setText("Update");
        btnPupdate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        btnPupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPupdateActionPerformed(evt);
            }
        });

        btnPsave.setText("Save");
        btnPsave.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        btnPsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPsaveActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Product ID");

        txtP_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtP_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtP_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtP_date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Date");

        txtC_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtC_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Customer ID");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Region");

        txt_region.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_region.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPsave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnPdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtP_t_price, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(txtP_id, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                    .addComponent(txtPname)
                                    .addComponent(txtPqty)
                                    .addComponent(txtPprice)
                                    .addComponent(txtP_date)))
                            .addComponent(jLabel10)
                            .addComponent(txtC_id, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txt_region, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtC_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtP_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPqty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(9, 9, 9)
                .addComponent(txtPprice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(9, 9, 9)
                .addComponent(txtP_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtP_t_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_region, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPsave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search icon.png"))); // NOI18N
        jLabel1.setText("Search Transition ID");

        txt_t_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_t_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_t_idActionPerformed(evt);
            }
        });

        btnserach.setText("Search");
        btnserach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnserach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnserachActionPerformed(evt);
            }
        });

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back icon 2.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txt_t_id, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnserach, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_t_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnserach, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPsaveActionPerformed
        // TODO add your handling code here:
        String c_id, p_id, p_name, p_qty, p_price, p_date, p_t_price,region, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(txtP_id.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Product name is require", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }else if("".equals(txtPname.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Product price is require", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }else if("".equals(txtPqty.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Product Qty is require", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }else if("".equals(txtPprice.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Product price is require", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }else if("".equals(txtP_date.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Product Qty is require", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }else if("".equals(txtP_t_price.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Product Qty is require", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }else {
                c_id = txtC_id.getText();
                p_id = txtP_id.getText();
                p_name = txtPname.getText();
                p_qty    = txtPqty.getText();
                p_price = txtPprice.getText();
                p_date = txtP_date.getText();
                p_t_price   = txtP_t_price.getText();
                region   = txt_region.getText();

                
                System.out.println();

                query = "INSERT INTO super_market (c_id, p_id, p_name, qty, pr_unit, date, t_price, region) "+
                "VALUES('"+c_id+"' , '"+p_id+"' , '"+p_name+"', '"+p_qty+"' , '"+p_price+"' , '"+p_date+"' , '"+p_t_price+"', '"+region+"')";

                st.execute(query);
                txtC_id.setText("");
                txtP_id.setText("");
                txtPname.setText("");
                txtPqty.setText("");
                txtPprice.setText("");
                txtP_date.setText("");
                txtP_t_price.setText("");
                txt_region.setText("");
                JOptionPane.showMessageDialog(null, "Succesfully data added!");
            }
        }catch(Exception e){
            System.out.println("Error!" + e.getMessage());
        }
        

        
    }//GEN-LAST:event_btnPsaveActionPerformed

    private void btnPupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPupdateActionPerformed
        // TODO add your handling code here:
        
                String p_id = txtP_id.getText();  // The unique identifier for the customer
                String c_id = txtC_id.getText();  // The unique identifier for the customer
                String p_name = txtPname.getText();  // New name to update
                String p_qty = txtPqty.getText();    // Quantity
                String p_price = txtPprice.getText();  // Price
                String p_date = txtP_date.getText();  // Date
                String p_t_price = txtP_t_price.getText();  // Total price
                String t_id = txt_t_id.getText();  // Unique identifier for WHERE clause
                String region = txt_region.getText();  // Unique identifier for WHERE clause

            try {                        
                Connection con = db.Database1.getConnection();

                // Use a PreparedStatement to avoid SQL injection
                String query = "UPDATE super_market SET c_id = ?, p_id = ?, p_name = ?, qty = ?, pr_unit = ?, date = ?, t_price = ?, region = ? WHERE t_id = ?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, c_id);    // Replace first placeholder with p_id
                ps.setString(2, p_id);    // Replace first placeholder with p_id
                ps.setString(3, p_name);  // Replace second placeholder with p_name
                ps.setString(4, p_qty);   // Replace third placeholder with qty
                ps.setString(5, p_price); // Replace fourth placeholder with price
                ps.setString(6, p_date);  // Replace fifth placeholder with date
                ps.setString(7, p_t_price);  // Replace sixth placeholder with total price
                ps.setString(8, t_id);       // Replace seventh placeholder with t_id
                ps.setString(9, region);       // Replace seventh placeholder with t_id

                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Customer record updated successfully!");

                    // Clear text fields
                    txt_t_id.setText("");
                    txtC_id.setText("");
                    txtPname.setText("");
                    txtPqty.setText("");
                    txtPprice.setText("");
                    txtP_date.setText("");
                    txtP_t_price.setText("");
                    txtP_id.setText("");
                    txt_region.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "No customer record found with the given ID.");
                }
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error updating record: " + e.getMessage());
            }

            // Refresh table after updating
        
    }//GEN-LAST:event_btnPupdateActionPerformed

    private void btnserachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnserachActionPerformed
        // TODO add your handling code here:
        String search = txt_t_id.getText();
        
        try {
            Connection con = db.Database1.getConnection();

            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery(" SELECT * FROM super_market WHERE t_id = '"+search+"'");
            
            if (rs.next()) {
                
                txtC_id.setText(rs.getString("c_id"));
                txtP_id.setText(rs.getString("p_id"));
                txtPname.setText(rs.getString("p_name"));
                txtPqty.setText(rs.getString("qty"));
                txtPprice.setText(rs.getString("pr_unit"));
                txtP_date.setText(rs.getString("date"));
                txtP_t_price.setText(rs.getString("t_price"));
                txt_region.setText(rs.getString("region"));
                
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
    }//GEN-LAST:event_btnserachActionPerformed

    private void btnPdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdeleteActionPerformed
        // TODO add your handling code here:
         String p_id = txt_t_id.getText(); // The ID of the product to delete

            try {
                                
                Connection con = db.Database1.getConnection();

                // Check if the product ID is provided
                if (p_id.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a product ID to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Use a PreparedStatement to avoid SQL injection
                String query = "DELETE FROM super_market WHERE p_id = ?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, p_id); // Set the ID in the query

                // Show confirmation dialog
                int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this product?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    int rowsAffected = ps.executeUpdate(); // Execute the delete query
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Product deleted successfully!");
                        System.out.println("Product record deleted successfully.");

                        // Clear the text fields after deletion
                        txt_t_id.setText("");
                        txtC_id.setText("");
                        txtPname.setText("");
                        txtPprice.setText("");
                        txtPqty.setText("");
                        txtP_date.setText("");
                        txtP_t_price.setText("");
                        txtP_id.setText("");
                        txt_region.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "No product found with the given ID.", "Warning", JOptionPane.WARNING_MESSAGE);
                        System.out.println("No product record found with the given ID.");
                    }
                } else {
                    System.out.println("Delete operation canceled.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }

            // Reload the table data

    }//GEN-LAST:event_btnPdeleteActionPerformed

    private void txt_t_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_t_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_t_idActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        Admin_dash_borad lg = new Admin_dash_borad();
        lg.setVisible(true);
        this.dispose();
        
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
            java.util.logging.Logger.getLogger(add_product_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_product_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_product_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_product_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_product_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnPdelete;
    private javax.swing.JToggleButton btnPsave;
    private javax.swing.JToggleButton btnPupdate;
    private javax.swing.JToggleButton btn_back;
    private javax.swing.JToggleButton btnserach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtC_id;
    private javax.swing.JTextField txtP_date;
    private javax.swing.JTextField txtP_id;
    private javax.swing.JTextField txtP_t_price;
    private javax.swing.JTextField txtPname;
    private javax.swing.JTextField txtPprice;
    private javax.swing.JTextField txtPqty;
    private javax.swing.JTextField txt_region;
    private javax.swing.JTextField txt_t_id;
    // End of variables declaration//GEN-END:variables
}
