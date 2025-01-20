/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th23102024;

import th23102024.xemay02;

/**
 *
 * @author Dell
 */
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class xemay02 {
    public String nhasx;
    public String model;
    private float chiphisx;
    protected int thoigiansx;
//Khởi tạo không tham số
    public xemay02() {
    }
//Khởi tạo có tham số
  public xemay02(String nhasx, String model, float chiphisx, int thoigiansx) {
        this.nhasx = nhasx;
        this.model = model;
        this.chiphisx = chiphisx;
        this.thoigiansx = thoigiansx;
    }

    public float getChiphisx() {
        return chiphisx;
    }

    public void setChiphisx(float chiphisx) {
        this.chiphisx = chiphisx;
    }

    public String getNhasx() {
        return nhasx;
    }

    public void setNhasx(String nhasx) {
        this.nhasx = nhasx;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getThoigiansx() {
        return thoigiansx;
    }

    public void setThoigiansx(int thoigiansx) {
        this.thoigiansx = thoigiansx;
    }
    
    //Phương thức tính giá ban không tham số
    public float tinhgiaban() { return (float) (1.5 * chiphisx); }
    
    //Phương thức tính giá ban có tham số là số int
    public float tinhgiaban(int hoahong) { 
        return (float) (1.5 * chiphisx + hoahong); }
    
    //Phương thức tính giá ban có tham số là số float
    public float tinhgiaban(float chietkhau) {
        return (float) (1.5 * chiphisx- chietkhau); }
    
    public void nhap(){
      Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Nhà sx: ");
      //  this.nhasx = sc.nextLine();
       this.setNhasx(sc.nextLine());
        System.out.print("Model: ");
      //  this.model = sc.nextLine();
       this.setModel(sc.nextLine());
        System.out.print("Chi phí sx: ");
       // this.chiphisx = sc.nextFloat();
       this.setChiphisx(sc.nextFloat());
        System.out.print("Thời gian sx: ");
      //  this.thoigiansx = sc.nextInt();
      this.setThoigiansx(sc.nextInt());
    }
    public void xuat(){
       //System.out.println("Nhà SX: "+ this.nhasx);
       System.out.println("Nhà SX: "+ this.getNhasx());
      // System.out.println("Model: "+ this.model);
       System.out.println("Model: "+ this.getModel());
      // System.out.println("Chi phí: "+ this.chiphisx);
       System.out.println("Chi phí: "+ this.getChiphisx());
       //System.out.println("thời gian sx: "+ this.thoigiansx);
       System.out.println("Thời gian sx: "+ this.getThoigiansx());
       System.out.println("Giá bán: "+ this.tinhgiaban());
       System.out.println("Giá bán có hoa hồng: "+ this.tinhgiaban(5));
       System.out.println("Giá bán đã chiết khấu: "+ this.tinhgiaban(0.5f));
    }
    public static void main(String[] args) {   
      xemay02 a = new xemay02();
      a.nhap();
      a.xuat();    
    }
}
