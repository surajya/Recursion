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
public class subseqRec {
    public static void main(String [] args){
        String s="suraj";
        System.out.println(sub(s));
    }
    static ArrayList<String> sub(String s){
        if(s.length()==0){
            ArrayList<String> br=new ArrayList<>();
            br.add("");
            return br;
        }
        char c=s.charAt(0);
        String s1=s.substring(1);
        ArrayList<String> sulist=sub(s1);
        ArrayList<String> myans=new ArrayList<>();
        for(String i:sulist){
            myans.add(""+i);
            myans.add(c+i);
        }
        return myans;
    }
    
}
