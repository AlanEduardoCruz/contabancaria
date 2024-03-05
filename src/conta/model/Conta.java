package conta.model;

public class Conta {

	// Atributos // Caracteristicas

	// Encapsulamento: Encapsular/ Proteger algo
	// Private / Protected / public / friendly
	// private define quem pode acessar, ou seja, apenas membros da própria classe
	// podem acessá-lo

	// Atributos da classe Conta
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	// Métodos / Ações

	// Método Construtor => que auxilia na criação/instanciação de um Objeto da
	// classe

	public Conta(int numeroConta, int agencia, int tipo, String titular, float saldo) {

		// Utiliza-se "this" para referenciar os atributos da própria classe.
		// Só usa this quando atributo e metodo possui mesmo nome.

		numero = numeroConta;
		this.agencia = agencia;// Agencia.numero recebe o valor do arg: numero;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	// Métodos de acesso (Método Get (pegar) - Método Set (Atualizar - não tem
	// retorno)

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	// metodos e acoes

	public boolean sacar(float valor) {
		// Verifica se o saldo é suficiente para o saque
		if (this.getSaldo() < valor) {
			System.out.println("\n Saldo Insuficiente");
			return false; // Retorna falso se o saldo for insuficiente
		}
		// Atualiza o saldo após o saque
		this.setSaldo(this.getSaldo() - valor);
		return true; // Retorna true se o saque foi bem-sucedido
	}

	public void depositar(float valor) {

		this.setSaldo(this.getSaldo() + valor);
	}

	public void visualizar() {
		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta poupança";
			break;
			
		}
		
		System.out.println("\n**************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("****************************************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);

	}

}
