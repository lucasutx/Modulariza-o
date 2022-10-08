import java.util.Scanner;

public class exercicio6 {

	
	
	public static double progressao(double num) {
		
		//Declaração
		double s=0,fixo,subtotal,soma=0,fat;
		fat=num;
		
		
		//Conta da equação
		for(int cont=1;cont<num;cont++) {
			
			fixo=1;
			fat= fat*(num-cont);
			subtotal=fixo+(fixo/fat);
			soma=soma+subtotal;
			
		}
		
		return soma;
		
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Decalração de num
		double num;
		
		//Leitura de num
		System.out.println("Digite um número inteiro e positivo");
		num=teclado.nextDouble();
		
		//Coondição de exitência de acordo com o enunciado
		if(num>0) {
			//Saída junto com a chamada da função
			System.out.println("S tem o valor de:"+progressao(num));
		}else {
			System.out.println("Digite um número inteiro e positivo");
			
		}
		
		
		
		
		
		
		
		teclado.close();
	}

}
