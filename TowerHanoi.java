/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
public class TowerHanoi {
    public static void main(String [] args){
        int n=3;
        int t1=10;
        int t2=11,t3=12;
        tower(n,t1,t2,t3);
    }
    static void tower(int n, int t1, int t2, int t3){
        if(n==0) return;
        tower(n-1,t1,t3,t2);
        System.out.println(n+":"+t1+"->"+t2);
        tower(n-1,t3,t2,t1);
    }
    
}
