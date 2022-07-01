package entradaSaida;

import java.util.Scanner;

public class entradaESaidaDeDados {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //é uma reutilização de codigo dentro da classe - biblioteca
		//faz abertura do sistema para receber os dados
		
	
		int a, b, soma;
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextInt(); //trabalhar com dados precisos. Scanner é usado pra testes
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma de A + B: " + soma);
		
		entrada.close();
		
		
		
		
		
				
				
				
				
		
		
		
		
		

	}

}
