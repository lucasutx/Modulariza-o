import java.util.Scanner;
/*
 * Autor: Lucas Xavier Bitencourt
 * Objetivo: Fazer uma procedimento que recebe 3 notas e cálcular médias 
 * aritmeticas e ponderadas
 * 
 */

public class exercicio7 {
	
	//Verifica Positivo
	public static boolean verificaPos() 
	{
		
		return true;
	}
	//Verifica Negativo
	public static boolean verificaNeg() 
	{
		
		return false;
	}
	
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		//Declaração das variáveis
		int num,vezes;
		
		//Número de repetições
		System.out.println("Digite quantas vezes irá rodar o progroma");
		vezes=teclado.nextInt();
		
		//Loop
		for(int conta=1;conta<=vezes;conta++) {
		System.out.println("Digite um valor");
		num=teclado.nextInt();
		
		//condições
			if(num>=0) 
			{
				//chamada função
			System.out.println(verificaPos());
			}
			else 
			{	
				//chamada função
				System.out.println(verificaNeg());
			}
			
			
		}
		teclado.close();
	}
		
		}
		
		
	


