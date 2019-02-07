
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaJessica = new Conta();
		System.out.println(contaJessica.getSaldo());
		
		contaJessica.titular = new Cliente();
		System.out.println(contaJessica.titular);
		
		contaJessica.titular.nome = "jessica";//null pointer se Cliente não for instanciado
		System.out.println(contaJessica.titular.nome);
	}
}
