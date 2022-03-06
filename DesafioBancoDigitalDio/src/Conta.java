public abstract class Conta implements InterfaceConta{

	private static final int AGENCIA_PADRAO = 1;

	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected float saldo;

	public Conta(){
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}

	@Override
	public void sacar(double valor){
		saldo -= valor;
	}

	@Override
	public void depositar(double valor){
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino){
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia(){
		return agencia;
	}

	public int getNumero(){
		return numero;
	}

	public double getSaldo(){
		return saldo;
	}

	protected void imprimirInfoConta(){
		System.out.println(String.format("Agencia: %d",agencia));
		System.out.println(String.format("Número: %d",numero));
		System.out.println(String.format("Saldo: $%.2f",saldo));
	}

}
