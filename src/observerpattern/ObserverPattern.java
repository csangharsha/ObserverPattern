/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import observerpattern.impl.ObserverImpl;
import observerpattern.impl.SubjectImpl;
import observerpattern.interfaces.Observer;
import observerpattern.interfaces.Subject;

/**
 *
 * @author Sangharsha
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SubjectImpl s = new SubjectImpl();
        Observer o1 = new ObserverImpl("o1");
        Observer o2 = new ObserverImpl("o2");
        Observer o3 = new ObserverImpl("o3");
        s.register(o1);
        s.register(o2);
        s.register(o3);
        s.setA(2);
        s.setB(3);
        s.setC(4);
    }
}
