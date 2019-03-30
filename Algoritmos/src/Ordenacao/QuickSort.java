package Ordenacao;

public class QuickSort {

	public void quick(int[] vetor, int esquerdo, int direito) {

		if (esquerdo < direito) {

			int m = separa(vetor, esquerdo, direito);

			quick(vetor, esquerdo, m - 1);
			quick(vetor, m + 1, direito);
		}
	}

	public int separa(int[] vetor, int esquerdo, int direito) {
		int pivot = vetor[esquerdo];

		int i = esquerdo;

		for (int j = esquerdo + 1; j <= direito; j++) {
			if (vetor[j] <= pivot) {
				i++;
				swap(vetor, i, j);
			}
		}
		swap(vetor, esquerdo, i);
		return i;
	}

	public void swap(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}

}
