/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

/**
 *
 * @author bianchi.emmanuele
 */
public class Studente {
    private String nome;
    private String cognome;
    private int numerodiregistro;

    public Studente(String nome, String cognome, int numerodiregistro) {
        this.nome = nome;
        this.cognome = cognome;
        this.numerodiregistro = numerodiregistro;
    }
}
