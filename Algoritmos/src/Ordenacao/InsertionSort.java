package Ordenacao;
/**
 * 
 * @author Almir Crispiniano
 *
 */
public class InsertionSort {
	
	/**
	 * 
	 * @param array
	 */

	public void Insertion(int[] array) {
		int escolhido, j;

		for (int i = 1; i < array.length; i++) {
			escolhido = array[i];
			j = i - 1;

			while (j >= 0 && array[j] > escolhido) {
				array[j + 1] = array[j];
				j = j - 1;

			}
			array[j + 1] = escolhido;
		}
	}

}
