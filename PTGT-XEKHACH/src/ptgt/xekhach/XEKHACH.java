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
public class XEKHACH extends PTGT{
    private String soTuyen;
    int soGhe;

    public XEKHACH() {
    }

    public XEKHACH(String soTuyen, int soGhe) {
        this.soTuyen = soTuyen;
        this.soGhe = soGhe;
    }

    public XEKHACH(String soTuyen, int soGhe, String hangsx, int namsx, int giachuathue) {
        super(hangsx, namsx, giachuathue);
        this.soTuyen = soTuyen;
        this.soGhe = soGhe;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public int getSoGhe() {
        return soGhe;
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tuyến: ");
        this.setSoTuyen(sc.nextLine());
        System.out.print("Nhập số ghế: ");
        this.setSoGhe(sc.nextInt());
    }
    
    public int GiaSauThue(){
        int giasauthue = (int) (this.getGiachuathue() + this.getGiachuathue() * 0.08);
        return giasauthue;
    }
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Số tuyến: "+this.getSoTuyen());
        System.out.println("Số ghế: "+this.getSoGhe());
        System.out.println("Giá sau thuế: "+this.GiaSauThue());
    }
}
