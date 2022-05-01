/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
public class queueArray {
    private int capacity;
    private int arr[];
    private int rear;
    public queueArray(int data){
        capacity=data;
        arr=new int[data];
        rear=-1;
    }
    public void enque(int data){
        if(rear<capacity-1){
            arr[++rear]=data;
        }
        else{
            System.out.println("queue is full");
        }
    }
    public void dequeue(){
        System.out.println("dequue element is: "+arr[0]);
        for(int i=0; i<rear; i++){
            arr[i]=arr[i+1];
        }
        rear--;
    }
    public void display(){
        if(rear!=-1){
            int i=0;
        while(i<rear+1){
            System.out.println(arr[i++]);
        }
        }
    }
    public static void main(String [] args){
        queueArray arr=new queueArray(6);
        arr.enque(45);
        arr.enque(35);
        arr.enque(15);
        arr.enque(95);
        arr.enque(65);
        arr.enque(75);
        arr.enque(89);
        arr.dequeue();
        arr.dequeue();
        arr.display();
    }
    
}
