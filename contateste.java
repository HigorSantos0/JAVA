package meuProjeto;

public class contateste {
	
	public static void main(String[] args) {
		
		conta conta = new conta();
		conta.cliente = "Higor";
		conta.saldo = 5_000.00;
		conta.exibesaldo();
		
		//conta.saque(2000);
		//conta.exibesaldo();
		
		//conta.deposito(3000);
		//conta.exibesaldo();
		
		conta destino = new conta();
		destino.cliente = "Pamela";
		destino.saldo = 5_000.00;
		destino.exibesaldo();
		
	}

}
