/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhvien.truongnhom;

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
        System.out.print("Nhập số lượng trưởng nhóm: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Đọc bỏ ký tự newline

        ArrayList<TruongNhom> dsTruongNhom = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho trưởng nhóm thứ " + (i + 1) + ":");
            TruongNhom truongnhom = new TruongNhom();
            truongnhom.Nhap();
            dsTruongNhom.add(truongnhom);
        }

        System.out.println("Danh sách trưởng nhóm đã nhập:");
        for (TruongNhom truongnhom : dsTruongNhom) {
            truongnhom.Xuat();
            System.out.println();
        }
        
        Collections.sort(dsTruongNhom, Comparator.comparingDouble(TruongNhom::tinhTienLuong).reversed());
        System.out.println("Danh sách trưởng nhóm sắp xếp theo chiều giảm dần của tiền lương:");
        for (TruongNhom truongnhom : dsTruongNhom) {
            truongnhom.Xuat();
            System.out.println();
        }

        Collections.sort(dsTruongNhom, Comparator.comparingDouble(TruongNhom::tinhTienLuong));

        System.out.println("Danh sách trưởng nhóm sắp xếp theo chiều tăng dần của tiền lương:");
        for (TruongNhom truongnhom : dsTruongNhom) {
            truongnhom.Xuat();
            System.out.println();
        }
    }
}
