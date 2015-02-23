package Exercicio12;

public class ValorInvalidoException extends Exception{
	
	private double valorInvalido;

	public ValorInvalidoException(double valorInvalido){
		super("Você depositou um valor inválido: "+ valorInvalido);
		this.valorInvalido = valorInvalido;
	}

}
