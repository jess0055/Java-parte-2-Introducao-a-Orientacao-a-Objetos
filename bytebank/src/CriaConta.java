
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta ();
		primeiraConta.saldo = 300.00;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println(segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("iguais" + "\n" + primeiraConta + "\n" + segundaConta);
		}
		else {
			System.out.println("diferentes" + "\n" + primeiraConta + "\n" + segundaConta);
		}
	}
}
