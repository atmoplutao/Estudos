package br.com.dio.metodos.java.operadores.matematicos.taxas;

import java.util.Scanner;

public class taxasJuros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a;
        int b;
        double c;

        System.out.println("Digite o valor do empréstimo: ");
        a = scan.nextInt();

        System.out.println("Digite a quantidade de parcelas: ");
        b = scan.nextInt();

        if ( b > 18){
            System.out.println("Número de parcelas inválidas ");
        }

        if ((18>= b) && (b >12)){
            System.out.println((a * 160) / 100);
        }
        if ( 12<= b & b >6){
            System.out.println((a*140)/100);
        }
        if (6<= b & b >0){
            System.out.println((a*120)/100);
        }
        else {
            System.out.println("Número de parcelas não permitido");
        }

    }
}
