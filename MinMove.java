/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
import java.util.*;
public class MinMove {
    public static void main(String [] args){
        int[] arr={3,2,4,2,0,2,3,1,2,2};
        int r=stair(arr,0,arr.length);
        System.out.println(r);
    }
    static int stair(int[] arr, int n,int len){
         if(n==10) return 1;
        if(n>10) return 0;
        int a=arr[n];
        if(a==0) return 0;
       
        int min1=stair(arr,n+1,len)+1;
        if(a>1){
            for(int i=2; i<a+1; i++){
                int f1=stair(arr,n+i,len)+1;
                if(f1<min1) min1=f1;
            }
        }
        return min1+1;
                
    }
    
}
