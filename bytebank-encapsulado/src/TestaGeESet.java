
public class TestaGeESet {
	
	public static void main(String[] args) {
		
		 Conta conta = new Conta(1337, 24226);
		 //conta.numero = 1337;
		 conta.setNumero(1377);
		 System.out.println(conta.getNumero());
		 
		 Cliente jessica = new Cliente();
		 //conta.titular = jessica; titular é atributo privado
		 		
		 //jessica.nome ="jessica oliveira";
		 jessica.setNome("Jessica Oliveira");
		 
		 conta.setTitular(jessica);
		 
		 //System.out.println(jessica.getNome());
		 System.out.println(conta.getTitular().getNome());
		 
		 conta.getTitular().setProfissao("programador");
		 //agora em duas linhas:
		 Cliente retornoGetTitutar = conta.getTitular();
		 retornoGetTitutar.setProfissao("tester");
		 
		 System.out.println(retornoGetTitutar);
		 System.out.println(jessica);
		 System.out.println(conta.getTitular());
	}

}
