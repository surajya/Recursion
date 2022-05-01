/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
public class CircularQueue {
    private int capacity;
    private int arr[];
    private int rear;
    private int front;
    public CircularQueue(int data){
        capacity=data;
        arr=new int[data];
        rear=-1;
        front=-1;
    }
    public void enque(int data){
        if(front==-1 && rear==-1){
            arr[++rear]=data;
            front=0;
        }
        else if(front==0 && rear<capacity-1){
            arr[++rear]=data;
        }
        else if(front>rear+1){
            rear=(rear+1)%capacity;
            arr[rear]=data;
        }
        else{
            System.out.println("queue is full");
        }
    }
    public void dequeue(){
        if(front==-1 && rear==-1){
            System.out.println("queue is empty");
        }
        else if(front>=0 && front<capacity){
            System.out.println("dequeue element is: "+arr[front++]);
        }
        else if(front>rear){
            front=(front+1)%capacity;
            System.out.println("dequeue element is: "+arr[front]);
        }
        else{
            System.out.println("queue is full");
        }
    }
    public void display(){
        if(rear!=-1){
            int i=front;
            do{
            System.out.println(arr[i]);
            i=(i+1)%capacity;
        }while(i!=rear);
        }
    }
    public static void main(String [] args){
        CircularQueue arr=new CircularQueue(6);
        arr.enque(45);
        arr.enque(35);
        arr.enque(15);
        arr.enque(95);
        arr.enque(65);
        arr.enque(75);
        arr.dequeue();
        arr.enque(89);
        arr.dequeue();
 //       arr.dequeue();
        arr.display();
    }
    
}
