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
public class MinCoseMat {
    public static void main(String [] args){
        int[][] arr={{2,8,4,1},{6,0,9,5},{1,4,3,4},{6,4,7,2}};
        int m=arr.length,n=arr[0].length;
        int[][] sto=new int[m][n];
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(i==m-1 && j==n-1) sto[i][j]=arr[i][j];
                else{
                int r;
                if(j+1<n) r=sto[i][j+1];
                else r=Integer.MAX_VALUE;
                int d;
                if(i+1<m) d=sto[i+1][j];
                else d=Integer.MAX_VALUE;
                int min1=Integer.min(r, d);
                sto[i][j]=min1+arr[i][j];}
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(sto[i][j]+" ");
            }
            System.out.println();
        }
//        System.out.println(sto[3][2]);
    }
}
