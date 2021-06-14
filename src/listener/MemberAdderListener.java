package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Member.MasterMember;
import Member.Member;
import Member.MemberInput;
import Member.MemberKind;
import exception.PhoneFormatException;
import manager.MemberManager;

public class MemberAdderListener implements ActionListener {

	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldPhone;
	JTextField fieldWeight;
	
	MemberManager membermanager;

	
	public MemberAdderListener(JTextField fieldID, JTextField fieldName, JTextField fieldPhone,
			JTextField fieldWeight, MemberManager membermanager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldPhone = fieldPhone;
		this.fieldWeight = fieldWeight;
		this.membermanager = membermanager;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		MemberInput member = new MasterMember(MemberKind.Master);
		
		try {
			member.setId(Integer.parseInt(fieldID.getText()));
			member.setName(fieldName.getText());
			member.setPhone(fieldPhone.getText());
			member.setWeight(Integer.parseInt(fieldWeight.getText()));
			membermanager.addMember(member);
			putObject(membermanager, "membermanager.ser");
			member.printInfo();
		} catch (PhoneFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public static void putObject(MemberManager memberManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(memberManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
