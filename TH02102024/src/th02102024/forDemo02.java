/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th02102024;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class forDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        float[] b = new float[n];
        //Nhập mảng
        for(int i = 0; i < n; i++){
            System.out.print("a["+i+"]= ");
            b[i] = sc.nextFloat();
        }
        System.out.println("Mảng vừa nhập: ");
        for(float temp:b)
            {
                System.out.print("  "+ temp);
            }
        System.out.println("");
    }
}
