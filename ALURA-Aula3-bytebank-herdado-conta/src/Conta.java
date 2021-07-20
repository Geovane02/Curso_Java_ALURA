public class Conta{
	
	//atributos
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; //O lado esquerdo é referencia do método Cliente, pegando o nome para ser o titular
	private static int total = 0;
	
	//metodos
	
	public Conta (int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é "+Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta "+this.numero);
				
	}
	
	
	
	
	public void deposita (double valor) {
		this.saldo += valor;
		
	}
	public boolean saca (double valor) {
		if(this.saldo >= valor) {
			this.saldo -=valor;
			return true;
		}else {
			return false;
		}
	}
	public boolean tranfere(double valor, Conta destino ) {
		if(this.saldo >=valor) {
			this.saldo -=valor;
			destino.deposita(valor);
			return true;
		}else { 
			
			return false;
		}
		
	}




	public double getSaldo() {
		return saldo;
	}




	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}




	public int getAgencia() {
		return agencia;
	}




	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}




	public int getNumero() {
		return numero;
	}




	public void setNumero(int numero) {
		this.numero = numero;
	}




	public Cliente getTitular() {
		return titular;
	}




	public void setTitular(Cliente titular) {
		this.titular = titular;
	}




	public static int getTotal() {
		return total;
	}




	public static void setTotal(int total) {
		Conta.total = total;
	}
	
	
	
	
}
	