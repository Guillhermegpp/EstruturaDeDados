package fatecPilha;

public class Pilha {
	private int[] vetor;
	private int t;

	public Pilha(int n) {
		vetor = new int[n];
		
		t = 0; /* 1a posição livre do vetor */
	}

	/* informa se a pilha está vazia */
	public boolean isVazia() {
		return t == 0;
	}/* informa se a pilha está cheia */

	public boolean isCheia() {
		return t == vetor.length;
	}

	/* coloca o elemento no topo da pilha */
	public void push(int nro) {
		if (isCheia()) {
			System.out.println("Pilha cheia - stack overflow");
		} else {
			/* coloca o nro na 1a posição livre do vetor */
			vetor[t] = nro;
			t++; /* atualiza a 1a posição livre */
		}
	}

	/* retira o elemento do topo da pilha */
	public int pop() {
		if (isVazia()) {
			System.out.println("Pilha vazia");
			return -1;
		} else {
			/* atualiza a 1a posição livre */
			return vetor[--t];
		}
	}

	/* remove todos os elementos da pilha */
	public void limpar() {
		t = 0; /* atualiza a 1a posição livre */
	}

	public void imprimir() {
		if (isVazia()) {
			System.out.print("Pilha vazia");
		} else {
			for (int i = 0; i < t; i++) {
				System.out.print(vetor[i] + " ");
			}
		}
		System.out.println();
	}
}