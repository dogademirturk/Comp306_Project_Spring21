/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_page;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.*;
import javax.swing.JPanel;
import login_page.login_page;
import util.connectionUtil;

/**
 *
 * @author dogademirturk
 */
public class house_info extends javax.swing.JFrame {

    /**
     * Creates new form house_info
     */
    
    static int id;
    public house_info(int houseID) {
        id = houseID;
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

        jPanel1 = new javax.swing.JPanel();
        String type = "";
        String roomno = "";
        String bathroomno = "";
        String address = "";
        String price = "";
        String agency = "";
        String carno = "";
        String landsize = "";
        String builtyear = "";
        String suburb = "";
        String distance = "";
        String postcode = "";
        String councilarea = "";
        String regionname = "";
        String m2 = "";

        String query = "SELECT Type FROM HOUSES WHERE House_ID=" + id;
        PreparedStatement ps;
        ResultSet rs;

        try{
            ps=connectionUtil.getTheConnection().prepareStatement(query);
            rs=ps.executeQuery();
            rs.next();
            type = rs.getString("Type");

            String query2;
            PreparedStatement ps2;
            ResultSet rs2;

            if(type.equals("h")){
                type = "Villa";
                query2 = "SELECT * FROM HOUSES AS H NATURAL JOIN VILLAS_WC, HOUSE_LOCATIONS AS L, AGENCIES AS A WHERE A.Agency_ID=H.Seller_Agency AND H.Location_ID=L.location_id AND House_ID=" + id;
                ps2=connectionUtil.getTheConnection().prepareStatement(query2);
                rs2=ps2.executeQuery();
                rs2.next();
                m2 = rs2.getString("Garden_m2");
            } else if(type.equals("t")){
                type = "Terrace";
                query2 = "SELECT * FROM HOUSES AS H NATURAL JOIN TERRACE_WC, HOUSE_LOCATIONS AS L, AGENCIES AS A WHERE A.Agency_ID=H.Seller_Agency AND H.Location_ID=L.location_id AND House_ID=" + id;
                ps2=connectionUtil.getTheConnection().prepareStatement(query2);
                rs2=ps2.executeQuery();
                rs2.next();
                m2 = rs2.getString("Terrace_m2");
            } else {
                type = "Unit";
                query2 = "SELECT * FROM HOUSES AS H NATURAL JOIN UNITS, HOUSE_LOCATIONS AS L, AGENCIES AS A WHERE A.Agency_ID=H.Seller_Agency AND H.Location_ID=L.location_id AND House_ID=" + id;
                ps2=connectionUtil.getTheConnection().prepareStatement(query2);
                rs2=ps2.executeQuery();
                rs2.next();
            }
            roomno = rs2.getString("RoomNum");
            bathroomno = rs2.getString("Bathroom_Num");
            address = rs2.getString("Address");
            price = rs2.getString("Price");
            agency = rs2.getString("Agency_Name");
            carno = rs2.getString("Car_Num");
            landsize = rs2.getString("Landsize");
            builtyear = rs2.getString("YearBuilt");
            suburb = rs2.getString("Suburb");
            distance = rs2.getString("Distance");
            postcode = rs2.getString("Postcode");
            councilarea = rs2.getString("CouncilArea");
            regionname = rs2.getString("RegionName");
        } catch (SQLException e) {
            Logger.getLogger(login_page.class.getName()).log(Level.SEVERE,null,e);
        }
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        m2NameLabel = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        roomnoLabel = new javax.swing.JLabel();
        bathroomnoLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        agencyLabel = new javax.swing.JLabel();
        carLabel = new javax.swing.JLabel();
        landsizeLabel = new javax.swing.JLabel();
        buildyearLabel = new javax.swing.JLabel();
        suburbLabel = new javax.swing.JLabel();
        DistanceLabel = new javax.swing.JLabel();
        postcodeLabel = new javax.swing.JLabel();
        councilAreaLabel = new javax.swing.JLabel();
        regionLabel = new javax.swing.JLabel();
        m2Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Address:");

        jLabel2.setText("Room Number:");

        jLabel3.setText("Bathroom Number:");

        jLabel4.setText("Type:");

        jLabel5.setText("Price:");

        jLabel6.setText("Agency:");

        jLabel7.setText("Car Number:");

        jLabel8.setText("Landsize:");

        jLabel9.setText("Built Year:");

        jLabel10.setText("Suburb:");

        jLabel11.setText("Distance:");

        jLabel12.setText("Post Code:");

        jLabel13.setText("Council Area:");

        jLabel14.setText("Region Name:");

        if(type.equals("h")){
            m2NameLabel.setText("Garden m2");
            m2NameLabel.setVisible(true);
            m2Label.setVisible(true);}
        else if(type.equals("t")){
            m2NameLabel.setText("Terrace m2");
            m2NameLabel.setVisible(true);
            m2Label.setVisible(true);}
        else {
            m2NameLabel.setVisible(false);
            m2Label.setVisible(false);}
        m2NameLabel.setText("Terrace m2:");

        jLabel17.setText("HOUSE #" + id);

        addressLabel.setText(address);

        roomnoLabel.setText(roomno);

        bathroomnoLabel.setText(bathroomno);

        typeLabel.setText(type);

        priceLabel.setText(price);

        agencyLabel.setText(agency);

        carLabel.setText(carno);

        landsizeLabel.setText(landsize);

        buildyearLabel.setText(builtyear);

        suburbLabel.setText(suburb);

        DistanceLabel.setText(distance);

        postcodeLabel.setText(postcode);

        councilAreaLabel.setText(councilarea);

        regionLabel.setText(regionname);

        if(type.equals("h") || type.equals("t")){

        }
        m2Label.setText(m2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(m2NameLabel)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomnoLabel)
                            .addComponent(bathroomnoLabel)
                            .addComponent(typeLabel)
                            .addComponent(priceLabel)
                            .addComponent(agencyLabel)
                            .addComponent(carLabel)
                            .addComponent(landsizeLabel)
                            .addComponent(buildyearLabel)
                            .addComponent(suburbLabel)
                            .addComponent(DistanceLabel)
                            .addComponent(postcodeLabel)
                            .addComponent(councilAreaLabel)
                            .addComponent(regionLabel)
                            .addComponent(m2Label)
                            .addComponent(addressLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel17)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(typeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(roomnoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bathroomnoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(priceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(agencyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(carLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(landsizeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(buildyearLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(suburbLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(DistanceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(postcodeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(councilAreaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(regionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m2NameLabel)
                    .addComponent(m2Label))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(house_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(house_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(house_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(house_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new house_info(id).setVisible(true);
            }
        });
    }
    
    public JPanel getPanel(){
        return jPanel1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DistanceLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel agencyLabel;
    private javax.swing.JLabel bathroomnoLabel;
    private javax.swing.JLabel buildyearLabel;
    private javax.swing.JLabel carLabel;
    private javax.swing.JLabel councilAreaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel landsizeLabel;
    private javax.swing.JLabel m2Label;
    private javax.swing.JLabel m2NameLabel;
    private javax.swing.JLabel postcodeLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel regionLabel;
    private javax.swing.JLabel roomnoLabel;
    private javax.swing.JLabel suburbLabel;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
