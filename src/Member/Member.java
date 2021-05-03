package Member;

import java.util.Scanner;

public class Member {
	protected MemberKind kind = MemberKind.Master;
	protected String name;
	protected int id;
	protected String phone;
	protected int weight;
	
	public Member() {
	}
	
	public Member(MemberKind kind) {
		this.kind = kind;
	}
	
	public Member(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Member(MemberKind kind, String name, int id, String phone, int weight) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.weight = weight;
	}
	
	public Member(String name, int id, String phone, int weight) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.weight = weight;
	}
	
	public MemberKind getKind() {
		return kind;
	}

	public void setKind(MemberKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
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

}
