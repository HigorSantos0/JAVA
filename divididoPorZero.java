package exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class divididoPorZero {
	
	public static void main(String[]args) {
		
		Scanner S = new Scanner(System.in);
		boolean continuar = true;
		
		do {
			try {
				
				System.out.println("Numero: ");
				int  a = S.nextInt();
				System.out.println("Diviso: ");	
				int b = S.nextInt();
				
				System.out.println(a / b);
				continuar = false;
				
			}
			
			catch(InputMismatchException e1) {
				
				System.err.println("Por favor, insira numeros inteiros");
				S.nextLine();//Descarta toda entrada inválida
			}
			catch(Throwable e2) {
				
				System.err.println("O divisor deve ser fiferente de zero!");
			}
			finally {
				
				System.err.println("Finally executado...");
			}
			
		}while (continuar);
		
		
		
	}

}
