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
public class Bao extends TaiLieu{
    private int ngayPH;

    public Bao() {
    }

    public Bao(int ngayPH, String maTL, String tenNXB, int soBPH) {
        super(maTL, tenNXB, soBPH);
        this.ngayPH = ngayPH;
    }

    public int getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(int ngayPH) {
        this.ngayPH = ngayPH;
    }
    @Override
    public void Nhap(){
        super.Nhap();
         Scanner sc = new Scanner(System.in);
         System.out.print("Nhập ngày phát hành: ");
         this.setNgayPH(sc.nextInt());
     }
    @Override
     public void Xuat(){
         super.Xuat();
         System.out.println("Ngày phát hành: "+this.getNgayPH());
     }
}
