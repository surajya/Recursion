/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

import java.util.HashMap;

/**
 *
 * @author SURAJ
 */
public class R42DPath1 {

    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //       HashMap<Integer,String> hs=new HashMap<>();
//        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        NoPath(arr, 0, 0, "");
    }

    static void NoPath(int[][] arr, int i, int j, String ss) {
        int m = arr.length, n = arr[0].length;
        if (arr[i][j] == arr[m - 1][n - 1]) {
            System.out.print(ss+" ");
            return;
        }
        if (j < n - 1) {
            NoPath(arr, i, j + 1, ss + "h");
        }
        if (i < m - 1) {
            NoPath(arr, i + 1, j, ss + "v");
        }
    }

}
