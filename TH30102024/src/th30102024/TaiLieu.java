/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th30102024;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class TaiLieu {
    private String maTL, tenNXB;
    private int soBPH;

    public TaiLieu() {
    }

    public TaiLieu(String maTL, String tenNXB, int soBPH) {
        this.maTL = maTL;
        this.tenNXB = tenNXB;
        this.soBPH = soBPH;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public void setSoBPH(int soBPH) {
        this.soBPH = soBPH;
    }

    public String getMaTL() {
        return maTL;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public int getSoBPH() {
        return soBPH;
    }
    //Xây dựng phương thức nhập thông tin
     public void Nhap(){
         Scanner sc = new Scanner(System.in);
         System.out.print("Nhập mã tài liệu: ");
         this.setMaTL(sc.nextLine());
         System.out.print("Tên NXB: ");
         this.setTenNXB(sc.nextLine());
         System.out.print("Số bản ghi: ");
         this.setSoBPH(sc.nextInt());
     }
     public void Xuat(){
         System.out.println("Mã tài liệu: "+this.getMaTL());
         System.out.println("Tên NXB: "+this.getTenNXB());
         System.out.println("Số bản phát hành: "+this.getSoBPH());
    }
}
