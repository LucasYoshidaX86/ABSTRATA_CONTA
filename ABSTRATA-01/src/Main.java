
public class Main {

	public static void main(String[] args) {

//Criando instância para contaCorrente, verificando todos os métodos, adicionando os valores e taxas requisitados.
		ContaBancaria c1 = new ContaCorrente(15200, 1000, 2.5, 1.5, 1);
		c1.deposito(550);
		c1.saque(2086);
		c1.saque(1000000);
		System.out.println("Saldo disponível: " + c1.consulta() + "\n");

//Criando instância para contaPoupanca, verificando todos os métodos e condições, adicionando os valores e taxas requisitados.
		ContaBancaria c2 = new ContaPoupanca(1500, 2.5, 1.5, 1);
		c2.deposito(200);
		c2.saque(500);
		c2.saque(5000);
		System.out.println("Saldo disponível: " + c2.consulta());
	}
}
