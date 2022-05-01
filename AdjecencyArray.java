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
public class AdjecencyArray {
    public static void main(String [] args){
        int node=5;
        int edge=8;
        int[][] arr=new int[node+1][node+1];
        inut(arr,edge);
    }
    static void inut(int[][] arr,int edge){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<edge; i++){
        System.out.println("enter the vertex:");
        int vertex=sc.nextInt();
        System.out.println("enter the destin:");
        int destin=sc.nextInt();
        arr[vertex][destin]=1;
        arr[destin][vertex]=1;
    }
        for(int j=0; j<arr.length; j++){
            for(int k=0; k<arr.length; k++){
                System.out.print(arr[j][k]+" ");
            }
            System.out.println();
        }
        
    }
}
