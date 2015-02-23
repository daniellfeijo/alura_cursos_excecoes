package Exercicio09;

abstract class Conta {
	protected double saldo;
	private String nome;
	private int agencia;

	abstract void deposita(double valor);

	abstract void saca(double valor);

	abstract void atualiza(double taxa);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void imprime() {
		// syso + crtl + barra
		System.out.println(nome);
		System.out.println(agencia);
		System.out.println(saldo);

	}
}
