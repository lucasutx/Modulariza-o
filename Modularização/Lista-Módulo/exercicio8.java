import java.util.Scanner;
/*
 * Lucas Xavier 
 * objetivo:Número de termos em fibinacci, que acabe antes do termo
 */

public class exercicio8 {
	
	
	
	public static double valor(double num)
	{
		int soma=0;
		
		for (int n=2;n<=num;n+=3){
		    soma += (n*n+1.0)/(n +3.0);
		}
		return soma;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num;
		
		System.out.println("Digite um valor inteiro e positivo");
		num=teclado.nextDouble();
		
		System.out.println("O valor de S é:"+valor(num));
		
		
		teclado.close();
	}

}

