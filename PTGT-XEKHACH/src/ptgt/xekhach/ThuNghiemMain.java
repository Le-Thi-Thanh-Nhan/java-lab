/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptgt.xekhach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ThuNghiemMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng xe khách: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Đọc bỏ ký tự newline

        ArrayList<XEKHACH> dsXEKHACH = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho xe khách thứ " + (i + 1) + ":");
            XEKHACH xekhach = new XEKHACH();
            xekhach.Nhap();
            dsXEKHACH.add(xekhach);
        }

        System.out.println("Danh sách xe khách đã nhập:");
        for (XEKHACH xekhach : dsXEKHACH) {
            xekhach.Xuat();
            System.out.println();
        }
        
        System.out.println("Danh sách xe khách có số ghế lớn hơn 29:");
        for (XEKHACH xekhach : dsXEKHACH) {
            if(xekhach.getSoGhe() > 29){
                xekhach.Xuat();
                System.out.println();
            }
        }
        
        Collections.sort(dsXEKHACH, Comparator.comparingDouble(XEKHACH::GiaSauThue).reversed());
        System.out.println("Danh sách xe khách sắp xếp theo chiều giảm dần của giá sau thuế:");
        for (XEKHACH xekhach : dsXEKHACH) {
            xekhach.Xuat();
            System.out.println();
        }

        Collections.sort(dsXEKHACH, Comparator.comparingDouble(XEKHACH::GiaSauThue));

        System.out.println("Danh sách xe khách sắp xếp theo chiều tăng dần của giá sau thuế:");
        for (XEKHACH xekhach : dsXEKHACH) {
            xekhach.Xuat();
            System.out.println();
        }
    }
}
