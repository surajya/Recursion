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
public class queuearr {
    public static void main(String [] args){
        Queue<Integer> que=new ArrayDeque<>(6);
        que.offer(33);
        que.offer(13);
        que.offer(73);
        que.offer(63);
        que.offer(83);
        que.offer(23);
        que.offer(53);
        que.offer(93);
        System.out.println(que);
        que.poll();
        System.out.println(que);
    }
    
}
