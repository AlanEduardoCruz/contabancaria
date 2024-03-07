package conta.model; // Declaração do pacote conta.model

// Declaração da classe ContaCorrente que herda da classe Conta
public class ContaCorrente extends Conta {

	private float limite; // Declaração do atributo limite

	// Construtor da classe ContaCorrente que recebe parâmetros
	public ContaCorrente(int numeroConta, int agencia, int tipo, String titular, float saldo, float limite) {

		// Chamada para o construtor da superclasse Conta
		// para inicializar os atributos herdados da classe Conta
		super(numeroConta, agencia, tipo, titular, saldo);

		// Atributo da Classe
		this.limite = limite;

	}

	// Métodos de Acesso
	public void limite(float limite) {
		this.limite = limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;

	}

	// Método ESpecificos
	
	@Override // Override = Sobreescrever
	public void visualizar() {

		// Super == chamada da superclasse = > conta.visualizar();
		super.visualizar();
		System.out.println("Limite de crédito: " + this.limite);
	}

}
