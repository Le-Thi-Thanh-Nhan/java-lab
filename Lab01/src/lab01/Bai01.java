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

//Tìm max, min của 2 số nguyên nhập vào từ bàn phím

public class Bai01 {
    public static void main(String[] args) {
        int a,b,max,min;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a:");
        a = sc.nextInt();
        System.out.print("Nhập số nguyên b:");
        b = sc.nextInt();
        
        //Cách 1:
        max = (a>b)?a:b;    // (biểu_thức_điều_kiện) ? giá_trị_nếu_đúng : giá_trị_nếu_sai
        min = (a>b)?b:a;
        System.out.println("Max là:"+max);
        System.out.println("Min là:"+min);

        //Cách 2:
        if (a > b){
            System.out.println("Max là: "+a);
            System.out.println("Mix là: "+b);
        }else{
            System.out.println("Max là: "+b);
            System.out.println("Min là: "+a);
        }
        
        //Trình bày kiểu 2:
        System.out.println("Max là: "+((a>b)?a:b));
        System.out.println("Mix là: "+((a>b)?b:a));
    }
}
