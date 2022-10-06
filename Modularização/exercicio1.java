import java.util.Scanner;

/*
 * Autor: Lucas Xavier Bitencourt
 * Objetivo: Fazer uma procedimento que recebe 3 notas e cálcular médias 
 * aritmeticas e ponderadas
 * 
 */

public class exercicio1 {
	
	
	
	
	//Procedimento
	public static void medias(double nota1,double nota2,double nota3,char opc)
	{
		Scanner teclado =new Scanner(System.in);
		
			
		//Repetição
		while(opc != 'S' ||opc != 's')
			
			
		{
		//Condicionais
		if(opc =='A' || opc== 'a'){
	
			System.out.println("Sua média aritmetica é:"+(nota1+nota2+nota3)/3);
	
		}else if(opc =='P'|| opc == 'p')	{
			
		
			System.out.println("Sua média ponderada é:"+(nota1*5+nota2*3+nota3*2)/10);
		}
		
		//recebimento de valores 
		System.out.println("Digite A - para média aritmética e P - para ponderada ou S - para sair");
		opc=teclado.next().charAt(0);
		
		//Recebimento de notas
		System.out.println("Digite as 3 notas para o respectivo aluno");
		nota1=teclado.nextDouble();
		nota2=teclado.nextDouble();
		nota3=teclado.nextDouble();
		
		
		}
			
		}
		
		
	
	
	
		//Classe main
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		//Declaração das variavéis
	
		
		
		double nota1,nota2,nota3;
		char opc,sair;
		
				
				
		
				//Recebimento de notas
				System.out.println("Digite as 3 notas para o respectivo aluno");
				nota1=teclado.nextDouble();
				nota2=teclado.nextDouble();
				nota3=teclado.nextDouble();
				
				System.out.println("Digite A - para média aritmética e P - para ponderada ou S- para sair");
				opc=teclado.next().charAt(0);
		
				//Chamada do procedimento
				
				medias (nota1,nota2, nota3, opc);
		
		
		
		teclado.close();

	}

}
