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
public class stclk {
    public static void main(String [] args){
        Stack<Integer> st=new Stack<>();
        int [] arr={4,10,5,8,20,15,3,12};
        for(int i=0; i<arr.length; i++){
//            if(st.isEmpty()){
//                int r=arr[i];
//                arr[i]=-1;
//                st.push(r);
//            }
//            else{
//                while(!st.isEmpty()){
//                    if(st.peek()<arr[i]){
//                        int t=arr[i];
//                        arr[i]=st.peek();
//                        st.push(t);
//                    }
//                    else{
//               
//                        st.pop();
//                    }
//                }
//            }
//        }
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
            while(!st.isEmpty() && st.peek()>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(st.peek()+" ");
            }
            st.push(arr[i]);
        }
    }
    
}
