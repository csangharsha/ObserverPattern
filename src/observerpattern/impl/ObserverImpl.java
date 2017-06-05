/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.impl;

import observerpattern.interfaces.Observer;

/**
 *
 * @author Sangharsha
 */
public class ObserverImpl implements Observer{
    
    private String name ="";

    public ObserverImpl(String name) {
        this.name = name;
    }
    
    @Override
    public void update(int a, int b, int c) {
        System.out.println("-----------" + name + " Change----------------");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }   
}