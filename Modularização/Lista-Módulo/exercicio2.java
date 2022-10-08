import java.util.Scanner;
/*
 * Autor: Lucas Xavier Bitencourt
 * Objetivo: Calcular a média do salário da população
 * 
 */
public class exercicio2 {
	
	public static void mediaSalario() {
		
		Scanner teclado= new Scanner(System.in);
		
		//Declaração das variáveis
		double salario,salT=0;
		int filhos,quantidade,filhosT=0;
		
		//Contagem para p fpr
		System.out.println("Digite quantas pessoas serão analisadas");
		quantidade=teclado.nextInt();
		
		//Repetição
		for(int conta =1;conta<=quantidade;conta++) {
			
			System.out.println("Digite o salário");
			salario=teclado.nextDouble();
			salT+=salario;
			
			System.out.println("Digite o número de filhos");
			filhos=teclado.nextInt();
			filhosT+=filhos;
			
		}
		//Cálculo
		System.out.println("A média do salário da população é "+salT/quantidade);
		
		
	}

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		//chamada do procedimento
		mediaSalario();
		
		teclado.close();

	}

}
