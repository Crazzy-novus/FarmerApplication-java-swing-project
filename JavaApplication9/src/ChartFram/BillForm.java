package ChartFram;


import Conntentpanel.productPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static loginpage.LoginForm.getUserId;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muthu Pandi
 */
public class BillForm extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public BillForm() {
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

        jSeparator4 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        PrintPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cost = new javax.swing.JLabel();
        modelNo_l = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        product_Name_l = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        bill_No = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        photo_l = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        S_location_l = new javax.swing.JLabel();
        buyer_location = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        rate_l = new javax.swing.JLabel();
        S_name_l = new javax.swing.JLabel();
        S_phoneNo_l = new javax.swing.JLabel();
        owner_id = new javax.swing.JLabel();
        buyer_id1 = new javax.swing.JLabel();
        buyer_name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        duration_l = new javax.swing.JLabel();
        buyer_phonenumber = new javax.swing.JLabel();
        S_mailid = new javax.swing.JLabel();
        buyer_mailid = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(1, 1, 1, 1));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 204));
        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 680, 180, 60));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 204));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 190, 60));

        PrintPanel.setBackground(new java.awt.Color(255, 255, 255));
        PrintPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PrintPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Total :");
        PrintPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 641, 110, 50));

        cost.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        PrintPanel.add(cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 651, 130, 40));

        modelNo_l.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        modelNo_l.setText("SVE15127CNB");
        PrintPanel.add(modelNo_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 440, 150, 50));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel20.setText("Model Number");
        PrintPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 382, 160, 40));

        jLabel17.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel17.setText("UZHAVAN - Equipments");
        PrintPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 21, 350, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Smartest way of farming");
        PrintPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 51, 190, 50));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Tamil Nadu");
        PrintPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 180, 30));

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel12.setText("/hour");
        PrintPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 552, 92, 40));

        jSeparator2.setBackground(new java.awt.Color(17, 16, 16));
        jSeparator2.setForeground(new java.awt.Color(26, 22, 22));
        PrintPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 380, 840, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setText("ITEM DESCRIPTION");
        PrintPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 382, 160, 42));

        product_Name_l.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        product_Name_l.setText("Drone");
        PrintPanel.add(product_Name_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 436, 130, 57));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel6.setText("Duration :");
        PrintPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 614, 90, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel8.setText("Subtotal :");
        PrintPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 565, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(23, 19, 19));
        jSeparator1.setForeground(new java.awt.Color(14, 13, 13));
        PrintPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 277, 840, 9));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel1.setText("Payment Method:");
        PrintPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 292, 172, 35));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel2.setText("Order Number:");
        PrintPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 342, 155, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setText("Cash on delivery");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        PrintPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 292, 188, 33));

        bill_No.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bill_No.setText("103");
        bill_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_NoActionPerformed(evt);
            }
        });
        PrintPanel.add(bill_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 342, 188, 35));

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel9.setText("Issue Date:");
        PrintPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 312, 112, 38));

        date.setEditable(false);
        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        date.setText("02 / 02 / 2022");
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        PrintPanel.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 318, 200, 31));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel10.setText("Supplier:");
        PrintPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 118, 27));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel11.setText("Client:");
        PrintPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 113, 77, -1));

        jSeparator3.setBackground(new java.awt.Color(14, 13, 13));
        jSeparator3.setForeground(new java.awt.Color(14, 13, 13));
        PrintPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 113, 840, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel5.setText("Photo");
        PrintPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 382, 160, 50));
        PrintPanel.add(photo_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 422, 320, 130));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.jpg"))); // NOI18N
        PrintPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 7, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText("Tamil Nadu");
        PrintPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 190, 30));

        S_location_l.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        S_location_l.setText("750/c2 Thirupathi Nagar,Oddanchatram");
        PrintPanel.add(S_location_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 191, 320, 30));

        buyer_location.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buyer_location.setText("343/m2 EastStreet, Oddanchatram");
        PrintPanel.add(buyer_location, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 340, 30));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Smartest way of farming");
        PrintPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 51, 190, 50));

        rate_l.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PrintPanel.add(rate_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 558, 58, 28));

        S_name_l.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        S_name_l.setText("Name");
        PrintPanel.add(S_name_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 196, -1));

        S_phoneNo_l.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        S_phoneNo_l.setText("354673893");
        PrintPanel.add(S_phoneNo_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 110, 30));

        owner_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        owner_id.setText("103");
        owner_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PrintPanel.add(owner_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 69, 28));

        buyer_id1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buyer_id1.setText("103");
        buyer_id1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PrintPanel.add(buyer_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 60, 30));

        buyer_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buyer_name.setText("Name");
        PrintPanel.add(buyer_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 196, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("₹");
        PrintPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 649, 24, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("₹");
        PrintPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 24, 30));

        duration_l.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        PrintPanel.add(duration_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 598, 218, 37));

        buyer_phonenumber.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        PrintPanel.add(buyer_phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 150, 30));

        S_mailid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PrintPanel.add(S_mailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 230, 30));

        buyer_mailid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PrintPanel.add(buyer_mailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 210, 30));

        getContentPane().add(PrintPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 680));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 850, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bill_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bill_NoActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Data");

        job.setPrintable(new Printable(){
        public int print(Graphics pg,PageFormat pf, int pageNum){
                pf.setOrientation(PageFormat.LANDSCAPE);
             if(pageNum > 0){
                return Printable.NO_SUCH_PAGE;
            }

            Graphics2D g2 = (Graphics2D)pg;
            g2.translate(pf.getImageableX(), pf.getImageableY());
            g2.scale(0.69,1.0);

           PrintPanel.print(g2);


            return Printable.PAGE_EXISTS;
        }
    });
            boolean ok = job.printDialog();
        if(ok){
        try{
            
            job.print();
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"Bill will be generated successfully","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch (PrinterException ex){
            ex.printStackTrace();
}
        }
         int totalProductRented;
         int buyer_id = Integer.parseInt(buyer_id1.getText());
         int price = Integer.parseInt(cost.getText());
         try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uzhavan","root","");
                String sql = "insert into rented_products_details(owner_user_id,product_model_no,duration,date_of_purchase,buyer_user_id,rent_cost) values(?,?,?,?,?,?)";
                 PreparedStatement ps = con.prepareStatement(sql);
                    ps.setInt(1,productPanel.getuserId());
                    ps.setString(2, modelNo_l.getText());
                    ps.setInt(3, productPanel.getDuration());
                    ps.setString(4, date.getText());
                    ps.setInt(5, buyer_id);
                    ps.setInt(6,price);
                    ps.executeUpdate();
                    
                     sql = "SELECT total_product_rented from user where user_id = '"+getUserId()+"'";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);
                    if(rs.next())
                    {
                        totalProductRented = rs.getInt(1);
                        totalProductRented = totalProductRented+1;
                        sql = "UPDATE user set total_product_owned = '" + totalProductRented + "' WHERE user_id = '" + getUserId()+ "'";
                        stmt.executeUpdate(sql);
                    }
                    } catch (SQLException ex)
                    {
                        ex.printStackTrace();
                    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(BillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PrintPanel;
    public javax.swing.JLabel S_location_l;
    public javax.swing.JLabel S_mailid;
    public javax.swing.JLabel S_name_l;
    public javax.swing.JLabel S_phoneNo_l;
    public javax.swing.JTextField bill_No;
    public javax.swing.JLabel buyer_id1;
    public javax.swing.JLabel buyer_location;
    public javax.swing.JLabel buyer_mailid;
    public javax.swing.JLabel buyer_name;
    public javax.swing.JLabel buyer_phonenumber;
    public javax.swing.JLabel cost;
    public javax.swing.JTextField date;
    public javax.swing.JLabel duration_l;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel modelNo_l;
    public javax.swing.JLabel owner_id;
    public javax.swing.JLabel photo_l;
    public javax.swing.JLabel product_Name_l;
    public javax.swing.JLabel rate_l;
    // End of variables declaration//GEN-END:variables
}
