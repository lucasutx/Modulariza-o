import java.util.Scanner;
/*
* Lucas Xavier 
* objetivo:Cálculo de média com modularização
*/

public class exercicio9 {
	
	
	//Função
	public static double media(double soma,double vezes) 
	
	{
		double media;
		media=soma/vezes;
		return media;
		
		
		

	}

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		//Variáveis
		double nota,somaNota=0,vezes=0;
		
		
		
		//Leitura dos dados
		
		System.out.println("Digite nota para seus alunos e 0 para sair");
		nota=teclado.nextInt();
		
		
		//Condição 
		
		if(nota>=6) {
			somaNota+=nota;
			vezes++;
		}
		
		
		//Loop para receber notas
		while(nota>0) 
		{
			
		//Leitura de dados
			System.out.println("Digite nota para seus alunos e 0 para sair ");
			nota=teclado.nextDouble();
			
			
			if(nota>=6) {
				somaNota+=nota;
				vezes++;
			}
			
			
		}
			
		//Chamada da função
		System.out.println("A média da nota dos aprovados é: "+(media(somaNota,vezes)));
		
		

		
		teclado.close();

	}

}
