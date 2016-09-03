package tw.brad.bradjava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Brad51 extends JFrame {
	private JButton open, save, exit;
	private JTextArea edit;

	public Brad51(){
		super("My Window App");
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		edit = new JTextArea();
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open);top.add(save);top.add(exit);
		add(top, BorderLayout.NORTH);
		add(edit, BorderLayout.CENTER);

		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Brad51();
	}

}



