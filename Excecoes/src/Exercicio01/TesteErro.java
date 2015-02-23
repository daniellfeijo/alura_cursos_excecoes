package Exercicio01;
/*
 Repare o método main chamando metodo1 e esse, por sua vez, chamando o metodo2.
 Cada um desses métodos pode ter suas próprias variáveis locais, isto é: o 
 metodo1 não enxerga as variáveis declaradas dentro do main etc.
Como o Java (e muitas das outras linguagens) faz isso? Toda invocação de 
método é empilhada em uma estrutura de dados que isola a área de memória
 de cada um. Quando um método termina (retorna), ele volta para o método 
 que o invocou. Ele descobre isso através da pilha de execução (stack): 
 basta remover o marcador que está no topo da pilha:
 
 */

public class TesteErro {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do  main");
	}

	private static void metodo1() {
		System.out.println("Inicio do Metodo1");
		metodo2();
		System.out.println("Fim do Metodo2");
	}

	private static void metodo2() {
		System.out.println("Inicio do Metodo2");
		int[] array = new int[10];
		for(int i = 0 ; i<=15 ; i++){
			array[i]=i;
			System.out.println(i);
		}
		System.out.println("Fim do Metodo2");
	}
}
