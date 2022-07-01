package br.com.empiricus;

public class variavelExemplo2 {

	public static void main(String[] args) {
		
		int var1, var2; //da pra criar vars do mesmo tipo na mesma linha
		
		double var3;
		
		var1 = 10;
		var3 = 10.0;
		
		System.out.println("Valor da 1ª variável: " + var1);
		System.out.println("Valor da 2ª variável: " + var3);
		
		var1 = var1 / 4;
		var3 = var3 / 4;
		
		System.out.println(var1);
		System.out.println(var3); // vars com mesmo valor mas com resultados diferentes, por causa dos tipos diferentes
		
		
		
		
	}

}
