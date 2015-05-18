/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ed.projeto;

import java.util.LinkedList;

/**
 *
 * @author 31448471
 */
public class HashTableEntry {

    private Definicao palavra; //Valor relativo à entrada
    private LinkedList<Definicao> definicoes;
    
    public HashTableEntry(Definicao palavra) {
        this.palavra = palavra;
        definicoes.add(palavra);
    }

    public Definicao value() {
        return palavra;
    }
    
    public LinkedList<Definicao> getDefinicoes(){
        LinkedList<Definicao> lista = new LinkedList<>();
        
        for (int i = 0; i < definicoes.size(); i++) {
            lista.add(definicoes.get(i));
        }
        return lista;
    }
    
    
}
