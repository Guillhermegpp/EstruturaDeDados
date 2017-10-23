package fatecPilha;

public class Principal {
	public static void main(String[] args) {
		/*
		 * String txt = "Ohayo Gozaimasu"; Pilha pilha = new
		 * Pilha(txt.length()); char c; for (int i = 0; i < txt.length(); i++) {
		 * c=txt.charAt(i); pilha.push(c); } while (!pilha.isVazia()){
		 * System.out.print((char)pilha.pop()); }
		 */
		Pilha p = new Pilha(20);
		int n = 89, r;
		while (n >= 1) {
			r = n % 2;
			System.out.print(r);
			n /= 2;
			p.push(r);
		}
		System.out.println();
		int soma = 0,e=1;
		while (!p.isVazia()) {
			r = p.pop();
			System.out.print(r);
			soma += r*e;
			e *= 2;
		}
		System.out.println("Soma:"+soma);

	}
}
