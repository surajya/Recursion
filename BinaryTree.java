/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
package trees;
import java.util.*;
public class BinaryTree {
    static Scanner sc=null;
    public static void main(String [] args){
        sc=new Scanner(System.in);
        Node root=CreateTree();
//        inOrder(root);
//        System.out.println();
//        preOrder(root);
//        System.out.println();
//        postOrder(root);
//        int h=height(root);
//        System.out.println("size fo the tree is:"+sizeo(root));
//        for(int i=1; i<=h; i++){
//            nodetotal(root,i);
//        }
//       printlevel(root);
       leftView(root);
        
    }
    static Node CreateTree(){
        Node root=null;
        System.out.println("enter the data:");
        int data=sc.nextInt();
        if(data==-1)
            return null;
        root=new Node(data);
        System.out.println("enter left "+data);
        root.left=CreateTree();
        System.out.println("enter right node:"+data);
        root.right=CreateTree();
        return root;
    }
    static void inOrder(Node root){
        if(root==null) return ;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null) return ;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    static int height(Node root){
        if(root==null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    static int sizeo(Node root){
        if(root==null)
            return 0;
        return (height(root.left)+height(root.right))+1;
    }
    static void nodetotal(Node root, int level){
        if(root==null){
            return;
        }
        else if(level==1){
            System.out.print(root.data+" ");
        }
        else if(level>1){
            nodetotal(root.left,level-1);
            nodetotal(root.right,level-1);
        }
        
    }
    static void printlevel(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cuu=q.poll();
            System.out.print(cuu.data+" ");
            if(cuu.left!=null){
                q.add(cuu.left);
            }
            if(cuu.right!=null){
                q.add(cuu.right);
            }
            System.out.println();
        }
    }
    
    static void view1(Node root, ArrayList list1, int level){
       
        if(root==null) return ;
        if(list1.size()<=level) list1.add(level,root.data);
        list1.set(level,root.data);
        view(root.left,list1,level+1);
        view(root.right,list1,level+1);
        
    }
    
    static void view(Node root, ArrayList list, int level){
       
        if(root==null) return ;
        if(list.size()<=level) list.add(level,root.data);
//        else list.set(level,root.data);
        if(list.get(level)==null) list.set(level, root.data);
        view(root.left,list,level+1);
        view(root.right,list,level+1);
        
    }
    
    static void leftView(Node root){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        view(root,list,0);
        view(root,list1,0);
        System.out.println("leftView is:");
        for(int cuu:list){
            System.out.print(cuu+" ");
        }
        System.out.println("\n"+"rightView is:");
        for(int cuu:list1){
            System.out.print(cuu+" ");
        }
    }
    
}

class Node{
    Node left,right;
    int data;
    public Node(int n){
        this.data=n;
    }
}
