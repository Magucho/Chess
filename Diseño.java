package Chess;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Dise�o extends JFrame {

	public Dise�o() {
		
		dise�oLogo();
	}
	
	public void dise�oLogo() {
		
		Image logo= new ImageIcon(getClass().getResource("logo/chess.png")).getImage();
	     this.setIconImage(logo);
	}
}
