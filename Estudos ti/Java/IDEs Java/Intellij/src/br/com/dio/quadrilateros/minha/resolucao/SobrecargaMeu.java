package br.com.dio.quadrilateros.minha.resolucao;

public class SobrecargaMeu {

    public static void area(int a, int b) {

         System.out.println("A área do quadrado é: " + a * b);
    }

    public static void area(double i, double j, double h){

        double resultado = i * j / h;
        System.out.println("A área do triângulo é: " + resultado);
    }

    public static void area(double D, double d, double H, double g) {

        double resultado = ((D + d) * H) / g;
        System.out.println("A área do trapézio é: " + resultado);

    }


}
