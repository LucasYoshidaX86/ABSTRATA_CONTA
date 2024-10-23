//Criação da classe concreta ContaCorrente, tendo os atributos e métodos.
public class ContaCorrente extends ContaBancaria{
	private double limite;
	
//Constructor para inicialização dos atributos criados e herdados.
	public ContaCorrente(double saldo, double taxaSaque, double taxaDeposito, double taxaConsulta, double limite) {
		super(saldo, taxaSaque, taxaDeposito, taxaConsulta);
		this.limite = limite;
	}

//Encapsulamento para acessar e alterar atributos privados.
	public double getLimite() {
		return 
				limite;
	}
	
	public void setLimite (double limite) {
		this.limite = limite;
	}

//Método para saque, utilizando "if e else" para verificação do saldo da conta, levando também em consideração o limite. 
	@Override 
	public void saque (double valor) {
		if (valor <= getSaldo() + limite) {
			double saldoAtualizado = getSaldo() - valor - getTaxaSaque();
			setSaldo(saldoAtualizado);
			System.out.println("Saque efetuado com sucesso." + "\n" + "Valor: " + valor);
		}
		else {
			System.out.println("Saque não permitido devido ao saldo e limite insuficiente.");
		}
	}
	
//Método para deposito, atualizando o saldo com o valor desejado e incluindo o atributo taxa nos cálculos.
	@Override
	public void deposito (double valor) {
		double saldoAtualizado = getSaldo() + valor - getTaxaDeposito();
		setSaldo(saldoAtualizado);
		System.out.println("Depósito efetuado com sucesso." + "\n" + "Valor: " + valor);
	}
	
//Método para consulta de saldo, já descontando o valor da taxa cobrada por verificação.
	@Override
	public double consulta() {
		return
				getSaldo() - getTaxaConsulta();
	}
}
