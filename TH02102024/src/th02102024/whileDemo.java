/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th02102024;

/**
 *
 * @author Dell
 */
public class whileDemo {
    public static void main(String[] args) {
        int a = 5, fact = 1;
        while(a>=1){
            fact *= a;
            a--;
        }
        System.out.println("The Factorial of 5 is " + fact);
    }
}
