/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam16102024;

import java.util.Scanner;

/**
 * Nhập số nguyên dương n (có kiểm tra giá trị n) và dãy các số thực a0, a1, ..., an-1.
 * Không đổi chỗ các phần tử và không dùng thêm mảng số thực nào khác (có thể dùng mảng số nguyên nếu cần) 
 * hãy cho hiện trên màn hình dãy trên theo thứ tự giảm dần.
 * @author Dell
 */
public class Bai2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        int n;
        do {
            System.out.print("Nhập số nguyên dương n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Giá trị n không hợp lệ! Vui lòng nhập lại.");
            }
        } while (n <= 0);
        
        double[] arr = new double[n];
        System.out.println("Nhập dãy số thực:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = scanner.nextDouble();
        }

        int[] sapxep = new int[n];
        for (int i = 0; i < n; i++) {
            sapxep[i] = i;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[sapxep[i]] < arr[sapxep[j]]) {
                    
                    int x = sapxep[i];
                    sapxep[i] = sapxep[j];
                    sapxep[j] = x;
                }
            }
        }
        
        System.out.println("Dãy theo thứ tự giảm dần:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[sapxep[i]] + " ");
        }
    
    }
}
