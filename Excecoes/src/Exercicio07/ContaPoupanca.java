package Exercicio07;

public class ContaPoupanca extends Conta {
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException();
		} else {
			this.saldo += valor - 0.10;
		}
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}

}