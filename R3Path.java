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
public class R3Path {
    public static void main(String [] args){
        int[] arr={1,2,3};
        System.out.println(stair(arr,4));
    }
    
    static ArrayList<String> stair(int[] arr, int n){
        if(n==0){
            ArrayList<String> list=new ArrayList<>();
            list.add("");
            return list;
        }
        else if(n<0){
            ArrayList<String> list4=new ArrayList<>();
            return list4;
        }
        ArrayList<String> list3=new ArrayList<>();
        for(int i:arr){
            ArrayList<String> list2=stair(arr,n-i);
            
            
            for(String j:list2){
                list3.add(String.valueOf(i)+j);
            }
        }
        return list3;
    }
}
