/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
public class Recursion1 {
    public static void main(String [] args){
        System.out.println(rec(5,4));
    }
    static int rec(int a,int b){
        if(b==1) return 5;
 //       System.out.println(a);
          int f1=a*rec(a,b-1);
          System.out.println(f1);
         return f1;
    }
    
}
