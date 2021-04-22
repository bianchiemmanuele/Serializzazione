/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bianchi.emmanuele
 */
public class StudentiCasuali implements Runnable {
    private Studente s;
    
    @Override
    public void run() {
        while(true){
            s = new Studente( getNome(), getCognome(), getNRegistro()); 
            System.out.println(s.toString());
            
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(StudentiCasuali.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
    
    public int getNRegistro(){
         int i;
        i = (int) (Math.random()*30);
        return i;
    }
    public String getNome(){
        String[]elenconomi = {"giovanni", "matteo", "Francesco","Filippo","Andrea"};
        String nome;
        nome = elenconomi[(int) (Math.random()*5)];
        return nome;
    }
    public String getCognome(){
        String cognome;
        String[]elencognomi = {"Albi", "Bendi", "Cordinali","Digonato","Errante"};       
        cognome = elencognomi[(int) (Math.random()*5)];
        return cognome;
    }
}
