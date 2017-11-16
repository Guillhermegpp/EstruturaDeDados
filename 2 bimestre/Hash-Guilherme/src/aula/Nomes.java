package aula;

public class Nomes {
	
	public String criarNome(){
		String r = "";
		for (int i = 0; i < Math.random() * 3 ; i++) {
			char letra = (char) (Math.random() * 26 + 97);
			r += letra;
		}
		
		return r;
	}
}
