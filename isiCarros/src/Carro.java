/* Neste caso, a classe carro não terá o método main; serão viaráveis (atributos) para armazenar
 * todas as informações correspondetes a um carro
 * Ou seja, estamos criando um novo tipo de dados.
 */

public class Carro {
	// aqui basta criar as variáveis
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
