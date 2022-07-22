/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author anuradha
 */
public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
//            st.executeUpdate("create table users(name varchar(100),username varchar(200),password varchar(50),mobileno varchar(13));");
//            JOptionPane.showMessageDialog(null, "users table created successfully");
//             st.executeUpdate("create table medicines(medicine_id varchar(10) primary key,medicine_name varchar(20),medicine_price float(10),exp_date varchar(10),mfg_date varchar(10),supplier varchar(20),description varchar(20));");
//            JOptionPane.showMessageDialog(null, "medicines table created successfully");
//              st.executeUpdate("create table suppliers(supplier_id varchar(10) primary key,supplier_name varchar(20) unique,address varchar(10),phone_no varchar(10));");
//            JOptionPane.showMessageDialog(null, "suppliers table created successfully");
//                st.executeUpdate("create table medicine_stock(medicine_id varchar(10) primary key,quantity int(10),foreign key (medicine_id) references medicines(medicine_id) );");
//              JOptionPane.showMessageDialog(null, "medicine_stock table created successfully");
//                   st.executeUpdate("create table customers(customer_id int auto_increment primary key, customer_name varchar(20), mobile_no varchar(13), total_amount float(10),ref_dr varchar(20),payment_type varchar(10),bill_date varchar(30)); ");
//                  JOptionPane.showMessageDialog(null, "customers table created successfully");
                   st.executeUpdate("create table bill(customer_id int  ,medicine_id varchar(20),medicine_name varchar(20),quantity int ,foreign key (customer_id) references customers(customer_id),foreign key (medicine_id) references medicines(medicine_id)); ");
                  JOptionPane.showMessageDialog(null, "bill table created successfully");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {

            }
        }
    }

}
