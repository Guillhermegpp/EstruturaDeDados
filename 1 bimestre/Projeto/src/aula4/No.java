package aula4;

public class No {
	int conteudo;
	No proximo, anterior;

	
	
	public No(int conteudo) {
		this.conteudo = conteudo;
	}



	public void imprimir() {
		System.out.println(anterior + "\t" + conteudo + "\t" + proximo);
	}
}
