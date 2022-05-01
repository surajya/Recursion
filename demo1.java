/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
public class demo1 {
  //recursive method
  static int Sum(int n) { 
    if(n == 1)
      return 1;
    else
      return (n*n + Sum(n-1));
  } 

  public static void main(String[] args) {
    System.out.println("Sum of Squares of first 10 natural numbers: " + Sum(3));
 //   System.out.println("Sum of Squares of first 20 natural numbers: " + Sum(20));
  }
}
