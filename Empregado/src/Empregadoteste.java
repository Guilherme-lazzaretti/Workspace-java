
public class Empregadoteste {
	public static void main(String[] args) {
		empregado e1;

		e1 = new empregado();

		e1.nome = "Professor Isidro";
		e1.cargo = "Professor";
		e1.salario = 10000.00;

		e1.ImprimirinformacoesEmtela();

		e1.aumentarSalario(10.0);

		e1.ImprimirinformacoesEmtela();
	}
}