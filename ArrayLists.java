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

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> oist = new ArrayList<Integer>();
        oist.add(0);
        oist.add(15);
        oist.add(7);
        oist.add(1,3);
        oist.set(0,5);
//        oist.delete(1);
        for(int i:oist){
        System.out.println(i);
        }
        Collections.sort(oist);
        System.out.println(oist);
    }
}
