/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.Serializable;

/**
 *
 * @author bianchi.emmanuele
 */
public class Studente implements Serializable{
    private String nome;
    private String cognome;
    private int numerodiregistro;

    public Studente(String nome, String cognome, int numerodiregistro) {
        this.nome = nome;
        this.cognome = cognome;
        this.numerodiregistro = numerodiregistro;
    }

    @Override
    public String toString() {
        return "Studente: "+ numerodiregistro+", nome: "+ nome + ", cognome: " + cognome ;
    }
    
}
