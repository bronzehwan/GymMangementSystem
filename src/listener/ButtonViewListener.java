package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.MemberViewer;
import gui.WindowFrame;
import manager.MemberManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MemberViewer memberviewer = frame.getMemberviewer();
		MemberManager memberManager = getObject("membermanager.ser");
		memberviewer.setMembermanager(memberManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(memberviewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static MemberManager getObject(String filename) {
		MemberManager memberManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			memberManager = (MemberManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return memberManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return memberManager;
	}

}
