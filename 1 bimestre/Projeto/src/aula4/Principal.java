package aula4;

public class Principal {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		lista.inserir(18);
		lista.inserir(20);
		lista.inserir(9);
		lista.inserir(5);
		lista.imprimir();
		System.out.println("Quantidade: "+lista.contar());
	}						
}
