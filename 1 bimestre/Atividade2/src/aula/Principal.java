package aula;

import javax.swing.JOptionPane;

public class Principal {
	static Sequencia sequencia;

	public static void main(String[] args) {
		String menu;
		do{
			menu = JOptionPane. showInputDialog(
					"1 - Criar sequência\n"+
							"2 - Adicionar valor\n"+
							"3 - Imprimir"
					);
			if( menu != null ){
				switch( menu ){
				case "1" : criar(); break;
				case "2" : add(); break;
				case "3" : imprimir(); break;
				}
			}
		}while( menu != null );
	}
	public static void criar(){
		if (sequencia == null) {
			String entrada = JOptionPane. showInputDialog("Entre com a quantidade");
			int quant = Integer.parseInt(entrada);
			sequencia = new Sequencia(quant);
		}
		else {
			String entrada = JOptionPane. showInputDialog("Lista ja Criada, entre com a quantidade a mais");
			int quant = Integer.parseInt(entrada);
			sequencia.resize(quant);
		}
	}
	public static void add(){
		if(sequencia == null)
			JOptionPane. showMessageDialog(null, "Primeiro é necessário criar a sequência usando a opção 1");
		else {
			sequencia.add();
		}

	}
	public static void imprimir(){
		if(sequencia == null)
			JOptionPane. showMessageDialog(null, "Primeiro é necessário criar a sequência usando a opção 1");
		else
			sequencia.imprimir();


	}
}