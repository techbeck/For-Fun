import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
	int x = 70;
	int y = 70;
	int red = 180;
	int green = 7;
	int blue = 200;

	public static void main(String[] args) {
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyDrawPanel drawPanel = new MyDrawPanel();

		frame.getContentPane().add(drawPanel);
		frame.setSize(400,400);
		frame.setVisible(true);

		for (int i = 0; i < 215; i++) {
			x++;
			y++;
			drawPanel.repaint();

			try {
				Thread.sleep(50);
			} catch (Exception ex) { }
		}
	}

	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0,0,this.getWidth(),this.getHeight());

			Color purple = new Color(red,green,blue);
			g.setColor(purple);
			g.fillOval(x,y,40,40);
			if (red < 255) {
				red++;
			}
			else if (blue < 255) {
				blue++;
			}
			else if (green < 245){
				green+=4;
			}
			else if (green < 255) {
				green++;
			}
		}
	}
}