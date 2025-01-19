/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg44.lethithanhnhan.pkg22103200077;

/**
 *
 * @author Dell
 */
import java.util.Scanner;

public class NV {
    private int maNV;
    private String hoTen, chucVu;
    private float hsl;

    public NV() {
    }

    public NV(int maNV, String hoTen, String chucVu, float hsl) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.hsl = hsl;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public int getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getChucVu() {
        return chucVu;
    }

    public float getHsl() {
        return hsl;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
         System.out.print("Nhập mã nhân viên: ");
         this.setMaNV(sc.nextInt());
         System.out.print("Nhập họ tên: ");
         this.setHoTen(sc.nextLine());
         System.out.print("Nhập chức vụ: ");
         this.setChucVu(sc.nextLine());
         System.out.print("Nhập hệ số lương: ");
         this.setHsl(sc.nextFloat());
    }
    
    public void Xuat(){
        System.out.println("Mã nhân viên: "+this.getMaNV());
        System.out.println("Họ tên: "+this.getHoTen());
        System.out.println("Chức vụ: "+this.getChucVu());
        System.out.println("Hệ số lương: "+this.getHsl());
    }
}
