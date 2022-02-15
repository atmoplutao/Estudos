package br.com.dio.metodos.java.operadores.matematicos.correcao.operacoes;
//As classes estão dentro do mesmo package, pois podem chamar uma a outra.
public class basicas {

    public static void soma( double numero1, double numero2){
        // "static" possibilita "chamar" o método.
        double resultado = numero1 + numero2; // criou uma nova variavel "resultado" que é a soma de numero1+numero2.

        System.out.println("A soma de " + numero1 + "mais " + numero2 + "é: " + resultado);
    }

    public static void subtracao( double numero1, double numero2){
        // "static" possibilita "chamar" o método.
        double resultado = numero1 - numero2;

        System.out.println("A subtração de " + numero1 + "menos " + numero2 + "é: " + resultado);
    }
    public static void multiplicacao( double numero1, double numero2){
        // "static" possibilita "chamar" o método.
        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + "vezes " + numero2 + "é: " + resultado);
    }
    public static void divisao( double numero1, double numero2){
        // "static" possibilita "chamar" o método.
        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + "dividido " + numero2 + "é: " + resultado);
    }


}
