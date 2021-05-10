package Member;

import java.util.Scanner;

public interface MemberInput {
	
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setPhone(String phone);
	
	public void setWeight(int weight);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();

}
