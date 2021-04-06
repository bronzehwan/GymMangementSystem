import java.util.Scanner;

public class MemberManager {
	Member member;
	Scanner input;
	MemberManager(Scanner input){
		this.input = input;
	}
	
	public void addMember() {
		member = new Member();
		System.out.print("Member ID: ");
		member.id = input.nextInt();
		System.out.print("Member name: ");
		member.name = input.next();
		System.out.print("Member's phonenumber: ");
		member.phone = input.next();
		System.out.print("3´ë Áß·®: ");
		member.weight = input.nextInt();
	}
	
	public void deleteMember() {
		System.out.print("Member ID: ");
		int memberid = input.nextInt();
		if (member == null) {
			System.out.println("the member has not been registered");
			return;
		}
		if (member.id == memberid) {
			member = null;
			System.out.println("the member is deleted");
		}
	}
	
	public void editMember() {
		System.out.print("Member ID: ");
		int memberid = input.nextInt();
		if (member.id == memberid) {
			System.out.println("the member to be edited is "+ memberid);
		}
	}
	
	public void viewMember() {
		System.out.print("Member ID: ");
		int memberid = input.nextInt();
		if (member.id == memberid) {
			member.printInfo();
		}
	}

}
