package Ordenacao;

public class MergeSort<T extends Comparable<T>>{

	public  void merge(T[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			merge(vetor, inicio, meio);
			merge(vetor, meio + 1, fim);
			intercala(vetor, inicio, meio, fim);
		}
	}

	public void intercala(T[] vetor, int inicio, int meio, int fim) {
		
		T[] auxiliar =(T[]) new Comparable[vetor.length];
		
		for (int k = inicio; k <= fim; k++)
			auxiliar[k] = vetor[k];

		int i = inicio;
		int j = meio + 1;

		for (int k = inicio; k <= fim; k++)
			if (i > meio)
				vetor[k] = auxiliar[j++];
			else if (j > fim)
				vetor[k] = auxiliar[i++];
			else if (auxiliar[i].compareTo(auxiliar[j]) < 0)
				vetor[k] = auxiliar[i++];
			else
				vetor[k] = auxiliar[j++];
	}
}
