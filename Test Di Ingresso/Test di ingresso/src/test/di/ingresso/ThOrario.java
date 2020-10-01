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
public class ThOrario extends Thread{
    
    private String elenco;
    private SharedData ptrDati;
    
    public ThOrario(String elenco,SharedData dati){
        
        this.elenco = elenco;
        this.ptrDati = dati;
    }
    
    public void run(){
    
        int count = 0;
        String[] sep = elenco.split("\n");
        while(sep.length>count){
        
            
            
            String line = sep[count];
            ptrDati.addOrario(line);
            count++;
            
        }
        
        ptrDati.thClasseSignal();
    }
    
}
