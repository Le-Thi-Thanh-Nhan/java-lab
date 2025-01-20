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
public class TapChi extends TaiLieu{
    private int soPH, thangPH;

    public TapChi() {
    }

    public TapChi(int soPH, int thangPH, String maTL, String tenNXB, int soBPH) {
        super(maTL, tenNXB, soBPH);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public int getSoPH() {
        return soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phát hành: ");
        this.setSoPH(sc.nextInt());
        System.out.print("Nhập tháng phát hành: ");
        this.setThangPH(sc.nextInt());
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Số phát hành: "+this.getSoPH());
        System.out.println("Tháng phát hành: "+this.getThangPH());
    }
    
    public static void main(String[] args) {
        TapChi tc = new TapChi();
        tc.Nhap();
        tc.Xuat();
    }
}
