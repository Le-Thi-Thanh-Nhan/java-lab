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

/*Dãy số Fibonacci được định nghĩa như sau: F0 = 1; F1 = 1; Fn = Fn-1 + Fn-2 với n>=2. 
Nhập một số tự nhiên n.
a) Hãy viết chương trình tìm số Fibonacci thứ n.
b) Hãy liệt kê các số Fibonacci nhỏ hơn n là số nguyên tố.
*/

public class Bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số tự nhiên: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Số Fibonacci thứ 0 là: 1");
        } else if (n == 1) {
            System.out.println("Số Fibonacci thứ 1 là: 1");
        } else {
            int a = 1, b = 1;
            for (int i = 2; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println("Số Fibonacci thứ " + n + " là: " + b);
        }
        
        List<Integer> array = new ArrayList<>();
        int a = 1, b = 1;
        while (a < n) {
            boolean isPrime = a > 1;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                array.add(a);
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println("Các số Fibonacci nhỏ hơn " + n + " là số nguyên tố: " + array);
    }
}
