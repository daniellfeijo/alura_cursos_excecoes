package Exercicio12;

public class TestaDeposita {
	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		try{
			cp.deposita(-100);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
