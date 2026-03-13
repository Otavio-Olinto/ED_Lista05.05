package controller;

import otavio.ordenar.quicksort.QuickSort;

public class Ordem {

	public Ordem() {
		super();
	}
	
	public int[] ordenacao(int[] vetor) {
		
		// Função feita para chamar os métodos da classe QuickSort na Biblioteca QuickSort em MyLibs
		
		// Instanciando os métodos da Classe QuickSort (importado da Biblioteca QuickSort)
		QuickSort metodo = new QuickSort();
		
		int tamanho = vetor.length;
		
		metodo.ordenar(vetor, 0, tamanho-1);
		
		return vetor;
	}
	
	public void preparar(String palavra) {
		
		// Função desenvolvida para transformar a string númerica em um vetor de Strings
		// E chamar o método Ordenação(int[] vetor).
		
		String[] vetorString = palavra.trim().split("\\s+");  // trim() remove espaços do começo e fim
		int tamanho = vetorString.length;					  // split("\\s+") faz ignorar espaços duplos+
		int[] vetor = new int[tamanho];
		
		for(int cont=0; cont<tamanho; cont++) vetor[cont] = Integer.parseInt(vetorString[cont]);
		
		for(int i: vetor) System.out.print(i+" ");
		ordenacao(vetor);
		System.out.println("");
		for(int i: vetor) System.out.print(i+" ");
		System.out.println("\n");
	}
}
