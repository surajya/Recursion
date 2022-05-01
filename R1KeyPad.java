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
public class R1KeyPad {
    static ArrayList<String> allstr(String[] s, String n){
        if(n.length()==0){
            ArrayList<String> list2=new ArrayList<>();
            list2.add("");
            return list2;
        }
        
        String n1=n.substring(0,1);
        ArrayList<String> list=allstr(s,n.substring(1));
        ArrayList<String> list1=new ArrayList<>();
        
        String s1=s[Integer.parseInt(n1)];
        for(int i=0; i<s1.length(); i++){
            for(String j:list){
                list1.add(s1.substring(i,i+1)+j);
            }
        }
        return list1;
    }
    
    public static void main(String [] srgs){
        String[] s={"?!","abc","def","ghi","jkl","mnop","qrst","uv","wxyz",".;"};
        String ss="678";
        System.out.println(allstr(s,ss));
    }
    
}
