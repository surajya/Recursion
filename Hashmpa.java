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
public class Hashmpa {
    public static void main(String [] args){
        int[] arr={1,2,2,1,3,1,1,3};
        int n=4,j=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(i<n){
                if(map.containsKey(arr[i])){
                    j=map.get(arr[i])+1;
                    map.put(arr[i], j);
                }
                else
                    map.put(arr[i], 1);
                if(i==n-1)
                    System.out.println(map.size());
            }
            else{
                if(map.containsKey(arr[i])){
                    j=map.get(arr[i])+1;
                    map.put(arr[i], j);
                }
                else
                    map.put(arr[i], 1);
                if(map.get(arr[i-n])==0){
                    map.remove(arr[i-n]);
                }
                else{
                    j=map.get(arr[i-n])-1;
                    map.put(arr[i-n], j);
                }
                System.out.println(map.size());
            }
        }
    }
}
