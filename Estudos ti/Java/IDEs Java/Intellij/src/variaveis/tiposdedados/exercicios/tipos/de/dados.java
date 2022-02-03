package variaveis.tiposdedados.exercicios.tipos.de;


public class dados {

    public static void main(String[] args) {
//exemplos numeral

        byte b = 15;
        byte b2 = 20;

        short s1 = 2000;
        short s2 = 4000;

        int i1 = 1000000000;
        int i2 = 28500;

        long l1 = -1000000000000000000L; // Colocar o L no final para o sistema entener que é um número longo.
        long l2 = 2004044040000004040L;

        //float f1 = 3.14; Não tem o f no final o sistema entende como double
        float f2 = 3.14f;

        double d1 = 3.14;
        double d2 = 3.14;

        //Exemplos textual:

        char c1 = 'W';
        //char c2 = 'Tw'; char utiliza somente 1 caracter.
        char c3 = '\u0057';

        String ss1 = "Tuksd";
        String ss2 = "Topa tudo?";

        //Exemplos lógico

        boolean bo1 = false;
        boolean bo2 = true;

        System.out.println(b);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(ss1);
        System.out.println(ss2);
        System.out.println(bo1);
        System.out.println(bo2);

    }
    }
