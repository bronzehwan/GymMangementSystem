package Member;

import java.util.Scanner;

import exception.PhoneFormatException;

public abstract class NoMasterMember extends Member {
	
	public NoMasterMember(MemberKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);


	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: "+ skind + "name: "+ name + " id: "+ id + " phone: "+ phone + " weight: "+ weight + " home phone: "+ phone + " hoping weight: "+ weight);
	}
	
	public void setMemberPhonewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have a phonenumber? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y'|| answer == 'Y') {
					System.out.print("Member's phonenumber: ");
					String phone = input.next();
					this.setPhone(phone);
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

}
