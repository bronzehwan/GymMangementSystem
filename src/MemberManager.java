import java.util.ArrayList;
import java.util.Scanner;

import Member.AdvancedMember;
import Member.BeginnerMember;
import Member.Member;
import Member.MemberKind;

public class MemberManager {
	ArrayList<Member> members = new ArrayList<Member>();
	Scanner input;
	MemberManager(Scanner input){
		this.input = input;
	}
	
	public void addMember() {
		int kind = 0;
		Member member;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Master");
			System.out.println("2 for Advanced");
			System.out.println("3 for Beginner");
			System.out.println("Select num 1, 2, or 3 for Member Kind: ");
			kind = input.nextInt();
			if (kind == 1) {
				member = new Member(MemberKind.Master);
				member.getUserInput(input);
				members.add(member);
				break;
			}
			else if (kind == 2) {
				member = new AdvancedMember(MemberKind.Advanced);
				member.getUserInput(input);
				members.add(member);
				break;
			}
			else if (kind == 3) {
				member = new BeginnerMember(MemberKind.Beginner);
				member.getUserInput(input);
				members.add(member);
				break;
			}
			else {
				System.out.println("Select num 1, 2, or 3 for Member Kind: ");
			}
			
		}
		
	}
	
	public void deleteMember() {
		System.out.print("Member ID: ");
		int memberid = input.nextInt();
		int index = -1;
		for (int i = 0; i<members.size(); i++) {
			if (members.get(i).getId() == memberid) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			members.remove(index);
			System.out.println("the member " + memberid +"is deleted");
		}
		else {
			System.out.println("the member has not been registered");
			return;
		}
		
	}
	
	public void editMember() {
		System.out.print("Member ID: ");
		int memberid = input.nextInt();
		for (int i = 0; i<members.size(); i++) {
			Member member = members.get(i);
			if (member.getId() == memberid) {
				int num = -1;
				while (num != 5) {
					System.out.println("** Member Info Edit Menu **");
					System.out.println(" 1. Edit Id");
					System.out.println(" 2. Edit Name");
					System.out.println(" 3. Edit Phone");
					System.out.println(" 4. Edit Weight");
					System.out.println(" 5. Exit");
					System.out.println("Select one number between 1-5");
					num = input.nextInt();
					if (num == 1) {
						System.out.println("Member ID: ");
						int id = input.nextInt();
						member.setId(id);
					}
					else if (num == 2) {
						System.out.println("Member name: ");
						String name = input.next();
						member.setName(name);
					}
					else if (num == 3) {
						System.out.println("Member phone: ");
						String phone = input.next();
						member.setPhone(phone);
					}
					else if (num == 4) {
						System.out.println("Member weight: ");
						int weight = input.nextInt();
						member.setWeight(weight);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
		
			
	}
	
	public void viewMembers() {
//		System.out.print("Member ID: ");
//		int memberid = input.nextInt();
		System.out.println("# of registered members: " + members.size());
		for (int i = 0; i<members.size(); i++) {
			members.get(i).printInfo();
		}
		
	}

}
