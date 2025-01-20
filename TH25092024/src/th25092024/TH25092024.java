/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package th25092024;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class TH25092024 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    //1. Tạo đối tượng Scanner
    Scanner sc = new Scanner(System.in);
    //2. Sử dụng các phương thức: nextLine(), nextInt(), nextFloat()..
    //Nhập 1 chuỗi
     System.out.print("Bạn nhập 1 chuỗi: ");
     String st = sc.nextLine();
     System.out.println("Chuỗi vừa nhập là: "+ st);
     //Nhập 1 số nguyên
     System.out.print("Bạn nhập 1 số nguyên: ");
     int n = sc.nextInt();
     System.out.println("Số nguyên vừa nhập là: "+ n);
     //Nhập 1 số thực
     System.out.print("Bạn nhập 1 số thực: ");
     float x = sc.nextFloat();
     System.out.println("Số thực vừa nhập là: "+ x);
        // TODO code application logic here
    }
    
}
