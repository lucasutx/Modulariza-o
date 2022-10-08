import java.util.Scanner;
/*
 * Lucas Xavier 
 * objetivo: Retornar de acordo com a idade a categoria
 */

public class exercicio10 {
	
	
	public static char categoria(int id) {
		
		//Condições
		if(id>=5 && id<=7) {
			return 'F';
		}else if(id>=8 && id<=10) {
			return 'E';
		}else if(id>=11 && id<=13) {
			return 'D';
		}else if(id>=14 && id<=15) {
			return 'C';
		}else if(id>=16 && id<=17) {
			return 'B';
		}else {
			return 'A';		}
		
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Variável
		int idade;
	
		//Leitura dos daods
		System.out.println("Digite sua idade");
		idade=teclado.nextInt();
		
		//Saída e chamada da função
		System.out.println("Sua categoria é: "+ categoria(idade));
		
		teclado.close();
	}

}
