/*************************************************
 * Algoritmo para somar dois numeros em Java     *
 *						 *
 * Questao 01 --- Trabalho Interdisciplinar II   *
 *						 *
 * Aluna: Izabel Oliveira da Paz Chaves		 *
 * Periodo: 2 --- Semestre: 2025.1		 *
 *						 *
 * **********************************************/

import java.util.*;

public class ti2{

	// metodo para somar numeros
	public static int somarNumeros(int n){
	
		// declara acumulador e variavel para o laco de repeticao
		int soma = 0;
		int num;

		// somatorio que faz leitura e atribue ao acumulador
		for(int i = 0; i < n; i++){
		
			System.out.println("Digite o " + i + " termo");
			num = teclado.nextInt();
			soma += num;

		}

		return soma;
	}

	public static void main(String[] args){
	
		Scanner teclado = new Scanner(System.in);

		// assina a funcao com a chave da atividade
		System.out.println(somarNumeros(2));

		teclado.close();
	}
}
