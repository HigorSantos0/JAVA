package projetojava;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;


public class Layouts extends JFrame{
	
	public Layouts () {
		
		super ("Meu Layout");
		
        Container c = getContentPane();
		
		c.add(BorderLayout.NORTH, new JButton("Botao Norte"));
		c.add(BorderLayout.SOUTH, new JButton("Botao Sul"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[]args) {
		new Layouts();
	}
	


}
