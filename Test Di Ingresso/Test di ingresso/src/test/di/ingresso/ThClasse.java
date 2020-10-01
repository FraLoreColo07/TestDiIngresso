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
public class ThClasse extends Thread {

    private SharedData ptrDati;
    private String nomeClasse;

    public ThClasse(SharedData dati, String nome) {

        this.ptrDati = dati;
        this.nomeClasse = nome;

    }

    public void run() {

        ptrDati.thClasseWait();
        System.out.println(ptrDati.ArrayData(0));
        int lenght = ptrDati.longArray();
        int count = 1;
        
        while (lenght>count) {

            
            String orario = ptrDati.ArrayData(count);
            if(orario.indexOf(nomeClasse)!= -1){
                
                int pos = orario.indexOf(",");
                String prof = orario.substring(0, pos);
                System.out.print(prof+"    ");
            }
            count++;
        }
    }
}
