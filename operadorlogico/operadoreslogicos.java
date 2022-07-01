package operadorlogico;

public class operadoreslogicos {

	public static void main(String[] args) {
		
		int x = 10; //operador de atribuição
		
		x = x + 25;
		
		int z = 12;
		
		z = z + 1;
		
		
		z += 25; //otimização de codigo ----- y = y + 25;
		
		z %= 3; //operador de atribuição com resto da divisão - y = y % 3;
		
		//Incremento: variavel++ (variavel + 1) ou ++variavel (1 + variavel)
		
		//Decremento: variavel-- ou --variavel
		
		int y = z + x;
		
		System.out.println("Resultado: " + y);
		
		//Operadores relacionais: utilizados diariamente pelo programador 
		
		int idade = 10;
		boolean maiorIdade = idade > 18; //operador maior que (menor que: <)
		
		System.out.println(maiorIdade);
		
		// relacional: >= (maior ou igual) ou <= (menor ou igual)
		// diferente: != // boolean idade != 18; (FALSE)
		//comparação == // boolean idade == 18;(compara valores)
		
		//OPERADORES LÓGICOS:comparação mais complexa
		// and: &&
		// or:||
		// Xor: ^ - exclusividade na lógica do verdadeiro ou falso
		// not: !
		
		//int idad = 20;
		//boolean precisaVotar = idad >= 18 && idad < 70;
		//System.out.println(precisaVotar);
		
		int q = 9, d = 11; 
		boolean teste = q > 10 ^ d > 10; //
		System.out.println(teste); 
		
		//Tanto o equals do java e o "===" do js é para comparação a nível de objeto. Ou seja comparar se o mesmo objeto são iguais e alocado no mesmo espaço. 
		//O " == " compara valor da referência.
		
		// O XOR ou OU exclusivo é um operador lógico usado para manipulação de bits e retorna true apenas se ambos os valores booleanos forem diferentes.
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
