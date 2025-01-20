/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptgt.xekhach;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class PTGT {
    private String hangsx;
    private int namsx;
    private int giachuathue;

    public PTGT() {
    }

    public PTGT(String hangsx, int namsx, int giachuathue) {
        this.hangsx = hangsx;
        this.namsx = namsx;
        this.giachuathue = giachuathue;
    }

    public void setHangsx(String hangsx) {
        this.hangsx = hangsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public void setGiachuathue(int giachuathue) {
        this.giachuathue = giachuathue;
    }

    public String getHangsx() {
        return hangsx;
    }

    public int getNamsx() {
        return namsx;
    }

    public int getGiachuathue() {
        return giachuathue;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hãng sản xuất: ");
        this.setHangsx(sc.nextLine());
        System.out.print("Nhập năm sản xuất: ");
        this.setNamsx(sc.nextInt());
        System.out.print("Nhập giá chưa thuế: ");
        this.setGiachuathue(sc.nextInt());
    }
    
    public void Xuat(){
        System.out.println("Hãng sản xuất: "+this.getHangsx());
        System.out.println("Năm sản xuất: "+this.getNamsx());
        System.out.println("Giá chưa thuế: "+this.getGiachuathue());
    }
}
