public class Conta{ //especificação de uma conta
	double saldo;
	int agencia = 341;
	int numero;
	String titular;
	
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
}