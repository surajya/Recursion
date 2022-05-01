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
public class R8TargetSum {
    public static void main(String [] args){
        int[] arr={1,1,1,1,1};
        ArrayList<Integer> list=new ArrayList<>();
        tarsum(0,0,arr,list,3);
        
    }
    static void tarsum(int sum,int n,int[] arr,ArrayList<Integer> list,int target){
        if(n==arr.length){
            if(sum==target){
                System.out.println(list);
            }
            return;
        }
        
        int p=arr[n];
        tarsum(sum,n+1,arr,list,target);
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i:list){
            list1.add(i);
        }
        list1.add(p);
        tarsum(sum+p,n+1,arr,list1,target);
        
    }
}
