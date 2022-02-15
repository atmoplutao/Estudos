package br.com.dio.quadrilateros.minha.resolucao;

public class main {

    public static void main(String[] args) {
//quadrado
        System.out.println("Área do Quadrado: ");
        SobrecargaMeu.area(2,2);

        //Triângulo

        System.out.println("Àrea do Triângulo: ");
        SobrecargaMeu.area(2,3, 2);

        //Trapézio

        System.out.println("Área do Trapézio: ");
        SobrecargaMeu.area(4,3,10,2);
    }
}
