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
public class doWhileDemo {
    public static void main(String[] args) {
        /**Tính tổng các số lẻ từ 1 đến 100
         */
        int Tong = 0, i = 1;
        do{
            Tong += i; i += 2;
        } while(i <= 100);
        System.out.println(Tong);
    }
}
