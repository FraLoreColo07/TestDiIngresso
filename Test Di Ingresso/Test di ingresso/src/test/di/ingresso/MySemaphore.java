/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.di.ingresso;

/**
 *
 * @author colombo_francesco
 */
public class MySemaphore {
    
    private int valore;

    public MySemaphore(int initial) {
        valore = initial;
    }

    synchronized public void Wait() {
        while (valore == 0) {            
            try {
                wait();
            } 
            catch (InterruptedException e) {
            }
        }
        valore--;                          
    } 
    synchronized public void Signal() {
        valore++;                          
        notify();                          
    }
}
