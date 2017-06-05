/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.impl;

import java.util.ArrayList;
import java.util.List;
import observerpattern.interfaces.Observer;
import observerpattern.interfaces.Subject;

/**
 *
 * @author Sangharsha
 */
public class SubjectImpl implements Subject {
    
    int a = 1; 
    int b = 1;
    int c = 1;
    List<Observer> observers;

    public SubjectImpl() {
        observers = new ArrayList<>();
    }
    
    @Override
    public void register(Observer o) {
        if(o!=null){
            observers.add(o);
        }
    }

    @Override
    public void unregister(Observer o) {
        if(o!=null){
            observers.remove(o);
        }
    }

    @Override
    public void notifyChange() {
        observers.forEach((o) -> {
            o.update(a, b, c);
        });
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        notifyChange();
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
        notifyChange();
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
        notifyChange();
    }
}