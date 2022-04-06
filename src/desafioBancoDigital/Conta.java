package desafioBancoDigital;

public abstract class Conta implements IConta {

	protected static final int agenciaPadrao = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;

	protected int numero;

	protected double saldo;

	private Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.agenciaPadrao; // acessando a classe mãe
		this.numero = SEQUENCIAL++;// cria uma constante, que é uma classe constante e static, ou seja é uma informação que tem relação com a classe conta corrente/poupança e não com a instancia
	//toda vez que é criado uma conta  o sequencial soma mais 1.
	    this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;// -= valor

	}

	@Override
	public void depositar(double valor) {
		this.saldo = saldo + valor;

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);

	}

	protected void imprimirInfoComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
