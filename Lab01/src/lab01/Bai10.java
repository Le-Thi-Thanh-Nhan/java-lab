/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author Dell
 */

/*Viết chương trình tìm điểm trung bình của hai học sinh trong ba môn học.
Cho điểm của học sinh thứ nhất là 60, 55 và 70, điểm của học sinh thứ hai là 80, 60 và 41
*/

public class Bai10 {
    public static void main(String[] args) {
        int[] hocSinh1 = {60, 55, 70};
        int[] hocSinh2 = {80, 60, 41};

        double trungBinh1 = (hocSinh1[0] + hocSinh1[1] + hocSinh1[2]) / 3.0;
        System.out.println("Điểm trung bình của học sinh thứ nhất: " + trungBinh1);

        double trungBinh2 = (hocSinh2[0] + hocSinh2[1] + hocSinh2[2]) / 3.0;
        System.out.println("Điểm trung bình của học sinh thứ hai: " + trungBinh2);
    }
}
