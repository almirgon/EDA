package sorting.linearSorting;

import sorting.AbstractSorting;

/**
 * Classe que implementa a estratégia de Counting Sort vista em sala. Procure
 * evitar desperdicio de memoria alocando o array de contadores com o tamanho
 * sendo o máximo inteiro presente no array a ser ordenado.
 * 
 */
public class CountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] array, int leftIndex, int rightIndex) {
		int max = valorMaximo(array, leftIndex, rightIndex);

		Integer[] contador = new Integer[max + 1];
		Integer[] resultado = new Integer[array.length];

		for (int i = 0; i < contador.length; i++) { //Colocando o valor 0 em todos os indices do array contador
			contador[i] = 0;
		}

		for (int i = leftIndex; i <= rightIndex; i++) { //Contagem dos elementos
			contador[array[i]]++;
		}

		for (int i = 1; i < contador.length; i++) { //Somando os prefixos
			contador[i] += contador[i - 1];
		}

		for (int j = rightIndex; j >= leftIndex; j--) { //Ordenação
			resultado[contador[array[j]]-- - 1] = array[j];
		}
		int indice = 0;
		for (int i = leftIndex; i <= rightIndex; i++) {
			array[i] = resultado[indice];
			indice++;
		}
	}

	public int valorMaximo(Integer[] array, int leftIndex, int rightIndex) { //Retorna o maior valor do array
		int maior = 0;

		for (int i = leftIndex; i <= rightIndex; i++) {
			if (array[i] > maior) {
				maior = array[i];
			}
		}
		return maior;
	}
}
