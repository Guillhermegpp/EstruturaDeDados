package aula;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * acesso imediato e reduzir a quantidade de armazenamento Problema : CO
		 * int nro;
		 * 
		 * for (int i = 0; i < 50; i++) { nro = (int) (Math.random() * 100);
		 * hash.inserir(nro); } hash.imprimir(); No no = hash.buscar(20);
		 * System.out.println(no);
		 */
		//1
		//String n = scan.next();
		HashEncadeado hash = new HashEncadeado(11);
		// Criando nomes aleatorios
		Nomes m = new Nomes();
		String nome;
		for (int i = 0; i < 30; i++) {
			nome = m.criarNome();
			hash.inserir(nome, nome.hashCode());
		}

		boolean ciclo = true;
		while (ciclo) {
			System.out.println("1- Adicionar\n2- Listar\n3- Procurar\n4- Excluir");
			String op = scan.next();
			switch (op) {
			case "1":
				System.out.println("Nome: ");
				nome = scan.next();
				hash.inserir(nome, nome.hashCode() < 0 ? ( nome.hashCode() * -1): nome.hashCode() );
				break;
			case "2":
				System.out.println("\nImprimir Nomes: ");
				hash.imprimirNomes();
				break;
			case "3":
				System.out.println("Procurar nome: ");
				String proc = scan.next();
				System.out.println(hash.buscarB(proc.hashCode() < 0 ? ( proc.hashCode() * -1): proc.hashCode()) ? proc + " Encontrado" : "Nao encontrado");
				break;
			case "4":
				System.out.println("Excluir nome: ");
				nome = scan.next();
				hash.remover(nome.hashCode() < 0 ? ( nome.hashCode() * -1): nome.hashCode());
				break;
			default:
				break;
			}

		}
	}

}
