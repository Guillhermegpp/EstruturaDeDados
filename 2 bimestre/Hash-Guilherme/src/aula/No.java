package aula;

public class No {
	public int chave, ocorrencia;
	public String nome;
	public No proximo;

	@Override
	public String toString() {
		return "(" + chave + ":" + ocorrencia + ")";
	}
}
