/*************************************************
 * Algoritmo para somar dois numeros em Java     *
 *						 *
 * Questao 01 --- Trabalho Interdisciplinar II   *
 *						 *
 * Aluna: Izabel Oliveira da Paz Chaves		 *
 * Periodo: 2 --- Semestre: 2025.1		 *
 *						 *
 * **********************************************/

import java.util.Scanner;

public class somaIterativo{

	// metodo para somar numeros
	public static int somarNumeros(int n, Scanner teclado){
	
		// declara acumulador e variavel para o laco de repeticao
		int soma = 0;
		int num;

		// somatorio que faz leitura e atribue ao acumulador
		for(int i = 0; i < n; i++){
		
			System.out.print("Digite o termo " + i + ": ");
			num = teclado.nextInt();
			soma += num;

		}

		return soma;
	}

	public static void main(String[] args){
	
		Scanner teclado = new Scanner(System.in);

		// assina a funcao com a chave da atividade, parametriza o objeto da classe
		System.out.println("\nResultado: " + somarNumeros(2, teclado));

		teclado.close();
	}
}
