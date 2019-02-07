
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente jessica = new Cliente();
		jessica.nome = "jessica";
		jessica.cpf = "123456789-01";
		jessica.profissao = "tester";
		
		Conta conta = new Conta();
		conta.deposita(100);
		
		conta.titular = jessica;//composição objetos mesmo que = conta.titular = new Cliente();
		System.out.println(conta.titular.nome);
		
	}
}
