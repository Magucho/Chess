package Chess;

import javax.swing.JFrame;

public class Principal extends Accionar2 {
	
	public static void main(String arg[]) {
		
		Principal dise�o= new Principal();
		
		dise�o.setLayout(null);
		dise�o.setSize(580,630);
		dise�o.setUndecorated(true);
		dise�o.setVisible(true);
		dise�o.setLocation(600,50);
		dise�o.setTitle("Chess");
		dise�o.setResizable(true);
		dise�o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
