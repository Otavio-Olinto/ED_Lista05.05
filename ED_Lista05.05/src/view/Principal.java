package view;

import controller.Ordem;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da classe Ordem
		Ordem metodo = new Ordem();
		
		// Vetor1
		String palavra = "74 20 74 87 81 16 25 99 44  58";
		metodo.preparar(palavra);
		
		// Vetor2
		palavra = "44 43 42 41 40 39 38";
		metodo.preparar(palavra);
		
		// Vetor3
		palavra = "31 32 33 34 99 98 97 96";
		metodo.preparar(palavra);		
	}

}
