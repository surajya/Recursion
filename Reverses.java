/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
package string;
import java.util.*;
public class Reverses {
    public static void main(String [] args){
        StringBuffer str=new StringBuffer("abc");
//        substring("abx",0,"");
        permute(str,0,"abc".length());
    }
    
    static void permute(StringBuffer s,int l,int r){
        if(l==r){
            System.out.print(s+" ");
            return ;
        }
        for(int i=0; i<=r; i++){
            s=swap(s,l,i);
            permute(s,l+1,r);
            s=swap(s,l,i);
        }
    }
    static StringBuffer swap(StringBuffer s, int l,int i){
        char t;
        t=s.charAt(l);
        s.insert(l,s.charAt(i));
        s.insert(i,t);
        return s;
    }
    
    static void substring(String s,int i, String cur){
        if(i==s.length()){
            System.out.println(cur);
            return;
        }
        substring(s,i+1,cur+s.charAt(i));
        substring(s,i+1,cur);
    }
    
}
