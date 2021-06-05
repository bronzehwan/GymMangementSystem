package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MemberManager memberManager = getObject("membermanager.ser");
		
		if (memberManager == null) {
			memberManager = new MemberManager(input);
		}
		
		WindowFrame frame = new WindowFrame(memberManager);
		selectMenu(input, memberManager);
		putObject(memberManager, "membermanager.ser");
	
	}
	
	public static void selectMenu(Scanner input, MemberManager memberManager) {
		int num = 0;
		
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					memberManager.addMember();
					logger.log("add a member");
					break;
				case 2:
					memberManager.deleteMember();
					logger.log("delete a member");
					break;
				case 3:
					memberManager.editMember();
					logger.log("edit a member");
					break;
				case 4:
					memberManager.viewMembers();
					logger.log("edit a list of member");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 - 5");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	public static void showMenu() {
		System.out.println("1. Add Member");
		System.out.println("2. Delete Member");
		System.out.println("3. Edit Member");
		System.out.println("4. View Members");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5 : ");
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
