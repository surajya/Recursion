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
public class R7NoOfPath {
    public static void main(String [] args){
        int[][] arr={{0,0,0,1},{0,1,0,1},{0,0,0,0},{1,1,0,0}};
        int[][] arr1=new int[arr.length][arr[0].length];
        System.out.println(Path(arr,0,0,arr1));
    }
    static int Path(int[][] arr,int i,int j, int[][] arr1){
       
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]==1 || arr1[i][j]==1) return 0;
        if(i==arr.length-1 && j==arr[0].length-1) return 1;
        
        arr1[i][j]=1;
        
        int a=Path(arr,i,j+1,arr1);
        int b=Path(arr,i+1,j,arr1);
        int c=Path(arr,i,j-1,arr1);
        int d=Path(arr,i-1,j,arr1);
        arr1[i][j]=0;
        
        return a+b+c+d;
    }
}
