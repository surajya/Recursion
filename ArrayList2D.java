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
public class ArrayList2D {
    public static void main(String args []){
        ArrayList<ArrayList<Integer>> arrlist=new ArrayList<ArrayList<Integer>>();
//        for(int i=0; i<3; i++){
//            arrlist.add(new ArrayList<Integer>());
//        }
//        //Adding element in 2d arraylist;
//        arrlist.get(0).add(0,34);
//        arrlist.get(1).add(0,75);
//        arrlist.get(1).add(1,94);
//        arrlist.get(1).add(2,54);
//        arrlist.get(2).add(0,62);
//        arrlist.get(2).add(1,98);
//        arrlist.get(2).add(2,334);
//        arrlist.get(2).add(0,341);
//        System.out.print(arrlist);
       

     //2nd method for initializing the 2d array
     arrlist.add(new ArrayList<Integer>(Arrays.asList(34,56,23,78,90)));
     arrlist.add(new ArrayList<Integer>(Arrays.asList(45,67,22)));
     arrlist.add(new ArrayList<Integer>(Arrays.asList(12,89,78,90)));
     arrlist.add(new ArrayList<Integer>(Arrays.asList(374,56,90)));
     System.out.print(arrlist);
    }
}
