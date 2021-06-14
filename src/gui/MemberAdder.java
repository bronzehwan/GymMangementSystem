package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.MemberAddCancelListener;
import listener.MemberAdderListener;
import manager.MemberManager;

public class MemberAdder extends JPanel {
	
	WindowFrame frame;
	
	MemberManager membermanager;
	
	public MemberAdder(WindowFrame frame, MemberManager membermanager) {
		this.frame = frame;
		this.membermanager = membermanager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID : ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPhone = new JLabel("Phone : ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		JLabel labelWeight = new JLabel("Weight : ", JLabel.TRAILING);
		JTextField fieldWeight = new JTextField(10);
		labelWeight.setLabelFor(fieldWeight);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new MemberAdderListener(fieldID, fieldName, fieldPhone, fieldWeight, membermanager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new MemberAddCancelListener(frame));
		
		panel.add(labelWeight);
		panel.add(fieldWeight);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
	}

}
