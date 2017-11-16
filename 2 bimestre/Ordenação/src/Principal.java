
public class Principal {
	public static void main(String[] args) {

		String[] str = { "xb", "Be", "be", "ee", "ab", "ba", "cb" };

		bolha(str);

		// System.out.printf(java.util.Arrays.toString(v) + "\n");

	}

	public static void insercao(int[] v) {
		int aux, j;
		/* o loop se repete i-1 vezes */
		for (int i = 1; i < v.length; i++) {
			aux = v[i];
			/* pode chegar a percorrer todo o subarray v[0..i-1] */
			for (j = i - 1; j >= 0 && v[j] > aux; j--) {
				v[j + 1] = v[j];
			}
			v[j + 1] = aux;
		}
	}

	public static void selecao(int[] v) {
		int menor, aux, j;
		for (int i = 0; i < v.length - 1; i++) {
			menor = i;
			/* identifica a posição do menor valor no subarray [i..v.length] */
			for (j = i + 1; j < v.length; j++) {
				if (v[j] < v[menor]) {
					menor = j; /* índice do menor valor */
				}
			}
			/* troca o menor valor com a posição i */
			aux = v[i];
			v[i] = v[menor];
			v[menor] = aux;
		}
	}

	public static void bolha(String[] v) {
		boolean trocado = true;
		/* percorre todo o array n-vezes ou até não haver trocas */
		for (int i, fim = v.length - 1; fim > 0 && trocado; fim--) {
			String aux;
			trocado = false;
			/*
			 * a cada iteração o maior valor vai parar na última posição do
			 * subarray [0..fim]
			 */
			for (i = 0; i < fim; i++) {
				/*
				 * if (v[i] > v[i + 1]) { aux = v[i]; troca os pares de valores
				 * v[i] = v[i + 1]; v[i + 1] = aux; trocado = true; }
				 */
				if (v[i].compareToIgnoreCase(v[i + 1]) > 0) {
					aux = v[i]; // troca os pares de valores
					v[i] = v[i + 1];
					v[i + 1] = aux;
					trocado = true;
				}
			}

			System.out.printf(java.util.Arrays.toString(v) + "\n");
		}
	}
}
