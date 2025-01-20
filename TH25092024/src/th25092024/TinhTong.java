/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th25092024;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class TinhTong {
    public static void main(String[] args) {
        //s = 1 + 1/2 + 1/3 + ... + 1/n
        //Nhập n
        float s = 0f;
        int n;
        Scanner sc = new Scanner(System.in);
            System.out.print("Nhập n = ");
            n = sc.nextInt();
        for (float i = 1; i < n; i++)
        {
            s += 1/i;
        }
        System.out.println("Tổng bằng: "+s);
    }
}
