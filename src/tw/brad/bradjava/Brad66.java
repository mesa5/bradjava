package tw.brad.bradjava;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad66 extends JFrame{
	private MyPainter painter;
	private JButton clear, undo, redo, save;
	
	public Brad66(){
		setLayout(new BorderLayout());
	
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		save = new JButton("Save");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(clear);top.add(undo);top.add(redo);
		top.add(save);
		add(top, BorderLayout.NORTH);
		
		painter = new MyPainter();
		add(painter, BorderLayout.CENTER);
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setupEvent();
	}
	
	private void setupEvent(){
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doClear();
			}
		});
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doUndo();
			}
		});
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doRedo();
			}
		});
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doSave();
			}
		});
	}
	
	private void doClear(){
		painter.clear();
	}
	private void doUndo(){
		painter.undo();
	}
	private void doRedo(){
		painter.redo();
	}
	private void doSave(){
		BufferedImage bi = 
			new BufferedImage(painter.getWidth(), 
					painter.getHeight(), 
					BufferedImage.TYPE_INT_ARGB); 
		Graphics g = bi.createGraphics();
		painter.paint(g);  //this == JComponent
		g.dispose();
		try{
			ImageIO.write(bi,"png",new File("dir1/test.png"));
		}catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		new Brad66();
	}
}
