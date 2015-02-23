package Exercicio07;

public class ContaCorrente extends Conta{
	@Override
	public void atualiza(double taxa){
		this.saldo += this.saldo*taxa*2;
	}
	@Override
	public void saca(double valor){
		this.saldo -= valor;
	}
	@Override
	public void deposita(double valor){
		this.saldo += valor;
	}

}