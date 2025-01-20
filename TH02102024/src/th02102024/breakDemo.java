/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th02102024;

/**
 *
 * @author Dell
 */
public class breakDemo {
    public static void main(String[] args) {
        int count;
        for(count = 1; count <= 10; count++){
            if(count == 5) break;
            System.out.printf("%d", count);
        }
        System.out.printf("\nBroke out of loop at count = %d\n", count);
    }
}
