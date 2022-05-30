
public class Main {

	public static void main(String[] args) {
		Cliente debora = new Cliente();
		debora.setNome("Debora");
		
		Conta cc = new ContaCorrente(debora);
		Conta poupanca = new ContaPoupanca(debora);
		
		
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
