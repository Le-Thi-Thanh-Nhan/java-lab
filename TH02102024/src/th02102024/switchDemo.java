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
public class switchDemo {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n (2-8)= ");
        n = sc.nextInt();
        switch(n){
            case 2: System.out.println("Thứ 2"); break;
            case 3: System.out.println("Thứ 3"); break;
            case 4: System.out.println("Thứ 4"); break;
            case 5: System.out.println("Thứ 5"); break;
            case 6: System.out.println("Thứ 6"); break;
            case 7: System.out.println("Thứ 7"); break;
            case 8: System.out.println("CN"); break;
            
            default: System.out.println("Nhập lại");
        }
    }
}
