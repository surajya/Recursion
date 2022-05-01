/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class R8ndTargetSum {
    public static void main(String [] args){
        int[] arr={1,1,1,1,1};
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(tarsum(0,0,arr,list,3));
        
    }
    static int tarsum(int sum,int n,int[] arr,ArrayList<Integer> list,int target){
        if(n==arr.length){
            if(sum==target){
                return 1;
            }
            return 0;
        }
        
        int p=arr[n];
        int t=tarsum(sum,n+1,arr,list,target);
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i:list){
            list1.add(i);
        }
        list1.add(p);
        int j=tarsum(sum+p,n+1,arr,list1,target);
        return t+j;
    }
    
}
