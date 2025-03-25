/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */

/*Nhập mảng có n phần tử các số nguyên.
a. In ra các phần tử là số nguyên tố của mảng.
b. In ra các phần tử là số hoản hảo của mảng.
c. In ra các phần tử là số chẵn
*/

public class Bai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của dãy: ");
        int n = sc.nextInt();

        List<Integer> array = new ArrayList<>();
        System.out.print("Nhập các phần tử của dãy: ");
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }
        
        boolean hasPrime = false;
        boolean hasPerfect = false;
        boolean hasEven = false;
        
        //SỐ NGUYÊN TỐ
        System.out.print("Các phần tử là số nguyên tố: ");
        for (int i : array) {
            if (i > 1) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    System.out.println();
                    hasPrime = true;
                }
            }
        }
        if (!hasPrime) {
            System.out.println("Không có số nguyên tố.");
        }
        
        //SỐ HOÀN HẢO
        System.out.print("Các phần tử là số hoàn hảo: ");
        for (int i : array) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i && i != 0) {
                System.out.println(i + " ");
                hasPerfect = true;
            }
        }
        if (!hasPerfect) {
            System.out.println("Không có số hoàn hảo.");
        }
  
        //SỐ CHẴN
        System.out.print("Các phần tử là số chẵn: ");
        for (int i : array) {
            if (i % 2 == 0) {                
                System.out.println(i + " ");
                hasEven = true;
            }
        }
        if (!hasEven) {
            System.out.println("Không có số chẵn.");
        }
    }
}
