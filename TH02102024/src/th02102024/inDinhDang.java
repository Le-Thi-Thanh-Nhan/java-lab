/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th02102024;

/**
 *
 * @author Dell
 */
public class inDinhDang {
    public static void main(String[] args) {
        int a = 10;
        float x = 4.2356789f;
            System.out.printf("Giá trị của a = %10d và x = %12.4f", a, x); //In có định dạng
            System.out.println("");
        for(int i = 10; i < 1500; i += 20){
            System.out.printf("%10d\n", i);
        }
    }
}
