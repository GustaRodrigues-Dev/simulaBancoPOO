
public class Executar {
	
	 public static void main(String[] args) {
	        Banco banco = new Banco("Banco Digital");

	        Cliente cliente1 = new Cliente("João");
	        Conta cc1 = new ContaCorrente(cliente1);
	        Conta poupanca1 = new ContaPoupanca(cliente1);

	        Cliente cliente2 = new Cliente("Maria");
	        Conta cc2 = new ContaCorrente(cliente2);

	        banco.adicionarConta(cc1);
	        banco.adicionarConta(poupanca1);
	        banco.adicionarConta(cc2);

	        cc1.depositar(1000);
	        cc1.sacar(200);
	        cc1.transferir(100, poupanca1);

	        cc2.depositar(500);
	        cc2.sacar(50);

	        banco.listarContas();
	    }

}
