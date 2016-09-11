package tw.brad.bradjava;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad66 extends JFrame{
	private MyPainter painter;
	private JButton clear, undo, redo;
	
	public Brad66(){
		setLayout(new BorderLayout());
	
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(clear);top.add(undo);top.add(redo);
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
	
	
	public static void main(String[] args) {
		new Brad66();
	}
}
