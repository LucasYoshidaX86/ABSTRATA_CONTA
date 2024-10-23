//Criação da classe abstrata de ContaBancaria com atributo e métodos.
public abstract class ContaBancaria {
	private double saldo;
	private double taxaSaque;
	private double taxaDeposito;
	private double taxaConsulta;
	
//Constructor para inicialização do atributo criado.
	public ContaBancaria(double saldo, double taxaSaque, double taxaDeposito, double taxaConsulta) {
		this.saldo = saldo;
		this.taxaSaque = taxaSaque;
		this.taxaDeposito = taxaDeposito;
		this.taxaConsulta = taxaConsulta;
	}

//Encapsulamento para acessar e alterar atributos privados.
	public double getSaldo() {
		return 
				saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getTaxaSaque() {
		return 
				taxaSaque;
	}
	
	public void setTaxaSaque(double taxaSaque) {
		this.taxaSaque = taxaSaque;
	}
	
	public double getTaxaDeposito() {
		return
				taxaDeposito;
	}
	
	public void setTaxaDeposito(double taxaDeposito) {
		this.taxaDeposito = taxaDeposito;
	}
	
	public double getTaxaConsulta() {
		return
				taxaConsulta;
	}
	
	public void setTaxaConsulta(double taxaConsulta) {
		this.taxaConsulta = taxaConsulta;
	}

//Criação dos métodos requisitados da atividade utilizando abstract apenas para a definição.
	abstract void saque(double valor);
	
	abstract void deposito(double valor);
	
	abstract double consulta();
}
