/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th23102024;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class xemay {
    public String nhasx;
    public String model;
    private float chiphisx;
    protected int thoigiansx;
    public float tinhgiaban(){
        return (float) (1.5 * chiphisx);
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập nhà SX: ");
        this.nhasx = sc.nextLine();
        System.out.println("Nhập model: ");
        this.model = sc.nextLine();
        System.out.println("Nhập chi phí SX: ");
        this.chiphisx = sc.nextFloat();
        System.out.println("Nhập thời gian sản xuất: ");
        this.thoigiansx = sc.nextInt();
        
    }
    public void Xuat() {
        System.out.println("Nhà SX: "+this.nhasx);
        System.out.println("Model: "+this.model);
        System.out.println("Chi phí SX: "+this.chiphisx);
        System.out.println("Thời gian SX: "+this.thoigiansx);
    }
    public class QlXemay {
    public static void main(String[] args) {
        xemay a = new xemay();
        a.Nhap();
        a.Xuat();
    }
}
}

