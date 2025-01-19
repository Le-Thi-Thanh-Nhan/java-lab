/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhvien.truongnhom;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class LapTrinhVien {
    private String hoTen;
    private int namSinh;
    private float hsl;

    public LapTrinhVien() {
    }

    public LapTrinhVien(String hoTen, int namSinh, float hsl) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.hsl = hsl;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ họ tên: ");
        this.setHoTen(sc.nextLine());
        System.out.print("Nhập năm sinh: ");
        this.setNamSinh(sc.nextInt());
        System.out.print("Nhập hệ số lương: ");
        this.setHsl(sc.nextFloat());
    }
    
    public void Xuat(){
        System.out.println("Họ tên: "+this.getHoTen());
        System.out.println("Năm sinh: "+this.getNamSinh());
        System.out.println("Hệ số lương: "+this.getHsl());
    }
}
