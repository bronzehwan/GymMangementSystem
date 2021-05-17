package Member;

import java.util.Scanner;

import exception.PhoneFormatException;

public interface MemberInput {
	
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setPhone(String phone) throws PhoneFormatException;
	
	public void setWeight(int weight);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setMemberID(Scanner input);
	
	public void setMemberName(Scanner input);
	
	public void setMemberPhone(Scanner input);
	
	public void setMemberWeight(Scanner input);

}
