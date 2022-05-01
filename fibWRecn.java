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
public class fibWRecn {
   public static void main(String [] args){
       HashMap<Integer,Integer> hm=new HashMap<>();
       int n=fib(10,0,hm);
       System.out.println(n);
   } 
   static int fib(int r, int i, HashMap<Integer,Integer> hm){ 
       if(r==0 || r==1) return r;
       int subfib;
       if(hm.containsKey(r)){
           subfib=hm.get(r);
       }
       else{
       i++;
       int fib1=fib(r-1,i,hm);
       int fib2=fib(r-2,i,hm);
       subfib=fib1+fib2;
//       hm.put(r, subfib);
       System.out.print("hello"+" ");}
       return subfib;
   }
}
