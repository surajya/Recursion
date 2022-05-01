/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author SURAJ
 */
import java.awt.*;
public class awtdemo extends Frame {
    awtdemo(){
        Frame f=new Frame();
        Label l=new Label("Employee id");
        TextField t=new TextField();
        
        Button b=new Button("Submit");
        b.setBounds(100,80,80,30);
        l.setBounds(30,100,80,30);
        t.setBounds(20,80,80,30);
        f.add(b);
        f.add(l);
        f.add(t);
        f.setSize(400,300);
        
        f.setTitle("this is the first demo awt ");
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String [] args){
        awtdemo a=new awtdemo();
    }
}
