
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		//conta está incosistente com regra de negócio
		//conta.setAgencia(-50);
		//conta.setNumero(-100);
		
		System.out.println(conta.getAgencia());
		conta.setAgencia(1234567);
		
		Conta conta2 = new Conta(1337, 24227);
		Conta conta3 = new Conta(1337, 24228);
		
		System.out.println(Conta.getTotal());
	}
}
