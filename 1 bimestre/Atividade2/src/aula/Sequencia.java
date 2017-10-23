package aula;

import javax.swing.JOptionPane;

public class Sequencia {
	int []lista,aux;
	static int posicao;

	public Sequencia(int quant) {
		if (quant < 5)
			quant =5;
		lista = new int[quant];
		posicao=0;
	}
	public boolean add(int nro) {

		if(posicao < lista.length) {
			//System.out.println("I = "+ posicao + " N = " + nro );
			lista[posicao] = nro;
			posicao++;
			return true;
		}
		else
			return false;
	}

	public void add() {
		if(posicao < lista.length) {
			String entrada = JOptionPane. showInputDialog("Entre com o numero");
			int nro = Integer.parseInt(entrada);
			lista[posicao] = nro;
			posicao++;
		}
		else {
			JOptionPane. showMessageDialog(null,"Lista Cheia");
		}
	}

	public void resize(int quant) {
		if (quant < 5)
			quant =5;
		aux = new int[quant];
		if (quant > lista.length){
			for (int i = 0; i < posicao; i++) {
				aux[i] = lista[i];
			}
		}
		else{
			for (int i = 0; i < quant; i++) {
				aux[i] = lista[i];
			}
		}
		lista = aux.clone();
	}

	public void imprimir() {
		for (int i = 0; i < lista.length; i++) {
			System.out.printf("[%d] = %d\n",i,lista[i]);
		}
	}
}
