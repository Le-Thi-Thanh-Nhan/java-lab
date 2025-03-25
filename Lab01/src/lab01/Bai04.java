/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.Scanner;

/**
 *
 * @author Dell
 */

//Tìm UCLN, BCNN của 2 số được nhập vào từ bàn phím

public class Bai04 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất:");
        a = sc.nextInt();
        System.out.print("Nhập số thứ hai:");
        b = sc.nextInt();
        
        int copyA = a;
        int copyB = b;
        while (copyB != 0) {
            int temp = copyB;
            copyB = copyA % copyB;
            copyA = temp;
        }
        int UCLN = Math.abs(copyA);

        int BCNN = Math.abs(a * b) / UCLN;

        System.out.println("UCLN của" + a + " và " + b + " là: " + UCLN);
        System.out.println("BCNN của " + a + " và " + b + " là: " + BCNN);

        sc.close();        
    }
}
