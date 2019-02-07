public class Conta{ //especifica��o de uma conta
	
	private double saldo;// atributo n�o pode ser modificado nem lido a n�o ser pela proproa classe - encapsulamento
	int agencia = 341;
	int numero;
	Cliente titular; 
	//Cliente titular = new Cliente(); n�o � interessante pois nem toda conta precisa de um novo cliente, para tratar null pointer
	
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
	
	
	
}