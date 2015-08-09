import javax.swing.*;
import java.awt.*;

public class Animate {
	int x = 1;
	int y = 1;

	public static void main(String[] args) {
		Animate gui = new Animate();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPanel drawPanel = new MyDrawPanel();
		frame.getContentPane().add(drawPanel);
		frame.setSize(500,270);
		frame.setVisible(true);
		for (int i = 0; i<124; i++,y++,x++) {
			x++;
			drawPanel.repaint();
			try {
				Thread.sleep(50);
			} catch (Exception ex) {}
		}
	}

	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0,0,500,500);
			g.setColor(Color.blue);
			g.fillRect(x,y,500-x*2,250-y*2);
		}
	}
}