import java.util.Scanner;
/*
 * Autor: Lucas Xavier Bitencourt
 * Objetivo: Mostrar os números em ordem crescente
 * 
 */

public class exercicio3 {
	
	//Procedimento
	public static void crescente(int a , int b,int c) {
		
		//Condicionais
		if(a>b && a >c) {
			if(b>c) {
				System.out.println("A crescente é: "+ c+".." + b+".." + a );
			}else {
				System.out.println("A crescente é: "+ b+".." + c+".." + a );
			}
		}else if(b>a && b>c) {
			if(a>c) {
				System.out.println("A crescente é: "+ c+".." + a+".." + b );
			}else {
				System.out.println("A crescente é: "+ a+".." + c+".." + b );
			}}
			else if(c>b && c>a) {
				if(b>a) {
					System.out.println("A crescente é: "+ a+".." + b+".." + c );
				}else {
					System.out.println("A crescente é: "+ b+".." + a+".." + c );
				}}
		
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		//Declaração das variáveis
		int num1,num2,num3,vezes;
		
		System.out.println("Digite o número de conjutos de 3 números que você quer colocar em ordem crescente");
		vezes=teclado.nextInt();
		
		//Número de conjuntos
		for(int conta=1;conta<=vezes;conta++)
		{
		//Coleta de dados
		System.out.println("Digite 3 número");
		num1=teclado.nextInt();
		num2=teclado.nextInt();
		num3=teclado.nextInt();
		 
		//Chamada do procedimento
		crescente(num1,num2,num3);
		}
		
		teclado.close();
	}

}
