package Busca;
/**
 * 
 * @author Almir Crispiniano
 *
 */

public class BuscaBinariaRecursiva {
	
	/**
	 * 
	 * @param array
	 * @param elemento
	 * @return
	 */
	public boolean buscaBinaria(int[] array, int elemento) {
		return busca(elemento, array, 0, array.length-1);
	}
	/**
	 * 
	 * @param elemento
	 * @param vetor
	 * @param inicio
	 * @param fim
	 * @return
	 */
	public boolean busca(int elemento, int[] vetor, int inicio, int fim) {
		int media = (inicio + fim) / 2;
		
		boolean resultado;

		if (inicio > fim) {
			resultado = false;
		}
		if (vetor[media] == elemento) {
			resultado = true;
		}
		if (vetor[media] < elemento) {
			resultado = busca(elemento, vetor, media + 1, fim);
		} else {
			resultado = busca(elemento, vetor, inicio, media - 1);
		}
		return resultado;
	}

}
