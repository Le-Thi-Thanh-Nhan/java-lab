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

//Nhập dãy n phần tử. Xóa các phần tử có giá trị bằng x nhập từ bàn phím

public class Bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của dãy: ");
        int n = scanner.nextInt();

        List<Integer> array = new ArrayList<>();
        System.out.print("Nhập các phần tử của dãy:");
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }

        System.out.print("Nhập giá trị cần xóa: ");
        int x = scanner.nextInt();

        boolean found = array.removeIf(value -> value == x);

        if (found) {
            System.out.println("Dãy sau khi xóa: "+ array);     
        } else {
            System.out.println("Không tìm thấy phần tử cần xóa");
        }
    }
}
