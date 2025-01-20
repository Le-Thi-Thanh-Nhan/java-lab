/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th30102024;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class QLTaiLieu {
    public static void nhap(ArrayList list, int n) {
    for (int i = 0; i < n; i++) {
        System.out.println("1.Sach");
        System.out.println("2.Tap Chi");
        System.out.println("3.Bao");
        System.out.print("Nhập lọai chi tài liệu thứ " + (i + 1) + ":");
        Scanner sc = new Scanner(System.in);
        int loai;
        loai = sc.nextInt();
        switch (loai) {
            case 1: {
                System.out.println("Sách: ");
                Sach sach = new Sach();//Tạo đối tượng Sách
                sach.Nhap();//Nhập thông tin sách
                list.add(sach);//Bổ sung sách vào list
                System.out.println("");
                break;
            }
            case 2: {
                System.out.println("Tạp chí: ");
                TapChi tapchi = new TapChi();//Tạo đối tượng Tapchi
                tapchi.Nhap();//Nhập thông tin cho đối tượng tapchi
                list.add(tapchi);//Bổ sung đối tượng vào DSLK: list
                System.out.println("");
                break;
            }
            case 3: {
                System.out.println("Báo: ");
                Bao bao = new Bao();//Tạo đối tượng Bao
                bao.Nhap();//Nhập thông tin báo
                list.add(bao);//Bổ sung vào danh sách list
                System.out.println("");
                break;
            }
           }
          }

     }
    public static void xuat(ArrayList<TaiLieu> list, int n) {
    //Xuất thông tin sử dụng foreach
        for (TaiLieu temp:list)
        temp.Xuat();
    }
      public static void timkiemMa(ArrayList<TaiLieu> list){
          //Tìm kiếm theo mã tài liệu
            String ma;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập mã cần tìm:");
            ma=sc.nextLine();
           for(int i=0;i<list.size();i++){
            if(list.get(i).getMaTL().equals(ma)) 
                 list.get(i).Xuat();
           }
        }

      public static void timkiemSL(ArrayList<TaiLieu> list){
          System.out.println("Các tài liệu có số BPH >1000:");
           for(int i=0;i<list.size();i++){
            if(list.get(i).getSoBPH()>1000) 
                 list.get(i).Xuat();
           }
        }
      public static void timkiemLoai(ArrayList<TaiLieu> list){
          //Tìm kiếm theo loại: Sach, Bao, Tapchi.
            String loai;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap Ten Loai tai lieu can tim kiem:");
            loai=sc.nextLine();
            loai="OOP."+loai;//OOP.Sach
           for(int i=0;i<list.size();i++){
         if(list.get(i).getClass().getName().equals(loai)) 
                 list.get(i).Xuat();
           }
        }
       private static void sapxep(ArrayList<TaiLieu> list) {
       //Sắp xếp tăng dần theo số bản phát hành  
       for(int i=0;i<list.size()-1;i++)
       for(int j=i+1;j<list.size();j++)
       if(list.get(i).getSoBPH()>list.get(j).getSoBPH()){//Đổi chỗ
           TaiLieu temp = list.get(i);
           list.set(i, list.get(j));
           list.set(j, temp);
         }
       //in ra
        xuat(list,list.size());
       }
        public static void main(String[] args) {
            ArrayList<TaiLieu> list = new ArrayList();
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap vao so tai lieu:");
            n = sc.nextInt();
            nhap(list,n);
            xuat(list,n);
            timkiemLoai(list);
            timkiemMa(list);
            timkiemSL(list);
            sapxep(list);
        }

}
