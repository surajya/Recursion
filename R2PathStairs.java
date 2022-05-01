/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
public class R2PathStairs {
    static int stair(int[] arr, int n){
        int f1=0,f2=0,f3=0;
        if(n<0) return 0;
        else if(n==0) return 1;
        else{
        f1=stair(arr,n-1);
        f2=stair(arr,n-2);
        f3=stair(arr,n-3);}
        int sum =f1+f2+f3;
        return sum;
    }
    public static void main(String [] args){
        int[] arr={1,2,3};
        System.out.println(stair(arr,11));
    }
}
