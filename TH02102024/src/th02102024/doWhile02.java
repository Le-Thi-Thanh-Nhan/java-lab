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
public class doWhile02 {
    public static void main(String[] args) {
        //Nhập 1 số nguyên dương từ bàn phím
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhập 1 số nguyên dương: ");
            n = sc.nextInt();
        } while (n<=0);
            System.out.println("Số nguyên dương vừa nhập: "+ n);
        }
}
