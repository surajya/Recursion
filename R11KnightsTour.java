/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
public class R11KnightsTour {
    public static void main(String [] args){
        int[][] arr=new int[5][5];
        ktour(arr,2,2,1);
    }
    static void ktour(int[][] arr, int i,int j, int move){
        
        if(i<0 || j<0 ||i>=arr.length ||j>=arr[0].length || arr[i][j]!=0) return;
        else if(move==25){
            arr[i][j]=move;
            display(arr);
            arr[i][j]=0;
        }
        arr[i][j]=move;
        ktour(arr,i-2,j+1,move+1);
        ktour(arr,i-1,j+2,move+1);
        ktour(arr,i+1,j+2,move+1);
        ktour(arr,i+2,j+1,move+1);
        ktour(arr,i+2,j-1,move+1);
        ktour(arr,i+1,j-2,move+1);
        ktour(arr,i-1,j-2,move+1);
        ktour(arr,i-2,j-1,move+1);
        arr[i][j]=0;        
    }
    static void display(int[][] arr){
        for(int[] i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
