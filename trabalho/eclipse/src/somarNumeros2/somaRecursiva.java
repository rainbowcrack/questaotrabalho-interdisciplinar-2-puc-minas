/*************************************************
 * Algoritmo para somar dois numeros em Java     *
 *						 *
 * Questao 01 --- Trabalho Interdisciplinar II   *
 *						 *
 * Aluna: Izabel Oliveira da Paz Chaves		 *
 * Periodo: 2 --- Semestre: 2025.1		 *
 *						 *
 * **********************************************/
package somarNumeros2;

import java.util.Scanner;

public class somaRecursiva{

	// metodo para somar numeros
	public static double somarNumeros(int n, Scanner teclado){

  // caso base de parada somando 0 na funcao recorrente, sem mudanca
	  if(n == 0){
      return 0;
    }
		
			System.out.print("Digite o termo " + n + ": ");
			double num = teclado.nextDouble();

// nova assinatura com decremento de n
		return num + somarNumeros(n-1, teclado);
	}

	public static void main(String[] args){
	
		Scanner teclado = new Scanner(System.in);

		// assina a funcao com a chave da atividade, parametriza o objeto da classe
		System.out.println("\nResultado: " + somarNumeros(2, teclado));

		teclado.close();
	}
}