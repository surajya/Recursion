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
public class Maxsub01 {
    static int subarr(int[] arr){
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,-1);
        int currsum=0;
        int ans=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0)
                currsum +=-1;
            else
                currsum +=1;
            if(map.containsKey(currsum)){
                int start=map.get(currsum)+1;
                int len=i-start;
                if(ans<len)
                    ans=len;
            }
            else
                map.put(currsum,i);
        }
//        System.out.println(map);
        return ans+1;
    }
    
    public static void main(String [] args){
        int [] arr={0,0,0,0};
        System.out.println(subarr(arr));
 //       System.out.println(arr.length);
    }
}
