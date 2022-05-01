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
public class hashmap {
    static int subarr(int sum, int[] arr){
        HashMap<Integer, Integer> map=new HashMap<>();
        int currsum=0;
        int start=0;
        int end=-1;
        for(int i=0; i<arr.length; i++){
            currsum +=arr[i];
            if(currsum==sum){
                start=0;
                end=i;
                return start;
            }
            else if(map.containsKey(currsum-sum)){
                start=map.get(currsum-sum)+1;
                end=i;
                return start;
            }
            else{
            map.put(currsum, i);
            }
        }
        return start;
    }
    
    public static void main(String [] args){
        int [] arr={10,15,-5,15,-10,5};
        System.out.println(subarr(5, arr));
 //       System.out.println(arr.length);
    }
}
