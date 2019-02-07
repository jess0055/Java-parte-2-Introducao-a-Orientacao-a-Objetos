
public class TestaSacaNegativo {
	public static void main(String[] args) {
		
		Conta novaConta = new Conta();
		novaConta.deposita(100);		
		System.out.println(novaConta.saca(101));
				
		
		//proibido acessar atributo diretamente
		/*System.out.println(novaConta.saldo);
		conta.saldo = conta.saldo - 101;
		System.out.println(conta.saldo);*/
		
		System.out.println(novaConta.getSaldo());
	}

}
