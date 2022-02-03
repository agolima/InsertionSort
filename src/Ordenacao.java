public class Ordenacao {

	public int[] insertionSort(int vetor[]) {
		int n = vetor.length;

		for (int i = 1; i < n; i++) {
			int chave = vetor[i];
			int y = (i - 1);
			while ((y > -1) && (vetor[y] > chave)) {
				vetor[y + 1] = vetor[y];
				y--;
			}
			vetor[y + 1] = chave;
		}
		return vetor;
	}
}
