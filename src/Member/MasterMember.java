package Member;

import java.util.Scanner;

public class MasterMember extends Member implements MemberInput {
	
	public MasterMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Member ID: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Member name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Member's phonenumber: ");
		String phone = input.next();
		this.setPhone(phone);
		
		System.out.print("3´ë Áß·®: ");
		int weight = input.nextInt();
		this.setWeight(weight);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Master:
			skind = "Mas.";
			break;
		case Advanced:
			skind = "Adv.";
			break;
		case Middle:
			skind = "Mid.";
			break;
		case Beginner:
			skind = "Beg.";
			break;
		default:
		}
		System.out.println("kind: "+ skind + "name: "+ name + " id: "+ id + " phone: "+ phone + " weight: "+ weight);
	}

}
