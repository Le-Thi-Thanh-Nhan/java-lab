/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */

/*Nhập một mảng nguyên từ bàn phím
a) Sắp xếp và in lại dãy đã sắp ra màn hình.
b) In ra màn hình phần tử có giá trị nhỏ nhất
c) Tính trung bình cộng các phần tử chia hết cho 3
*/

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của dãy: ");
        int n = sc.nextInt();

        List<Integer> array = new ArrayList<>();
        System.out.print("Nhập các phần tử của dãy:");
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }
        
        Collections.sort(array);
        System.out.println("Dãy sau khi sắp xếp tăng dần: " + array);
        System.out.println();
        
        array.sort(Collections.reverseOrder());
        System.out.println("Dãy sau khi sắp xếp giảm dần: " + array);
        System.out.println();
        
        int min = Collections.min(array);
        System.out.println("Phần tử có giá trị nhỏ nhất: " + min);
        System.out.println();

        int sum = 0;
        int dem = 0;
        for (int num : array) {
            if (num % 3 == 0) {
                sum += num;
                dem++;
            }
        }
        if (dem > 0) {
            double average = (double) sum / dem;
            System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + average);
        } else {
            System.out.println("Không có phần tử nào chia hết cho 3.");
        }
        sc.close();
    }
}
