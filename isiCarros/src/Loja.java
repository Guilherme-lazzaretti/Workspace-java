
public class Loja {
	public static void main (String[] args){
		Carro c1; // declarei uma variável c1 do tipo Carro
		Carro c2;
		
		// antes de preencher oa dados preciso criar áre ade memória
		c1 = new Carro();
		c2 = new Carro();
		
		c1.marca = "xevrole";
		c1.modelo = "corça";
		c1.ano = 1997;
		c1.cor = "branco";
		c1.preco = 6999.00;
		
		c2.marca = "porxe";
		c2.modelo = "caine";
		c2.ano = 2007;
		c2.cor = "preto";
		c2.preco = 890000.00;
		
		System.out.println("------Anuncio do IsiCarros-----");
		System.out.println( "Carro: "+ c1.marca+" "+c1.modelo+ "/" + c1.ano);
		
	}
}
