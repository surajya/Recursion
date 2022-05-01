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
public class kandensAlgo {
    static int maxsum(int n, int[] arr){
        int sum=0,max=arr[0];
        for(int i:arr){
            if(i<0)
                sum=0;
            else
                sum +=i;
            if(sum>max)
                max=sum;
        }
        return max;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the element of the array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxsum(n, arr));
    }
}
