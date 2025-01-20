/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlxe;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Connect {

    private Connection con;

    public Connect() throws ClassNotFoundException,
            SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");//nap trinh dieu khien
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/thongtinxe", "root", ""); //thuc hien ket noi
    }

    public ResultSet GetData(String tbName) throws SQLException {
        ResultSet kq = null;
        Statement statement = this.con.createStatement();
        String sql = "select * from " + tbName + " order by ID";
        kq = statement.executeQuery(sql);
        return kq;
    }

    public ResultSet GetData_TK(String tenxe) throws SQLException {
        ResultSet kq = null;
        Statement statement = this.con.createStatement();
        String sql = "SELECT * FROM `products` WHERE `ID`='" + tenxe + "'";
        kq = statement.executeQuery(sql);
        return kq;
    }

    public void Update(String maxe, String tenxe, String hangxe, int giathanh) throws SQLException {
        Statement sta = this.con.createStatement();
        String sql1 = "Update Products set Name='" + tenxe + "' where ID = '" + maxe + "'";
        String sql2 = "Update Products set Number=" + giathanh + " where ID = '" + maxe + "'";
        sta.executeUpdate(sql1);
        sta.executeUpdate(sql2);
    }

    public void Insert(String maxe, String tenxe, String hangxe, int giathanh) throws SQLException {
      //Bổ sung sản phẩm
        Statement sta = this.con.createStatement();
        String sql1 = "Insert Products values('" + maxe + "','" + tenxe + "'," + giathanh + ")";
        sta.executeUpdate(sql1);
    }
    
    public void Delete(String maxe) throws SQLException {
        Statement sta = this.con.createStatement();
        String sql = "DELETE FROM `products` WHERE ID = '" + maxe + "'";
        sta.executeUpdate(sql);
    }

    public void Close() throws SQLException {
        if (this.con != null) {
            this.con.close();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException,
            SQLException {
        // TODO code application logic here
        int dem = 0;
        try {
            Connect pt = new Connect();
            ResultSet rs = pt.GetData("Products");
           while(rs.next()) {
                    dem++;
                }
          
            pt.Close();
        } catch (SQLException sqlException) {
        
        }
                

    }
}
