import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Member.AdvancedMember;
import Member.BeginnerMember;
import Member.MasterMember;
import Member.Member;
import Member.MemberInput;
import Member.MemberKind;

public class MemberManager {
	ArrayList<MemberInput> members = new ArrayList<MemberInput>();
	Scanner input;
	MemberManager(Scanner input){
		this.input = input;
	}
	
	public void addMember() {
		int kind = 0;
		MemberInput memberInput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Master");
				System.out.println("2 for Advanced");
				System.out.println("3 for Beginner");
				System.out.println("Select num 1, 2, or 3 for Member Kind: ");
				kind = input.nextInt();
				if (kind == 1) {
					memberInput = new MasterMember(MemberKind.Master);
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else if (kind == 2) {
					memberInput = new AdvancedMember(MemberKind.Advanced);
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else if (kind == 3) {
					memberInput = new BeginnerMember(MemberKind.Beginner);
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else {
					System.out.println("Select num 1, 2, or 3 for Member Kind: ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 - 3");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
			
		}
		
	}
	
	public void deleteMember() {
		System.out.print("Member ID: ");
		int memberid = input.nextInt();
		int index = findIndex(memberid);
		removefromMembers(index,memberid);
	}
	
	public int findIndex(int memberid) {
		int index = -1;
		for (int i = 0; i<members.size(); i++) {
			if (members.get(i).getId() == memberid) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromMembers(int index, int memberid) {
		if (index >= 0) {
			members.remove(index);
			System.out.println("the member " + memberid +"is deleted");
			return 1;
		}
		else {
			System.out.println("the member has not been registered");
			return -1;
		}
	}
	
	public void editMember() {
		System.out.print("Member ID: ");
		int memberid = input.nextInt();
		for (int i = 0; i<members.size(); i++) {
			MemberInput member = members.get(i);
			if (member.getId() == memberid) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						member.setMemberID(input);
						break;
					case 2:
						member.setMemberName(input);
						break;
					case 3:
						member.setMemberPhone(input);
						break;
					case 4:
						member.setMemberWeight(input);
						break;
					default:
						continue;
					}
					
				}
				break;
			}
		}
		
			
	}
	
	public void viewMembers() {
		System.out.println("# of registered members: " + members.size());
		for (int i = 0; i<members.size(); i++) {
			members.get(i).printInfo();
		}
		
	}
	
	
	
	
	
	public void showEditMenu() {
		System.out.println("** Member Info Edit Menu **");
		System.out.println(" 1. Edit Id");
		System.out.println(" 2. Edit Name");
		System.out.println(" 3. Edit Phone");
		System.out.println(" 4. Edit Weight");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1-5");
	}

}
