/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam16102024;

import java.util.Scanner;


/**
 *Sử dụng vòng lặp while viết chương trình tính tổng: S = 1 + 1/2! + 1/3! + …. 
 * với độ chính xác epsilon nhập từ bàn phím (với 0<epsilon<1, có kiểm tra giá trị nhập vào của epsilon).
 * @author Dell
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double epsilon;
        do {
            System.out.print("Nhập giá trị epsilon (0 < epsilon < 1): ");
            epsilon = scanner.nextDouble();
            
            if (epsilon <= 0 || epsilon >= 1) {
                System.out.println("Giá trị epsilon không hợp lệ! Vui lòng nhập lại.");
            }
        } while (epsilon <= 0 || epsilon >= 1);

        double S = 1.0;
        double i = 1.0;
        int n = 1;

        while (i >= epsilon) {
            i = 1.0 /tinhgiaithua(n);
            S += i;
            n++;
        }

        System.out.println("Tổng S với độ chính xác epsilon là: " + S);
        
        }
        public static long tinhgiaithua(int n) {
            long giaithua = 1;
            for (int i = 1; i <= n; i++) {
                giaithua *= i;
            }
            return giaithua;
        }
}
