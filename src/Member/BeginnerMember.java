package Member;

import java.util.Scanner;

public class BeginnerMember extends Member {
	
	protected String homephone;
	protected int hopingweight;
	
	public BeginnerMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Member ID: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Member name: ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have a phonenumber? (Y/N)");
			answer = input.next().charAt(0);
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
		
		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have a home phonenumber? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y'|| answer == 'Y') {
				System.out.print("Home phonenumber: ");
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
		System.out.println("kind: "+ skind + "name: "+ name + " id: "+ id + " phone: "+ phone + " weight: "+ weight + " home phone: "+ phone + " hoping weight: "+ weight);
	}

}
