/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
public class Node1 {
    int data;
    Node1 next;
    Node1(int val){
        this.data=val;
        this.next=null;
    }
    public static void main(String [] args){
        Node1 a=new Node1(34);
        Node1 b=new Node1(4);
        Node1 c=new Node1(64);
        Node1 d=new Node1(54);
        Node1 e=new Node1(24);
        Node1 head=a;
        head.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(recursion(head));
//        display(reverser(head));
//        Node1 f=new Node1(566);
//        insertval(head,f);
//        System.out.println();
//        display(head);
//        e.next=null;
    }
    static Node1 recursion(Node1 head){
        if(head==null || head.next==null){
            return head;
        }
        Node1 newnode=recursion(head.next);
        Node1 headnode=head.next;
        headnode.next=head;
        head.next=null;
        return newnode;
    }
    static Node1 reverser(Node1 head){
        Node1 temp=head;
        head=head.next;
        Node1 temp1=head;
        head=head.next;
        temp.next=null;
        temp1.next=temp;
        temp=temp1;
        temp1=head;
        head=head.next;
        while(temp1!=null){
            temp1.next=temp;
            temp=temp1;
            temp1=head;
            if(head!=null) head=head.next;
        }
        return temp;
        
    }
    static void insertval(Node1 temp1,Node1 n){
        while(temp1!=null){
            if(temp1.data==64){
                Node1 temp=temp1.next;
                temp1.next=n;
                n.next=temp;
                break;
            }
            temp1=temp1.next;
        }
    }
    static void display(Node1 head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
    }
    
}
