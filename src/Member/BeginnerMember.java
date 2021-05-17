package Member;

import java.util.Scanner;

import exception.PhoneFormatException;

public class BeginnerMember extends NoMasterMember {
	
	protected String homephone;
	protected int hopingweight;
	
	public BeginnerMember(MemberKind kind) {
		super(kind);
	}
	
	
	
	public void getUserInput(Scanner input) {
		setMemberID(input);
		setMemberName(input);
		setMemberPhonewithYN(input);
		setHomePhonewithYN(input);
		setMemberWeight(input);
	}
	
	public void setHomePhonewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have a home phonenumber? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y'|| answer == 'Y') {
					setMemberPhone(input);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setPhone("");
					break;
				}
				else {
				}
			}
			catch(PhoneFormatException e) {
				System.out.println("Incorrect Phone Format. put the phone number that contains 010");
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: "+ skind + "name: "+ name + " id: "+ id + " phone: "+ phone + " weight: "+ weight + " home phone: "+ phone + " hoping weight: "+ weight);
	}
	
	

}
