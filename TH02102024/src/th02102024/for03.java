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
public class for03 {
    public static void main(String[] args) {
        //Tính tổng s = 1 + 1/(2)+ 1/(3)+ ...
        //Với độ chính xác epsilon nhập từ bàn phím
        float s= 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ chính xác epsilon: ");
        float epsilon = sc.nextFloat();
        for(float i=1;1/i>=epsilon;i++)
            {
            s = s+1/i;
            }
            System.out.println("Tổng s = "+ s);
    }
}
