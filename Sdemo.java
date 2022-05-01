/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
public class Sdemo {
    static void dog(){
        System.out.println("bullDog is very dengerous in looking");
    }
}
class rat extends Sdemo{
    public void eat(){
        System.out.println("it eat mainly non-vegeterian");
    }
}
class property{
    public static void main(String [] args){
        rat pr=new rat();
        pr.eat();
        pr.dog();
//    rat.eat();
    rat.dog();
    }
    
}
