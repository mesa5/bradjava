package tw.brad.bradjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad70 extends JFrame {
	public Brad70() {
		setLayout(new BorderLayout());
		add(new GameView(), BorderLayout.CENTER);

		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class GameView extends JPanel {
		private Timer timer;
		private LinkedList<Ball> balls;

		GameView() {
			balls = new LinkedList<>(); 
			timer = new Timer();
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					repaint();
				}
			}, 0, 40);
			addMouseListener(new MyMouse());
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.red);
			for (Ball ball : balls){
				g2d.fillOval(ball.x-15, ball.y-15, 30, 30);
			}
		}

		class MyMouse extends MouseAdapter {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Ball ball = new Ball(e.getX(), e.getY());
				timer.schedule(ball, 1000, 60);
				balls.add(ball);
			}

		}

		class Ball extends TimerTask {
			int x, y, dx, dy;

			Ball(int x, int y) {
				dx = dy = 4;
				this.x = x;
				this.y = y;
			}

			@Override
			public void run() {
				if (x<0 || x+30>getWidth()){
					dx *= -1;
				}
				if (y<0 || y+30 > getHeight()){
					dy *= -1;
				}
				x += dx;
				y += dy;
			}
		}
	}

	public static void main(String[] args) {
		new Brad70();
	}

}
