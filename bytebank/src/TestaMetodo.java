
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta ();
		
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		boolean sacou = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(sacou);
		
		Conta contaJessica = new Conta();
		contaJessica.deposita(1000);
		boolean sucesso = contaJessica.transfere(500, conta);
		
		if(sucesso) {
			System.out.println("sucesso");
		}
		else {
			System.out.println("faltou dinheiro");
		}
		
		System.out.println(contaJessica.saldo);
		System.out.println(conta.saldo);
		
		conta.titular = "jessica";
		System.out.println(conta.titular);
	}

}
