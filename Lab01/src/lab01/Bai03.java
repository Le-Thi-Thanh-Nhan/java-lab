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

/*
Viết chương trình java cho phép tạo và thực hiện theo menu sau:
1. Nhập vào một số nguyên dương n.
2. Tính tổng các số từ 1 đến n
3. Kiểm tra n có là số nguyên tố
4. Kiểm tra n có là số hoàn hảo.
5. Hiển thị số n thành tích các thừa số nguyên tố.
6. Thoát
(Hiển thị 1 số nguyên dương thành tích các thừa số nguyên tố: n = 24 in ra: n = 2^3*3)
*/

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int n = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Nhập vào một số nguyên dương n.");
            System.out.println("2. Tính tổng các số từ 1 đến n.");
            System.out.println("3. Kiểm tra n có là số nguyên tố.");
            System.out.println("4. Kiểm tra n có là số hoàn hảo.");
            System.out.println("5. Hiển thị số n thành tích các thừa số nguyên tố.");
            System.out.println("6. Thoát.");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập vào một số nguyên dương n: ");
                    n = sc.nextInt();
                    if (n <= 0) {
                        System.out.println("Vui lòng nhập một số nguyên dương!");
                        n = 0;
                    }
                    break;
                case 2:
                    if (n > 0) {
                        int sum = 0;
                        for (int i = 1; i <= n; i++) {
                            sum += i;
                        }
                        System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);
                    } else {
                        System.out.println("Bạn chưa nhập số nguyên dương n.");
                    }
                    break;
                case 3:
                    if (n > 0) {
                        boolean soNguyenTo = true;
                        if (n <= 1) {
                            soNguyenTo = false;
                        } else {
                            for (int i = 2; i <= Math.sqrt(n); i++) {
                                if (n % i == 0) {
                                    soNguyenTo = false;
                                    break;
                                }
                            }
                        }
                        if (soNguyenTo) {
                            System.out.println(n + " là số nguyên tố.");
                        } else {
                            System.out.println(n + " không phải là số nguyên tố.");
                        }
                    } else {
                        System.out.println("Bạn chưa nhập số nguyên dương n.");
                    }
                    break;
                case 4:
                    if (n > 0) {
                        int tongUoc = 1;
                        for (int i = 2; i <= n / 2; i++) {
                            if (n % i == 0) {
                                tongUoc += i;
                            }
                        }
                        if (tongUoc == n) {
                            System.out.println(n + " là số hoàn hảo.");
                        } else {
                            System.out.println(n + " không phải là số hoàn hảo.");
                        }
                    } else {
                        System.out.println("Bạn chưa nhập số nguyên dương n.");
                    }
                    break;
                case 5:
                    if (n > 0) {
                        System.out.print("Thua so nguyen to cua " + n + " la: ");
                        int tempN = n;
                        for (int i = 2; i <= tempN; i++) {
                            int dem = 0;
                            while (tempN % i == 0) {
                                dem++;
                                tempN /= i;
                            }
                            if (dem > 0) {
                                System.out.print(i);
                                if (dem > 1) {
                                    System.out.print("^" + dem);
                                }
                                if (tempN > 1) {
                                    System.out.print(" * ");
                                }
                            }
                        }
                        System.out.println();
                    } else {
                        System.out.println("Bạn chưa nhập số nguyên dương n.");
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 6);

        sc.close();
    }
}


    
        
    

