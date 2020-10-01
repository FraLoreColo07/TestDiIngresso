/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.di.ingresso;

import java.util.ArrayList;

/**
 *
 * @author colombo_francesco
 */
public class SharedData {
    
    private ArrayList<String> Lista = new ArrayList<String>();
    private MySemaphore thClasse;
    
    public SharedData(){
    
        thClasse = new MySemaphore(1);
    }
    
    public void addOrario(String classi){
    
        Lista.add(classi);
    }
    
    public void thClasseWait(){
    
        thClasse.Wait();
    }
    
    public void thClasseSignal(){
    
        thClasse.Signal();
    }
    
    public String ArrayData(int num){
    
        return Lista.get(num);
    }
    
    public int longArray(){
    
        return Lista.size();
    }
}
