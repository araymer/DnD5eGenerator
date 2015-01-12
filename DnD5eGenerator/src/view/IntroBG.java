package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class IntroBG extends JPanel {

	private Image image;
	
	public IntroBG() {
		super();
		try {
			image = ImageIO.read(new File("GenIntro.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawImage(image, 0, 0, 800, 600, null);
		
	}
	
}
