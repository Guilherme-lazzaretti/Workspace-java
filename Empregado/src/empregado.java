
public class empregado {

	String nome;
	String cargo;
	double salario;

	void ImprimirinformacoesEmtela(){
		System.out.println("Funcion�rio: "+nome+ "("+cargo+") R$ "+salario);
	}

	void aumentarSalario(double percentual){
		salario = salario + salario * percentual / 100;
}
}
