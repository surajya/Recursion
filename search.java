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
public class search {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("inter the size of aray:");
        int i=sc.nextInt();
        System.out.println("enter the element of the array:");
        int[] a=new int[i];
        for(int j=0; j<i; j++){
            a[j]=sc.nextInt();
        }
        int search=sc.nextInt();
        int r=0;
        for(int j:a){
            if(j==search){
                System.out.println("searching element is hte found");
                r=1;
                break;
            }
        }
        if(r==0){
            System.out.print("element is not found");
        }
    }
    
    
}
