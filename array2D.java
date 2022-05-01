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

public class array2D {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row of the array:");
        int row=sc.nextInt();
        System.out.println("enter the size of column of the array:");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
         System.out.println("enter the elementof the array:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]=sc.nextInt();
            }
        }
//        System.out.println("enter the searching element  in the array:");
//      int search=sc.nextInt();
         for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
