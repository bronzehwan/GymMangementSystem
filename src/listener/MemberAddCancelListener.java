package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MemberAdder;
import gui.MemberViewer;
import gui.WindowFrame;

public class MemberAddCancelListener implements ActionListener {
	
	WindowFrame frame;

	public MemberAddCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
		

	}

}
