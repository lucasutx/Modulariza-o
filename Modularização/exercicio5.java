import java.util.Scanner;
/*
 * Autor: Lucas Xavier Bitencourt
 * Objetivo: Mostrar os números em ordem crescente
 * 
 */

public class exercicio5 {

	//Procedimento
	public static void conceito(double nota) {
		
		//Condicionais
		if (nota<=39) {
			System.out.println("Conceito F");
		}else if(nota>= 40 && nota<=50) {
			System.out.println("Conceito E");

		}else if(nota>= 60 && nota<=69) {
			System.out.println("Conceito D");

		}else if(nota>= 70 && nota<=79) {
			System.out.println("Conceito C");

		}else if(nota>= 80 && nota<=89) {
			System.out.println("Conceito B");

		}else if(nota>= 90) {
			System.out.println("Conceito A");

		}
	}
	
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		
		//Declaração das variáveis
		double notaFinal;
		int vezes;
		
		//Númeoro para repetição
		 System.out.println("Digite quantos alunos serão analisados");
		 vezes=teclado.nextInt();
		 
		 //Repetição
		 for(int conta =1; conta<=vezes;conta++) {
		 System.out.println("Digite sua média da nota Final");
		 notaFinal=teclado.nextDouble();
		 
		 //Chamada do procedimento
		 conceito(notaFinal);
		 }
		 
		
		teclado.close();
		
		
	}

}
