/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ed.projeto;

/**
 *
 * @author 31448471
 */
public class Definicao {

    private String palavra;
    private String traducao;

    public Definicao() {
        this.palavra = null;
        this.traducao = null;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getTraducao() {
        return traducao;
    }

    public void setTraducao(String traducao) {
        this.traducao = traducao;
    }

    public int funcaoHash(Definicao p) {
        String palavra = p.getPalavra();
        
        palavra = palavra.toLowerCase();
        
        int pos = palavra.charAt(0);
        return pos - 97;
    }

    
}
