package br.com.dio.metodos.java.operadores.matematicos;



public class operadoresMatemáticos {

    public static void main(String[]args){

        int a = 6;
        int b = 2;

        int somar = somar(a,b);
        int somar2 = somar2(a,b);
        int subtrair = subtrair(a,b);
        int subtrair2 = subtrair2(a,b);
        int multiplicar = multiplicar(a,b);
        int multiplicar2 = multiplicar2(a,b);
        double dividir = dividir(a,b);
        double dividir2 = dividir2(a,b);

            System.out.println("Primeira Soma: " + somar + "\n" + "Segunda soma: " + somar2);
            System.out.println("Primeira Subtração: " + subtrair + "\n" + "Segunda Subtração: " + subtrair2);
            System.out.println("Primeira Multiplicação: " + multiplicar + "\n" + "Segunda Multiplicação: " + multiplicar2);
            System.out.println("Primeira Divisão: " + dividir + "\n" + "Segunda Divisão: " + dividir2);
        }

        public static int somar(int a, int b) {return a + b;}
        public static int somar2(int a, int b) {return a + b + b;}
        public static int subtrair(int a, int b) {return a - b;}
        public static int subtrair2(int a, int b) {return a - b - b;}
        public static int multiplicar(int a, int b) {return a * b;}
        public static int multiplicar2(int a, int b) {return a * b * b;}
        public static double dividir(int a, int b) {return a / b;}
        public static double dividir2(int a, int b) {return a / b / b;}
    }
