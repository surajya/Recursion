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
public class R5Permu {
    public static void main(String [] args){
        System.out.println(Permutation("abc",""));
    }
    static ArrayList<String> Permutation(String s,String ss){
        if(s.length()==0){
            ArrayList<String> list2=new ArrayList<>();
            list2.add(ss);
            return list2;
        }
//        if(s.length()==0){
//            System.out.println(ss);
//            return;
//        }
        
        ArrayList<String> list=new ArrayList<String>();
        for(int i=0; i<s.length(); i++){
            String s1=s.substring(i,i+1);
            String ts=s.replace(s.substring(i, i+1),"");
            ArrayList<String> list1=new ArrayList<>();
//            if(s.length()>0) list1=
             // System.out.println(s);
            list1=Permutation(ts,ss+s1);
            for(String j:list1){
                list.add(j);
            }
        }
        return list;
    }
}
