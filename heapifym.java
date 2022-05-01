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
public class heapifym {
    public static void main(String [] args){
        int[] arr={10,50,30,15,38,48,117,11,110};
        for(int i=((arr.length)/2)-1; i>=0; i--){
            heapify(arr,i,arr.length);
        }
 //       display(arr);
    }
    static void heapify(int[] arr, int i, int n){
        if(i<=(n/2)-1){
        int larger=arr[i];
        int l=2*i+1;
        int r=2*i+2;
        if(r<n){
            if( arr[l]>larger && arr[l]>arr[r]){
                int temp=arr[l];
                arr[l]=larger;
                arr[i]=temp;
                heapify(arr,l,n);
            }
            else if(arr[r]>larger){
                int temp=arr[r];
                arr[r]=larger;
                arr[i]=temp;
                heapify(arr,r,n);
                
            }
        }
        if(arr[l]>larger){
                int temp=arr[l];
                arr[l]=larger;
                arr[i]=temp;
                heapify(arr,l,n);
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
        System.out.println();
    }
    }
    static void display(int[] arr){
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
