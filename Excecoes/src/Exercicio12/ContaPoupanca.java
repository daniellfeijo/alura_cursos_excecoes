package Exercicio12;

public class ContaPoupanca extends Conta {
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public void deposita(double valor) throws ValorInvalidoException{
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor - 0.10;
		}
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}

}