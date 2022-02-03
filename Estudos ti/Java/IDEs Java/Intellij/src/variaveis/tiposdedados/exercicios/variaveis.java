package variaveis.tiposdedados.exercicios;
//Exercício DIO sobre variáveis.
public class variaveis {

    public static void main (String[] args) {

        int i;
        //int i;
        int I;
        //int 1a; erro
        int _1a; // não é uma boa prática iniciar com _ ou $
        int $aq; // mesma coisa da de cima.

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; //variável "final" é uma constante.
        //j =15;
        int asrn24678md;
        //int asrn246 78md; tem espaço, não é válido
        int asrn2$4678_md = 10; //Não é boa prática utilizar _ ou $;
        //int asrn2$46%78_md = 10;
        //int asrn2$46%78_md = 10;  % Caracter impossivel.

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadedeProduto = 50;
        //int QuantidadedeProduto; Não segue boa prática
        final int NUMERO_TENTATIVAS = 5; //Final sempre utilizar maiúsculas;
        //final int numeroTentativas = 5; Não está seguindo boa prática de maiúsculas para variável final;
        int QUANTIDADE_OPCOES = 25; //Não usou boas práticas, utilizou de maiúscula para uma não "final".

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadedeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);





    }
}
