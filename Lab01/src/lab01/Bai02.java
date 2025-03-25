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

//Giải phương trình bậc 2: ax^2 + bx + c = 0

public class Bai02 {
    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a:");
        a = sc.nextFloat();
        System.out.print("Nhập hệ số b:");
        b = sc.nextFloat();
        System.out.print("Nhập hệ số c:");
        c = sc.nextFloat();
        
        float delta = b*b - 4*a*c;
     
        //Giải biện luận
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("PT có vô số nghiệm");
                }else System.out.println("PT vô nghiệm");    
            }else System.out.printf("PT có nghiệm duy nhất: x = %.2f", -c/b);
        }else{
            if(delta<0){
                System.out.println("PT vô nghiệm");
            }else if(delta==0){
                System.out.printf("PT có nghiệm kép x1=x2=%.2f",-b/(2*a));
            }else{     
                System.out.printf("PT có hai nghiệm x1=%.2f, x2=%.2f", -b-Math.sqrt(delta)/(2*a),(-b+Math.sqrt(delta))/(2*a));
            }  
        }
    }
}
