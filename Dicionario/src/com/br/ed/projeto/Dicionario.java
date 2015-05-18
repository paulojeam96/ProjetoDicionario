/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ed.projeto;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author 31448471
 */
public class Dicionario {

    private ArrayList<LinkedList<HashTableEntry>> conjunto;
    private int tamanho;

    public Dicionario(int c) {
        conjunto = new ArrayList<LinkedList<HashTableEntry>>(c);
        for (int i = 0; i < c; i++) {
            conjunto.add(new LinkedList<HashTableEntry>());
        }
        tamanho = 0;
    }

    public int size() {
        return tamanho;
    }

    public LinkedList<HashTableEntry> get(int key) {
        //mostra determinada entrada da TH
        LinkedList<HashTableEntry> lista = conjunto.get(key);
        return lista;
    }

    public void addPalavra(Definicao palavra) {
        int indice = palavra.funcaoHash(palavra);
        LinkedList<HashTableEntry> lista = conjunto.get(indice);

        lista.add(new HashTableEntry(palavra));
    }

    public void remove(Definicao valor) {
        int indice = valor.funcaoHash(valor);
        LinkedList<HashTableEntry> lista = conjunto.get(indice);
        int flag = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).value() == valor) {
                HashTableEntry aux = lista.get(i);
                lista.remove(aux);
                flag = 1;
                tamanho--;
                System.out.println("Valor removido com sucesso!!");
            }
        }
        if (flag == 0) {
            System.out.println("Essa valor NÃO está cadastrado!!");
        }

    }

    public Definicao consultaDefinicao(Definicao palavra) {
        int posicao = palavra.funcaoHash(palavra);
        LinkedList<HashTableEntry> lista = conjunto.get(posicao);

        return lista.get(posicao).value();
    }

    public ArrayList<Definicao> consultaDefinicaoCom(String palavra) {
        ArrayList<Definicao> definicoes = new ArrayList<>();
        Definicao p = new Definicao();
        p.setPalavra(palavra);
        
        int indice = p.funcaoHash(p);
        LinkedList<HashTableEntry> lista = conjunto.get(indice);
        
        for (int i = 0; i < lista.size(); i++) {
            String def = lista.get(i).value().getPalavra();
            if(def.startsWith(palavra)){
                Definicao definicao = lista.get(i).value();
                definicoes.add(definicao);
            }
        
        }
        return definicoes;
    }
    
    public int qtdDefinicoes(){
        
        return 0;
    }
}
