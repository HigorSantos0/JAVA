package projetojava;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuFrame extends JFrame {
	
	public MeuFrame () {
		
		super ("Meu Nome");
		
		JButton botao = new JButton ("Clique");
		
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[]args) {
		new MeuFrame();
	}

}

