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
public class hashpmap {
    public static void main(String [] args){
        int[] arr={1,2,2,1,3,1,1,3};
        int n=arr.length;
        HashSet<Integer> has=new HashSet<>(4);
        for(int i=0;i<n-3; i++){
            for(int j=i; j<i+4; j++){
                has.add(arr[j]);
            }
            System.out.println(has.size());
            has.clear();
        }
    } 
}
