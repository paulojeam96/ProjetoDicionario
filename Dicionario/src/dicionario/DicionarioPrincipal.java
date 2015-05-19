/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicionario;

import com.br.ed.projeto.Definicao;
import com.br.ed.projeto.Dicionario;
import com.br.ed.projeto.HashTableEntry;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author 31448471
 */
public class DicionarioPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Cria um dicionario Novo
        Dicionario dc = new Dicionario(25);
        int controle ;

        do {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Dicionario Inglês-Portugûes, Menu Principal");
            System.out.println("1 - Incluir Definição");
            System.out.println("2 - Excluir Definição");
            System.out.println("3 - Consultar Definição");
            System.out.println("4 - Consultar Definições que iniciam com...");
            System.out.println("5 - Ver quantidade de definições cadastradas");
            System.out.println("6 - Deletar Todas as definições");
            System.out.println("7 - Sair");

            controle = sc.nextInt();

            String definicao = "";
            String traducao = "";
            switch (controle) {
                case 1:
                    dc.addPalavra(incluirDefinicao());
                    break;
                case 2:
                    System.out.println("Definição que deseja excluir: ");
                    definicao = sc.nextLine();
                    System.out.println("Tradução da definição: ");
                    traducao = sc.nextLine();

                    dc.remove(excluirDefinicao(definicao, traducao));
                    break;
                case 3:
                    System.out.println("Buscar tradução da palavra: ");
                    definicao = sc.nextLine();
                    System.out.println(dc.consultaDefinicao(consultaDefinicao(definicao)));
                    break;
                case 4:
                    System.out.println("Buscar palavra que começa com: ");
                    definicao = sc.nextLine();
                    System.out.println(dc.consultaDefinicaoCom(definicao));
                    break;
                case 5:
                    System.out.println(dc.qtdDefinicoes());
                    break;
                case 6:
                    dc.deletaTudo();
                    break;
                case 7: 
                    break;    
            }
        } while (controle != 7);

    }

    public static Definicao incluirDefinicao() {
        Definicao df = new Definicao();
        Scanner sc = new Scanner(System.in);
        String palavra = "";
        System.out.println("Palavra em inglês que deseja incluir: ");
        palavra = sc.nextLine();
        df.setPalavra(palavra);

        System.out.println("Tradução da palavra: ");
        String traducao = "";
        traducao = sc.nextLine();
        df.setTraducao(traducao);

        return df;
    }

    public static Definicao excluirDefinicao(String definicao, String traducao) {
        Definicao df = new Definicao();
        df.setPalavra(definicao);
        df.setTraducao(traducao);

        return df;
    }

    public static Definicao consultaDefinicao(String definicao) {
        Definicao df = new Definicao();
        df.setPalavra(definicao);
        return df;
    }

}
