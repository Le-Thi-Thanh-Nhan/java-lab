/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg44.lethithanhnhan.pkg22103200077;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ThuNghiemMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng cán bộ: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Đọc bỏ ký tự newline

        ArrayList<CanBo> dsCanBo = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho cán bộ thứ " + (i + 1) + ":");
            CanBo canBo = new CanBo();
            canBo.Nhap();
            dsCanBo.add(canBo);
        }

        System.out.println("Danh sách cán bộ đã nhập:");
        for (CanBo canBo : dsCanBo) {
            canBo.Xuat();
            System.out.println();
        }

        Collections.sort(dsCanBo, Comparator.comparingDouble(CanBo::tinhPhuCap));

        System.out.println("Danh sách cán bộ sắp xếp theo tiền phụ cấp:");
        for (CanBo canBo : dsCanBo) {
            canBo.Xuat();
            System.out.println();
        }
    }
}

