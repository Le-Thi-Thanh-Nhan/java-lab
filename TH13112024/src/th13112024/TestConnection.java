/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th13112024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class TestConnection {
private final Connection conn;
public TestConnection() throws ClassNotFoundException, SQLException{
//B1. Nạp trình điều khiển
   Class.forName("com.mysql.cj.jdbc.Driver");
//Tạo kết nối
   String url="jdbc:mysql://localhost:3306/qlsanpham";//Đường dẫn vào Data Base
   this.conn = DriverManager.getConnection(url,"root",""); //Kết nối
   //    if(this.conn!=null) JOptionPane.showMessageDialog(null, "Kết nối thành công");
   //    else JOptionPane.showMessageDialog(null, "Kết nối lỗi");
}    
public ResultSet GetData(String tbName) throws SQLException{
ResultSet kq = null;
Statement st = conn.createStatement();//tao doi tuong truy vấn
String sql = "select * from "+tbName;
kq = st.executeQuery(sql);//thuc thi truy van
return kq;
}
public static void main(String[] args) throws SQLException, ClassNotFoundException  {
 TestConnection connect = new TestConnection();
 ResultSet rs =  connect.GetData("user");
 while (rs.next()){
     System.out.print(rs.getString("id")+" ");
     System.out.print(rs.getString("username")+ " ");
     System.out.print(rs.getString("password")+ " ");
     System.out.println("");
 
 }            
    }
   
}

