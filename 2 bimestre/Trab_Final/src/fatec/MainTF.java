package fatec;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainTF {
	public static void main(String[] args) {
		String dado;
		do {
		StringBuilder sb = new StringBuilder();
		dado = JOptionPane.showInputDialog("Informe o diretório e o nome de arquivo texto:");
		
		String txt = "";
		try {
			//Lendo arquivo
			Scanner scanner = new Scanner(new File(dado + ".txt"));
			//Consumindo os dados do arquivo e adicionando na variavel txt
			while (scanner.hasNext()) {
				txt += scanner.nextLine();
			}

			scanner.close();
			//Dividindo o texto, cada posicao do array fica com uma palavra
			String[] palavra = txt.split(" ");
			
			String str = JOptionPane.showInputDialog("Digite a palavra que deseja encontrar: ");
			int contador = 0;
			for (int i = 0; i < palavra.length; i++) {
				//Conta a quantidade de ocorrências
				if (palavra[i].equalsIgnoreCase(str)) {
					contador++;
					//Mostrar parte das frases que o palavra foi encontrado
					for (int j = i; j < palavra.length; j++) {
						sb.append(palavra[j] + " ");
						if (j == i + 3)
							break;
					}
					sb.append("\n");
				}
			}
			if (contador > 0)
				sb.append("\n" + contador + " palavras encotradas");
			else
				sb.append("Nenhuma palavra encontrada");
			JOptionPane.showMessageDialog(null, sb,"Estrutura de Dados",1);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Nenhum arquivo encontrado","Estrutura de Dados",1);
		}
		}while(dado != null);
	}
}
