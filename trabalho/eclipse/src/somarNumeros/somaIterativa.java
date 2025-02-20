/*************************************************
 * Algoritmo para somar dois numeros em Java     *
 *												 *
 * Questao 01 --- Trabalho Interdisciplinar II   *
 *												 *
 * Aluna: Izabel Oliveira da Paz Chaves			 *
 * Periodo: 2 --- Semestre: 2025.1				 *
 *												 *
 * **********************************************/

package somarNumeros;

import java.util.Scanner;

public class somaIterativa {

	// metodo para somar numeros
		public static double somarNumeros(int n, Scanner teclado){
		
			// declara acumulador e variavel para o laco de repeticao
			double soma = 0;
			double num;

			// somatorio que faz leitura e atribue ao acumulador
			for(int i = 0; i < n; i++){
			
				System.out.print("Digite o termo " + (i+1) + ": ");
				num = teclado.nextDouble();
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
