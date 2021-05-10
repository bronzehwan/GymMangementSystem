package Member;

import java.util.Scanner;

public abstract class Member {
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
	
	
	public abstract void printInfo();
	
	

}
