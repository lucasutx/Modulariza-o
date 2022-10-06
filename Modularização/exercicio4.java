import java.util.Scanner;

/*
 * Autor: Lucas Xavier Bitencourt
 * Objetivo: Mostrar os números em ordem crescente
 * 
 */
public class exercicio4 {
	
	public static void triangulo(int x, int y, int z) {
		
		if(x==y && x==z) {
			System.out.println("Trinângulo Equilátero");
		}else if(x==y || x==z) {
			System.out.println("Trinângulo Isóceles");
		}else {
			System.out.println("Trinângulo Escaleno");
		}
		
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		//Declaração das variáveis
		int lado1,lado2,lado3,somaL1,somaL2,somaL3;
		char opc=1;
		
		//Dados do Trinângulo
		System.out.println("Digite o valor dos lados do triângulo");
		lado1=teclado.nextInt();
		lado2=teclado.nextInt();
		lado3=teclado.nextInt();
		somaL1= lado2+lado3;
		somaL2= lado1+lado3;
		somaL3= lado2+lado1;
		
		//Repetição
		do {
		//Condição de existência
		if(lado1< somaL1 && lado2<somaL2 && lado3<somaL3 ) 
		{
			//Chamada do procedimento
			triangulo(lado1,lado2,lado3);
			
			
		}else {
			System.out.println("Não é possivel formar um triângulo com esses valores");
		}
		
		
		System.out.println("Digite o valor dos lados do triângulo");
		lado1=teclado.nextInt();
		lado2=teclado.nextInt();
		lado3=teclado.nextInt();
		somaL1= lado2+lado3;
		somaL2= lado1+lado3;
		somaL3= lado2+lado1;
		
		System.out.println("Para sair tecle S");
		opc=teclado.next().charAt(0);
		
		
		}while(opc != 's' || opc !='S' );
		
		teclado.close();
	}

}
