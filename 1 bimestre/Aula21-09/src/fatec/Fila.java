package fatec;

public class Fila {
	private int[] vetor;
	private int total; /* número de elementos na fila */
	/* posição do próximo elemento a ser retirado da fila */
	private int inicio;

	public Fila() {
		vetor = new int[5];
		inicio = 0;
		total = 0;
	}/* informa se a fila está vazia */

	public boolean isVazia() {
		return total == 0;
	}

	/* informa se a fila está cheia */
	public boolean isCheia() {
		return total == vetor.length;
	}

	/* insere um elemento no final da fila */
	public void inserir(int nro) {
		if (isCheia()) {
			System.out.println("Fila cheia");
		} else {
			/* descobre onde será inserido o próximo elemento */
			int fim = (inicio + total) % vetor.length;
			vetor[fim] = nro;
			total++;
		}
	}

	/* retira o elemento do início da fila */
	public int remover() {
		if (isVazia()) {
			System.out.println("Fila vazia");
			return -1;
		} else {
			int nro = vetor[inicio];
			/* atualiza a posição de início */
			inicio = (inicio + 1) % vetor.length;
			total--;
			return nro;
		}
	}

	/* remove todos os elementos da fila */
	public void limpar() {
		inicio = 0;
		total = 0;
	}

	public void imprimir() {
		if (isVazia()) {
			System.out.println("Fila vazia");
		} else {
			for (int i = 0, pos = inicio; i < total; i++) {
				pos = pos % vetor.length;
				System.out.print(vetor[pos] + " ");
				pos++;
			}
			System.out.println();
		}
	}
}