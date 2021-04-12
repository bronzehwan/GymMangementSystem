package Member;

import java.util.Scanner;

public class AdvancedMember extends Member {
	
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
		
		
		System.out.print("3´ë Áß·®: ");
		int weight = input.nextInt();
		this.setWeight(weight);
	}
	

}
