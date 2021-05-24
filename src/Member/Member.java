package Member;

import java.io.Serializable;
import java.util.Scanner;

import exception.PhoneFormatException;

public abstract class Member implements MemberInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6430282565120251739L;
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

	public void setPhone(String phone) throws PhoneFormatException {
		if (!phone.contains("010") && !phone.equals("")) {
			throw new PhoneFormatException();
		}
		this.phone = phone;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public abstract void printInfo();
	
	public void setMemberID(Scanner input) {
		System.out.println("Member ID: ");
		int id = input.nextInt();
		this.setId(id);
	}
	
	public void setMemberName(Scanner input) {
		System.out.println("Member name: ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setMemberPhone(Scanner input) {
		String phone = "";
		while (!phone.contains("010")) {
			System.out.println("Member phone: ");
			phone = input.next();
			try {
				this.setPhone(phone);
			} catch (PhoneFormatException e) {
				System.out.println("Incorrect Phone Format. put the phone number that contains 010");
			}
		}
		
	}
	
	public void setMemberWeight(Scanner input) {
		System.out.println("Member weight: ");
		int weight = input.nextInt();
		this.setWeight(weight);
	}
	
	public String getKindString() {
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
		return skind;
	}

}
