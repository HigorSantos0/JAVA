package projetojava;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Eventos extends JFrame implements ActionListener{
	
	public Eventos () {
		
		super ("Meus Eventos");
		
        JButton botao = new JButton("clique");
        botao.addActionListener(this);
	
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500, 500);
		
	}
	
	public static void main(String[]args) {
		new Eventos();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("Você clicou!");
	}


}