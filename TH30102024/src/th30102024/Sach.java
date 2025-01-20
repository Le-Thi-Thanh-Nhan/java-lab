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
public class Sach extends TaiLieu{
    private String tenTG, tenSach;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenTG, String tenSach, int soTrang, String maTL, String tenNXB, int soBPH) {
        super(maTL, tenNXB, soBPH);
        this.tenTG = tenTG;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
    @Override
    public void Nhap(){
        super.Nhap(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên tác giả: ");
        this.setTenTG(sc.nextLine());
        System.out.print("Nhập tên sách: ");
        this.setTenSach(sc.nextLine());
        System.out.print("Nhập số trang: ");
        this.setSoTrang(sc.nextInt());
    }
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Tên tác giả: "+this.getTenTG());
        System.out.println("Tên sách: "+this.getTenSach());
        System.out.println("Số trang: "+this.getSoTrang());
    }
    
    
}
