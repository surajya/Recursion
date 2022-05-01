/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
public class stackdemo {
    private int capacity;
    private int top;
    private int arr[];
    stackdemo(int val){
        capacity=val;
        top=-1;
        arr=new int[capacity];
    }
    public void push(int val){
        if(isfull()){
            System.out.println("stack is full");
        }
        else{
            arr[++top]=val;
        }
    }
    public boolean isfull(){
        if(top==arrsize()-1){
            return true;
        }
        return false;
    }
    public int arrsize(){
        return capacity; 
    }
    public void popone(){
        top=top-1;
    }
    public void display(){
        while(top!=-1){
            System.out.println(arr[top]);
            popone();
        }
    }
    public static void main(String [] args){
        stackdemo stack=new stackdemo(6);
        stack.push(32);
        stack.push(90);
        stack.push(54);
        stack.push(23);
        stack.display();
    }
    
}
