public class Principal {

	public static void main(String[] args) {
		int[] valoresExemplo = { 21, 546, 34, 23, 36, 446, 58, 9, 10, 11 };

		Ordenacao ord = new Ordenacao();
		int[] arrayOrdenado = ord.insertionSort(valoresExemplo);

		for (int i = 0; i < arrayOrdenado.length; i++) {
			System.out.println(arrayOrdenado[i]);
		}
	}
}