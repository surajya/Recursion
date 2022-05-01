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
public class hashmaps {
    public static void main(String [] args){
        HashSet<Integer> hst=new HashSet<>(100);
        hst.add(23);
        hst.add(63);
        hst.add(87);
        hst.add(293);
        System.out.println(hst);
        if(hst.contains(34)){
            System.out.println("elements are presents");
        }
        else
            System.out.println("34 is not presentes");
        hst.remove(23);
        System.out.println(hst.isEmpty());
        System.out.println(hst.size());
        hst.clear();
        System.out.println(hst.size());
    }
}
