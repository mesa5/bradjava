package tw.brad.bradjava;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyPainter extends JPanel 
	implements MouseListener {
	public MyPainter(){
		System.out.println("A");
		addMouseListener(this);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.BLUE);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked");
	}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released");
	}
}
