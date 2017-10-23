package exercicios;


public class Lista {
	No inicio;
	Lista(){
		/* a lista está vazia */
		inicio = null;
	}
	/* inserir no final da lista */
	void inserir(String nome){
		/* criar um nó */
		No no = new No();
		no. conteudo = nome;
		no. proximo = null; /* este será o último nó da lista */
		/* checa se a lista está vazia */
		if( inicio == null ){
			inicio = no;
		}
		else{
			/* percorrer a lista até encontrar o último nó */
			No ultimo = inicio;
			while( ultimo. proximo != null ){
				ultimo = ultimo. proximo;
			}
			/* alterar o próximo do último para o endereço do no */
			ultimo. proximo = no;
		}
	}
	void imprimir(){
		/* checa se a lista está vazia */
		if( inicio == null ){
			System. out.println("Lista vazia") ;
		}
		else{
			/* percorrer a lista até encontrar o último nó */
			No ultimo = inicio;
			while( ultimo != null ){
				System. out.print( ultimo. conteudo +" ");
				ultimo = ultimo. proximo;
			}
			System. out.println(); /* quebra de linha na tela */
		}
	}
	/* retorna a quantidade de elementos da lista */
	int size(){
		int cont = 0;
		/* percorrer a lista até encontrar o último nó */
		No ultimo = inicio;
		while( ultimo != null ){
			cont++;
			ultimo = ultimo. proximo;
		}
		return cont;
	}
	/* ordena os elementos da lista */
	void sort(){
		boolean trocou = false;
		if(inicio != null && inicio.proximo != null){
			No a,b,c;
			a = null;
			b = inicio;
			c = b.proximo;
			do{
				//System.out.println(b.conteudo);
				if (b.conteudo.toLowerCase().compareTo(c.conteudo.toLowerCase()) > c.conteudo.toLowerCase().compareTo(b.conteudo.toLowerCase())){
					trocou = true;
					if (a==null){
						inicio = c;
						b.proximo = c.proximo;
						c.proximo = b;
					}
					else{
						a.proximo = c;
						b.proximo = c.proximo;
						c.proximo = b;
					}
				}
				a = b;
				b = c;
				c  = c.proximo;
			}
			while(c != null);
			if (trocou){
				sort();
			}
		}
	}
}


