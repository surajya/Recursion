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
public class coutnHash {
    static int coutdist(int n,int[] arr1, int[] arr2){
        int count=0;
        Set<Integer> hst=new HashSet<>(n+6);
        for(int i:arr1){
            hst.add(i);
        }
        for(int i:arr2){
            if(hst.contains(i)){
                count +=1;
                hst.remove(i);
            }
        }
        return count;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements to the array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int[] arr1={2,4,5,6,7,6};
        System.out.println(coutdist(n,arr,arr1));
    }
}
