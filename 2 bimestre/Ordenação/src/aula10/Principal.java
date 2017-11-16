package aula10;

public class Principal {
	public static void main(String[] args) {
		/*
		 * int[] v = { 33, 32, 30, 34, 28, 21, 23, 26, 27, 22, 29, 20, 28, 25 };
		 * 
		 * insercao(v); for (int i : v) { System.out.printf(i + " "); }
		 */

		/*
		 * int[] v1 = { 33, 32, 30, 34, 28, 21, 23, 26, 27, 22, 29, 20, 28, 25
		 * }; selecao(v1); for (int i : v1) { System.out.printf(i + " "); }
		 */
		/*
		 * int[] v2 = { 33, 32, 30, 34, 28, 21, 23, 26, 27, 22, 29, 20, 28, 25
		 * }; bolha(v2);
		 * 
		 */
		int[] v = new int[10000],v1,v2;

		for (int i = 0; i < 10000; i++) {
			v[i] = (int) (Math.random() * 1000);
		}
		v1 = v.clone();
		v2 = v.clone();
		bolha(v);
		selecao(v1);
		insercao(v2);
		//System.out.printf(java.util.Arrays.toString(v) + "\n");

	}

	public static void insercao(int[] v) {
		int cont = 0;
		int aux, j;
		/* o loop se repete i-1 vezes */
		for (int i = 1; i < v.length; i++) {
			aux = v[i];
			/* pode chegar a percorrer todo o subarray v[0..i-1] */
			for (j = i - 1; j >= 0 && v[j] > aux; j--) {
				v[j + 1] = v[j];
				cont++;
			}
			v[j + 1] = aux;
		}
		System.out.println("Inserção: " + cont +"\n");
	}

	public static void selecao(int[] v) {
		int menor, aux, j,cont =0;
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
			cont++;
		}
		System.out.println("Selecao: " + cont +"\n");
	}

	public static void bolha(int[] v) {
		int cont = 0;
		boolean trocado = true;
		/* percorre todo o array n-vezes ou até não haver trocas */
		for (int aux, i, fim = v.length - 1; fim > 0 && trocado; fim--) {
			trocado = false;
			/*
			 * a cada iteração o maior valor vai parar na última posição do
			 * subarray [0..fim]
			 */
			for (i = 0; i < fim; i++) {
				if (v[i] > v[i + 1]) {
					aux = v[i]; /* troca os pares de valores */
					v[i] = v[i + 1];
					v[i + 1] = aux;
					trocado = true;
					cont++;
				}
			}

			//System.out.printf(java.util.Arrays.toString(v) + "\n");
		}

		System.out.println("iterações: " + cont + "\n");
	}
}

