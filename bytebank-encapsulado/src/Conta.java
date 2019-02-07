public class Conta{ //especificação de uma conta
	
	private double saldo;// atributo não pode ser modificado nem lido a não ser pela proproa classe - encapsulamento
	private int agencia;
	private int numero;
	private Cliente titular; //composição
	private static int total;//parecido com variavel global
	//Cliente titular = new Cliente(); não é interessante pois nem toda conta precisa de um novo cliente, para tratar null pointer
	

	public Conta(int agencia, int numero) {
		Conta.total++;
	//	System.out.println("total de contas " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
	//	System.out.println("criando conta");
	}
	
	public void deposita (double valor) {
		//saldo = saldo + valor;
		this.saldo += valor;
	}
	
	public boolean saca (double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}					
	}
	
	public boolean transfere (double valor, Conta destino) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;			
			destino.deposita(valor);//destino.saldo += valor;
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;	
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero <=0) {
			System.out.println("não pode");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <=0) {
			System.out.println("não pode");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {//metodo da classe
		return Conta.total;
	}
}