package meuProjeto;

public class conta {
	
	String cliente;
	double saldo;
	
	void exibesaldo () {
		System.out.println(cliente + " Seu saldo é " + saldo );
	}
	
	void saque(double valor) {
		
		saldo -= valor;
	}
	void deposito(double valor) {
		
		saldo += valor;
	}
	
	void transferenciaValor(conta destino, double valor) {
			this.saque(valor);
			destino.deposito(valor);
			
	}
}
