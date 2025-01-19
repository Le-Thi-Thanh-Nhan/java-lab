/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg44.lethithanhnhan.pkg22103200077;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class CanBo extends NV{
    private int soNamCT;

    public CanBo() {
    }

    public CanBo(int soNamCT, int maNV, String hoTen, String chucVu, float hsl) {
        super(maNV, hoTen, chucVu, hsl);
        this.soNamCT = soNamCT;
    }

    public void setSoNamCT(int soNamCT) {
        this.soNamCT = soNamCT;
    }

    public int getSoNamCT() {
        return soNamCT;
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
         Scanner sc = new Scanner(System.in);
         System.out.print("Nhập số năm công tác: ");
         this.setSoNamCT(sc.nextInt());
    }
    
    public double tinhPhuCap() {
        switch (this.getChucVu()) {
            case "GD":
                return 10000000;
            case "PGĐ":
                return 7000000;
            case "TP":
                return 5000000;
            default:
                return 1000000;
        }
    }
    @Override
    public void Xuat(){
        super.Xuat();
         System.out.println("Số năm công tác: "+this.getSoNamCT());
         System.out.println("Phụ cấp: "+this.tinhPhuCap());
    }
}
