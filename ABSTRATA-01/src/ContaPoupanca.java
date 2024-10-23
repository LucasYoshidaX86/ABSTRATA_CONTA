//Criando classe concreta para utilização de contaPoupanca, herdando atributos.
public class ContaPoupanca extends ContaBancaria {
	
//Constructor para inicialização dos atributos.
	public ContaPoupanca(double saldo, double taxaSaque, double taxaDeposito, double taxaConsulta) {
		super(saldo, taxaSaque, taxaDeposito, taxaConsulta);
	}
	
//Método desenvolvido para saque, utilizando comando "if e else" para verificar as condições de saldo da conta para realização dos serviços pedidos.
	@Override
	public void saque(double valor) {
		if (valor <= getSaldo()) {
			double saldoAtualizado = getSaldo() - valor - getTaxaSaque();
			setSaldo(saldoAtualizado);
			System.out.println("Saque efetuado com sucesso." + "\n " + "Valor: " + valor);
		}
		else if(valor > getSaldo()){
			System.out.println("Saque não permitido devido ao saldo insuficiente.");
		}
	}
	
//Método desenvolvido para depósito, recebendo o valor desejado e aplicando a taxa por depósito feito. 
	@Override
	public void deposito(double valor) {
		double saldoAtualizado = getSaldo() + valor - getTaxaDeposito();
		setSaldo(saldoAtualizado);
		System.out.println("Depósito realizado com sucesso." + "\n" + "Valor: " + valor);
	}

//Método desenvolvido para consultar o saldo disponível, onde calcula já com a taxa de consulta. 
	@Override
	public double consulta() {
		return
				getSaldo() - getTaxaConsulta();
	}
	
}
