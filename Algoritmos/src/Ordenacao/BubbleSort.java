package Ordenacao;

/**
 * 
 * @author Almir Crispiniano
 *
 */
public class BubbleSort {
	/**
	 * Metodo bolha é resposavel por comparar dois numeros e ordena-los em ordem
	 * crescente, jogando sempre o maior para o final da lista
	 * 
	 * @param array
	 */
	public void bubble(int[] array) {
		for (int i = array.length - 1; i > 0; i--) { // Lendo a lista ao contrario
			for (int j = 0; j < i; j++) { // Lendo do inicio até o ultimo elemento
				if (array[j] > array[j + 1]) { // Se meu primeiro elemento for maior que o proximo faço a troca
					swap(array, j, j + 1);
				}
			}
		}
	}

	/**
	 * A funcao swap é responsavel por trocar 2 itens em um array
	 * 
	 * @param vetor
	 * @param i
	 * @param j
	 */
	public void swap(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}

}
