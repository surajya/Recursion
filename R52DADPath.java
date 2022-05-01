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
public class R52DADPath {
    public static void main(String [] args){
//        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[] arr1={1,2};
        HashMap<Integer,Integer> hs=new HashMap<>();
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(NoPath(arr,arr1,0,0,hs));
    }
    
    static int NoPath(int[][] arr,int[] arr1, int i, int j,HashMap<Integer,Integer> hs){
        int m=arr.length,n=arr[0].length;
        if(hs.containsKey(arr[i][j])){
            
            return hs.get(arr[i][j]);}
        if(arr[i][j]==arr[m-1][n-1]) return 1;
        int p=0,q=0,r=0;
        int sum=0;
        for(int k:arr1){
        if(j+k<n){
            p=NoPath(arr,arr1,i,j+k,hs);}
            sum +=p;}
        
        for(int k:arr1){
        if(j+k<n && i+k<m){
            r=NoPath(arr,arr1,i+k,j+k,hs);}
        sum +=r;}
       
        for(int k:arr1){
        if(i+k<m){
            q=NoPath(arr,arr1,i+k,j,hs);}
        sum +=q;}
        
         hs.put(arr[i][j],p+q+r);
         System.out.println(arr[i][j]+":"+hs.get(arr[i][j]));
       
//       System.out.print(1+" ");
        return sum;
    }
    
}
