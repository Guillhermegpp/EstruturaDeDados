package aula4;

public class Lista {
	No inicio;
	
	public void inserir(int nro){
		No no = new No(nro);
		if (inicio == null){
			inicio = no;
			inicio.proximo = inicio;
			inicio.anterior = inicio;
		}				
		else{
			
			No ultimo = inicio;
			while(ultimo.proximo != inicio)
				ultimo = ultimo.proximo;
			ultimo.proximo = no;
			no.anterior = ultimo;
			no.proximo = inicio;
			inicio.anterior = no;
		}
	}
	public void imprimir(){
		if (inicio == null)
			System.out.println("Lista vazia");
		else{
			No ultimo = inicio;
			do{
				ultimo.imprimir();
				ultimo = ultimo.proximo;
			}
			while(ultimo != inicio);
		}
	}
	public int contar(){
		int cont = 0;
		if (inicio != null){
			No ultimo = inicio;
			do{
				cont++;
				ultimo = ultimo.proximo;
			}
			while(ultimo != inicio);
		}
		return cont;
	}
}
