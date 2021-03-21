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
				System.out.print("Member ID: ");
				int memberid = input.nextInt();
				System.out.print("Member name: ");
				String membername = input.next();
				break;
			case 2:
			case 3:
			case 4:
				System.out.print("Member ID: ");
				int memberid2 = input.nextInt();
			}
		}
	
	}

}
