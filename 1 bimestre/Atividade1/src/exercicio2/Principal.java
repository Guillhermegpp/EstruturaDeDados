package exercicio2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String menu;
		Ponto[] lista = new Ponto[10];
		do {
			menu = JOptionPane.showInputDialog(
					"1 - Criar array\n"
							+ "2 - Listar\n"
							+ "3 - Listar elementos que possuem distância maior que 4\n"
							+ "4 - Imprimir o somatório das distancias");
			if (menu != null) {

				switch (menu) {
				case "1" : {
					for (int i = 0;i<10;i++) {
						lista[i] = new Ponto();
					}
					break;}
				case "2" : { 
					for (int i = 0;i<10;i++) {
						lista[i].imprimir();
					}
					System.out.println();
					break;
				}
				case "3" : { 
					for (int i = 0;i<10;i++) {
						double dis = lista[i].distancia();
						if (dis > 4)
							System.out.printf("%.3f \n" , dis);
					}
					System.out.println();
					break;
				}
				case "4" : { 
					double soma = 0;
					for (int i = 0;i<10;i++)
						soma += lista[i].distancia();
					JOptionPane.showMessageDialog(null,"Soma: "+ soma);
					break;}
				}
			}
		}while (menu != null);

	}
}

