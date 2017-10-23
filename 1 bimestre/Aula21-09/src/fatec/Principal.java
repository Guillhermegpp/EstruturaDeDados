package fatec;

public class Principal {
	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.imprimir(); // Fila vazia
		fila.inserir(2);
		fila.imprimir(); // 2
		fila.inserir(4);
		fila.imprimir(); // 2 4
		fila.inserir(6);
		fila.imprimir(); // 2 4 6
		fila.inserir(8);
		fila.imprimir(); // 2 4 6 8
		fila.inserir(9);
		fila.imprimir(); // 2 4 6 8 9
		fila.inserir(11); // Fila cheia
		fila.imprimir(); // 2 4 6 8 9
		fila.remover(); // remove o 2
		fila.remover(); // remove o 4
		fila.remover(); // remove o 6
		fila.imprimir(); // 8 9
		fila.inserir(3);
		fila.imprimir(); // 8 9 3
		fila.inserir(5);
		fila.imprimir(); // 8 9 3 5
	}
}
