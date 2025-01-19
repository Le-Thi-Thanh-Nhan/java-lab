/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam16102024;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
import java.util.Scanner;

class person {
    private String hoten;
    private String ngaysinh;
    private String quequan;
    
    public person(){
        
    }
    
    public person(String hoten, String ngaysinh, String quequan){
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ho và ten: ");
        hoten = scanner.nextLine();       
        
        System.out.println("Nhap ngay sinh: ");
        ngaysinh = scanner.nextLine();
        
        System.out.println("Nhap que quan: ");
        quequan = scanner.nextLine();
    }
    
    public void hien(){
        System.out.println("Ho và ten: " + hoten);
        System.out.println("Ngay sinh: " + ngaysinh);
        System.out.println("Que quan: " + quequan);
    }
}

class Congnhan extends person {
    private String nghenghiep;
    private double luong;
    
    public Congnhan(){
        
    }
    
    public Congnhan(String hoten, String ngaysinh, String quequan, String nghenghiep, double luong){
        super(hoten, ngaysinh, quequan);
        this.nghenghiep = nghenghiep;
        this.luong = luong;
    }

    public String getNghenghiep() {
        return nghenghiep;
    }

    public void setNghenghiep(String nghenghiep) {
        this.nghenghiep = nghenghiep;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap nghe nghiep: ");
        nghenghiep = scanner.nextLine();
        
        System.out.println("Nhap luong: ");
        luong = scanner.nextDouble();
    }
    @Override
    public void hien(){
        System.out.println("Nghe nghiep: " + nghenghiep);
        System.out.println("Luong: " + luong);
    }
    
}

public class Person{
    public static void main(String[] args){
        ArrayList<Congnhan> dsCongnhan = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong cong nhan: ");
        int soluong = scanner.nextInt();
        
        for(int i = 0; i < soluong; i++){
System.out.println("Nhap thong tin cong nhan thu " + (i + 1) + ":");
            Congnhan congnhan = new Congnhan();
            congnhan.nhap();
            dsCongnhan.add(congnhan);
        
        System.out.println("Danh sach cong nhan vua nhap:");
        for (Congnhan congNhan : dsCongnhan) {
            congNhan.hien();
            System.out.println("--------------------------");
        }

        Congnhan congNhanThuNhapCaoNhat = dsCongnhan.get(0);
        for (Congnhan congNhan : dsCongnhan) {
            if (congNhan.getLuong() > congNhanThuNhapCaoNhat.getLuong()) {
                congNhanThuNhapCaoNhat = congNhan;
            }
        }

        System.out.println("Công nhân có thu nhập cao nhất:");
        congNhanThuNhapCaoNhat.hien();
    }
}
}