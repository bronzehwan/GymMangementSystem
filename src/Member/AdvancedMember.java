package Member;

import java.util.Scanner;

public class AdvancedMember extends NoMasterMember {
	
	public AdvancedMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMemberID(input);
		setMemberName(input);
		setMemberPhonewithYN(input);
		setMemberWeight(input);
	}
	
	
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: "+ skind + "name: "+ name + " id: "+ id + " phone: "+ phone + " weight: "+ weight + " home phone: "+ phone + " hoping weight: "+ weight);
	}
	
}
