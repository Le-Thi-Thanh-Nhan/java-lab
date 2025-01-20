/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th23102024;

import java.util.Scanner;

/**
 *Bài 1. Sử dụng ngôn ngữ lập trình Java thực hiện các công việc sau:
a.	Tạo lớp CauThu trong đó:
-	Các thuộc tính gồm: Mã cầu thủ, Tên cầu thủ, Tuổi, Số huy chương
-	Các phương thức gồm:
+	Các setters/getters cho các thuộc tính, các Constructor.
	NhapCauThu() để nhập một cầu thủ.
	HienThiCauThu() để hiển thị một cầu thủ.
	TinhThuong() để tính thưởng cho cầu thủ. 
Biết rằng:
- Số huy chương > 5 thì Thưởng là 500000đ. 
- Số huy chương > 3 thì Thưởng là 300000đ. 
- Số huy chương > 2 thì Thưởng là 200000đ, còn lại không được thưởng
b.	Xây dựng chương trình chính để chạy thử nghiệm lớp CauThu:
	Nhập vào danh sách gồm n cầu thủ (với n là số nguyên dương nhập từ bàn phím)
	Hiển thị lại danh sách cầu thủ vừa nhập
	Sắp xếp danh sách các cầu thủ theo thứ tự giảm dần của tiền thưởng.
 * @author Dell
 */
public class CauThu {
    private String maCauThu;
    private String tenCauThu;
    private int tuoi;
    private int soHuyChuong;
    
    public CauThu(){}
//Source >> Insert Code >> Constructor
    public CauThu(String maCauThu, String tenCauThu, int tuoi) {
        this.maCauThu = maCauThu;
        this.tenCauThu = tenCauThu;
        this.tuoi = tuoi;
    }
//Source >> Insert Code >> Getter
    public String getMaCauThu() {
        return maCauThu;
    }

    public String getTenCauThu() {
        return tenCauThu;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getSoHuyChuong() {
        return soHuyChuong;
    }
//Source >> Insert Code >> Setter
    public void setMaCauThu(String maCauThu) {
        this.maCauThu = maCauThu;
    }

    public void setTenCauThu(String tenCauThu) {
        this.tenCauThu = tenCauThu;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setSoHuyChuong(int soHuyChuong) {
        this.soHuyChuong = soHuyChuong;
    }
    
    public void NhapCauThu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã: ");
        this.setMaCauThu(sc.nextLine());
        System.out.print("Tên cầu thủ: ");
        this.setTenCauThu(sc.nextLine());
        System.out.print("Tuổi: ");
        this.setTuoi(sc.nextInt());
        System.out.print("Số huy chương: ");
        this.setSoHuyChuong(sc.nextInt());
    }
    public void HienThiCauThu(){
        System.out.println("Mã: "+this.getMaCauThu());
        System.out.println("Tên: "+this.getTenCauThu());
        System.out.println("Tuổi: "+this.getTuoi());
        System.out.println("Số huy chương: "+this.getSoHuyChuong());
        System.out.println("Tiền thưởng: "+this.TinhThuong());
    }
    public float TinhThuong(){
        if(this.getSoHuyChuong() > 5) return 500;
        else if(this.getSoHuyChuong() > 3) return 300;
        else if(this.getSoHuyChuong() > 2) return 200;
        else return 0;
    }
    public static void main(String[] args) {
        CauThu ct = new CauThu();
        ct.NhapCauThu();
        ct.HienThiCauThu();
    }
}
