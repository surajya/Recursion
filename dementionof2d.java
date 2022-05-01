/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
public class dementionof2d {
    public static void main(String [] args){
    int[][] arr={{2,4},{8,8}};
    int i=0, j=0;
    while(arr[i][j]>0){
        while(arr[i][j]>0){
            j++;
        }
        i++;
    }
    System.out.println(i+" "+j);
    }
    
}
