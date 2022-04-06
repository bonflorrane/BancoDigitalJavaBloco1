package desafioBancoDigital;

public class Main {

	public static void main(String[] args) {
		
		Cliente Dio = new Cliente();
		Dio.setNome("Dio");
		
		Conta cc = new ContaCorrente(Dio);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(Dio);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
