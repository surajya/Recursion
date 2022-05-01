/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
public class R6EnCoding {
    public static void main(String [] args){
        encoding("12","");
    }
    
    static void encoding(String s,String ss){
        if(s.length()==0){
            System.out.println(ss);
            return;
        }
        else if(s.length()==1){
            char ch=s.charAt(0);
            if(ch=='0') return;
            else{
                int n=ch-'0';
                char code=(char)('a'+n-1);
                System.out.println(ss+code);
            }
        }
        else{
            char ch=s.charAt(0);
            String cs=s.substring(1);
            if(ch=='0') return;
            else{
                int n=ch-'0';
                char code=(char)('a'+n-1);
                encoding(cs,ss+code);
            }
            String s2=s.substring(0,2);
            String s3=s.substring(2);
            
            int n=Integer.parseInt(s2);
            if(n<=26){
                char code=(char)('a'+n-1);
                encoding(s3,ss+code);
            }
            
        }
    }
    
}
