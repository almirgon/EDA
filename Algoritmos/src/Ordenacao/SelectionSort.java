package Ordenacao;

/**
 * 
 * @author Almir Crispiniano
 *
 */
public class SelectionSort {

	/**
	 * Metodo de selecao que encontra o menor elemento e o troca pela primeira
	 * posição, e assim segue até ordenar a lista
	 * 
	 * @param vetor
	 */
	public void selecao(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			int menor = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[menor]) {
					menor = j;
				}

			}
			swap(vetor, i, menor);
		}
	}

	/**
	 * A funcao swap é responsavel por trocar 2 itens em um array
	 * 
	 * @param array
	 * @param i
	 * @param j
	 */
	public void swap(int[] array, int i, int j) {
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}

}
