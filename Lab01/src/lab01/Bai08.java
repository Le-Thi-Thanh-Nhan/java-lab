/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */

//Nhập mảng có n phần tử các số nguyên, sắp xếp mảng tăng dần bằng thuật toán chèn và hiển thị mảng đã sắp xếp ra màn hình.

public class Bai08 {
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
    }
}
