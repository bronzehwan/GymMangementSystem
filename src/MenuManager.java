import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Add Member");
			System.out.println("2. Delete Member");
			System.out.println("3. Edit Member");
			System.out.println("4. View Member");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6 : ");
			num = input.nextInt();
			switch(num) {
			case 1:
				addMember();
				break;
			case 2:
				deleteMember();
				break;
			case 3:
				editMember();
				break;
			case 4:
				viewMember();
				break;
			}
		}
		
	
	}
	
	public static void addMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Member ID: ");
		int memberid = input.nextInt();
		System.out.print("Member name: ");
		String membername = input.next();
		System.out.print("Member's phonenumber: ");
		String memberphone = input.next();
		System.out.print("3´ë Áß·®: ");
		int weight = input.nextInt();
	}
	
	public static void deleteMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Member ID: ");
		int memberid = input.nextInt();
	}
	
	public static void editMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Member ID: ");
		int memberid = input.nextInt();
	}
	
	public static void viewMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Member ID: ");
		int memberid = input.nextInt();
	}

}
