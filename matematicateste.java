package meuProjeto;

public class matematicateste {
	
	public static void main (String[]args) {
		
		matematica m = new matematica();
		int maior = m.maior(20,30);
		System.out.println(maior);
		
		double soma = m.soma(50,60);
		System.out.println(soma);
	}

}
