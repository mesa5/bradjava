package tw.brad.bradjava;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MyPainter extends JPanel {
	private LinkedList<HashMap<String, Integer>> line;

	public MyPainter() {
		MyAdapter adapter = new MyAdapter();
		addMouseListener(adapter);
		addMouseMotionListener(adapter);
		line = new LinkedList<>();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		for (int i=1; i<line.size(); i++){
			HashMap<String,Integer> p0 = line.get(i-1);
			HashMap<String,Integer> p1 = line.get(i);
			int p0x = p0.get("x"), p0y = p0.get("y");
			int p1x = p1.get("x"), p1y = p1.get("y");
			g2d.drawLine(p0x, p0y, p1x, p1y);
		}
	}

	private class MyAdapter extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			addPoint(e);
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			addPoint(e);
		}
		private void addPoint(MouseEvent e){
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());
			line.add(point);
		}
	}

}
