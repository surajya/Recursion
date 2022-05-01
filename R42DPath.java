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
public class R42DPath {
    public static void main(String [] args){
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        HashMap<Integer,Integer> hs=new HashMap<>();
//        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(NoPath(arr,0,0,hs));
    }
    
    static int NoPath(int[][] arr, int i, int j,HashMap<Integer,Integer> hs){
        int m=arr.length,n=arr[0].length;
        if(hs.containsKey(arr[i][j])) return hs.get(arr[i][j]);
        if(arr[i][j]==arr[m-1][n-1]) return 1;
        int p=0,q=0;
        if(j<n-1){
            p=NoPath(arr,i,j+1,hs);}
        if(i<m-1){
            q=NoPath(arr,i+1,j,hs);}
        hs.put(arr[i][j],p+q);
        System.out.print(1+" ");
        return p+q;
    }
}
