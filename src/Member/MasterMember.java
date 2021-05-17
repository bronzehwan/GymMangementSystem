package Member;

import java.util.Scanner;

public class MasterMember extends Member {
	
	public MasterMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMemberID(input);
		setMemberName(input);
		setMemberPhone(input);
		setMemberWeight(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: "+ skind + "name: "+ name + " id: "+ id + " phone: "+ phone + " weight: "+ weight);
	}

}
