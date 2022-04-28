
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Felipe Costa");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(1000);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
