package Chess;

import javax.swing.JFrame;

public class Principal extends Dise�o {
	
	public static void main(String arg[]) {
		
		Dise�o dise�o= new Dise�o();
		
		dise�o.setLayout(null);
		dise�o.setSize(600,600);
		dise�o.setVisible(true);
		//dise�o.setUndecorated(true);
		dise�o.setLocation(600,50);
		dise�o.setTitle("Chess");
		dise�o.setResizable(true);
		dise�o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
