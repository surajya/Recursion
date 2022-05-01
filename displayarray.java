/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
public class displayarray {
    public static void main(String [] args){
        int[] arr={1,2,8,3,411,5,6,7,8};
        int max=Integer.MIN_VALUE;
        System.out.println(prit(arr,arr.length-1,8));
    }
    static int prit(int[] arr,int n,int a){
        if(n>=arr.length) return -1;
        if(arr[n]==a) return n;
        else {
        int max=prit(arr,n-1,a);
        return max;
        }       
        
//        System.out.println(max);
//        return max;
    }
    
}
