/* Neste caso, a classe carro n�o ter� o m�todo main; ser�o viar�veis (atributos) para armazenar
 * todas as informa��es correspondetes a um carro
 * Ou seja, estamos criando um novo tipo de dados.
 */

public class Carro {
	// aqui basta criar as vari�veis
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;

	void exibirAnuncio (){
			System.out.println ("-----Anuncio IsisCarros-----");
			System.out.println (" carro : "+marca+ " "+modelo+ "/" +ano);
			System.out.println (" Cor : "+cor);
			System.out.println (" Preco : R$" +preco);
		
	double CalcularNovoPrecoComDesconto (double desconto);
	}
	
	}
