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
public class AdjecencyList {
    public static void main(String [] args){
        int vertex=5;
        int edge=8;
        ArrayList<ArrayList<Integer>> arrlist=new ArrayList<>();
        for(int i=0; i<vertex+1; i++){
            arrlist.add(new ArrayList<Integer>());
        }
        treaver(arrlist,edge);
    }
    static void treaver(ArrayList<ArrayList<Integer>> arrlist, int edge){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<edge; i++){
            System.out.println("enter source:");
            int source=sc.nextInt();
            System.out.println("enter goal:");
            int goal=sc.nextInt();
            arrlist.get(source).add(goal);
            arrlist.get(goal).add(source);
        }
        System.out.println(arrlist);
        
    }
}
