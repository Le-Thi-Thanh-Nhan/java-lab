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
public class TruongNhom extends LapTrinhVien{
    private int luongTrachNhiem, sonamCT;

    public TruongNhom() {
    }

    public TruongNhom(int luongTrachNhiem, int sonamCT) {
        this.luongTrachNhiem = luongTrachNhiem;
        this.sonamCT = sonamCT;
    }

    public TruongNhom(int luongTrachNhiem, int sonamCT, String hoTen, int namSinh, float hsl) {
        super(hoTen, namSinh, hsl);
        this.luongTrachNhiem = luongTrachNhiem;
        this.sonamCT = sonamCT;
    }

    public void setLuongTrachNhiem(int luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public void setSonamCT(int sonamCT) {
        this.sonamCT = sonamCT;
    }

    public int getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public int getSonamCT() {
        return sonamCT;
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Lương trách nhiệm: ");
        this.setLuongTrachNhiem(sc.nextInt());
        System.out.print("Nhập số năm công tác: ");
        this.setSonamCT(sc.nextInt());
    }
    
    public int tinhTienLuong(){
        int Luong = (int) (this.getHsl() * 1800000 + this.getSonamCT() * 50000 + this.getLuongTrachNhiem());
        return Luong;
    }
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Lương trách nhiệm: "+this.getLuongTrachNhiem());
        System.out.println("Số năm công tác: "+this.getSonamCT());
        System.out.println("Lương: "+this.tinhTienLuong());
    }
}
