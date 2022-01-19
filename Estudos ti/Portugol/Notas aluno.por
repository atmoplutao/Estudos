//Funçao do Algoritmo: Calvcular a média aritmética

programa
{
		
	funcao inicio()
	{
		real janeiro,fevereiro,marco,abril,media
		cadeia vendedor

		escreva("Digíte o nome do vendedor: ")
		leia (vendedor)
				
		escreva(" Digíte as vendas de janeiro: ")
		leia(janeiro)
		
		escreva(" Digite as vendas de fevereiro: ")
		leia(fevereiro)
		escreva("Digite as vendas de março: ")
		leia(marco)
		escreva("Digite as vendas de abril: ")
		leia(abril)

		media=(janeiro+fevereiro+marco+abril)/4

		escreva("A média das vendas do vendedor: " + vendedor + " foi de: " + media)
//Verifica se a média é maior ou igual a 95
		se(media>=95) {
			escreva("\n" + "Parabéns, você atingiu a meta!")
		}

		senao {
			escreva("\n" + "Infelizmente, você não atingiu a meta.")
		}


		
		
		
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 616; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */