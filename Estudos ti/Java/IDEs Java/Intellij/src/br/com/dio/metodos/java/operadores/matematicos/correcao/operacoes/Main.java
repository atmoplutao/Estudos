package br.com.dio.metodos.java.operadores.matematicos.correcao.operacoes;

/**
 * Classe principal dos exercícios da Aula 1 de Métodos
 */
public class Main {

    public static void main(String[] args) {
        //basicas
        System.out.println("Exercício básicas");
        basicas.soma(3,6);
        basicas.subtracao(9,1.8);
        basicas.multiplicacao(7,8);
        basicas.divisao(5, 2.5);

        //Mensagem
        System.out.println("Exercício mensagens");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("Exercício empréstimo ");
        Emprestimo.calcular( 1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular( 1000,  5);

    }
}
