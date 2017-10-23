package atividade;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String menu;
		int[] lista = new int[10];
		do {
			menu = JOptionPane.showInputDialog(
					  "1 - Criar array\n"
					+ "2 - Imprimir na ordem normal\n"
					+ "3 - Imprimir na ordem invertida\n"
					+ "4 - Imprimir os elementos em posições pares\n"
					+ "5 - Imprimir os elementos pares\n"
					+ "6 - Imprimir o somatório");
			if (menu != null) {
				
				switch (menu) {
				case "1" : {
					for (int i = 0;i<10;i++) {
						String entrada = JOptionPane.showInputDialog("Lista Criada\nDigite o valor da posicao "+(i+1)+": ");
						lista[i] = Integer.parseInt(entrada);
					}
					break;}
				case "2" : { 
					for (int i = 0;i<10;i++) {
						System.out.printf(lista[i]+" ");
						}
					System.out.println();
					break;
					}
				case "3" : { 
					for (int i = lista.length - 1;i>=0;i--) {
						System.out.printf(lista[i]+" ");
						}
					System.out.println();
					break;
					}
				case "4" : { 
					for (int i = 0;i<10;i+=2) {
						System.out.printf(lista[i]+" ");}
					System.out.println();
					break;}
				case "5" : { 
					for (int i = 0;i<10;i++) {
						if (lista[i]%2 == 0)
							System.out.printf(lista[i]+" ");}
					System.out.println();
					break;}
				case "6" : { 
					int soma = 0;
					for (int i = 0;i<10;i++)
						soma += lista[i];
					JOptionPane.showMessageDialog(null,"Soma = " +soma);
					break;}
				}
			}
		}while (menu != null);

	}

}
