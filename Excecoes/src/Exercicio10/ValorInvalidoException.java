package Exercicio10;

public class ValorInvalidoException extends RuntimeException{
	
	private double valorInvalido;

	public ValorInvalidoException(double valorInvalido){
		super("Você depositou um valor inválido: "+ valorInvalido);
		this.valorInvalido = valorInvalido;
	}

}
