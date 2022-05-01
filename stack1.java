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
public class stack1 {
    public static void main(String [] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(89);
         stack.push(546);
          stack.push(76);
           stack.push(8999);
            stack.push(8);
            while(!stack.isEmpty()){
                System.out.println(stack.peek());
                stack.pop();
            }
    }
}
