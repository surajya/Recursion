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
public class heapInsert1 {
    public static void main(String [] args){
        int[] arr={50,30,40,29,28,15,10,0};
        insertend(arr,arr.length-1,395);
    }
    static void insertend(int[] arr,int n, int val){
        arr[n]=val;
        int i=n;
        while(i>0){
            int prt=(i-1)/2;
            if(arr[prt]<arr[i]){
                int temp=arr[prt];
                arr[prt]=arr[i];
                arr[i]=temp;
                i=(i-1)/2;
            }
            else break;
        }
        for(int j:arr){
            System.out.print(j+" ");
        }
    }
}
