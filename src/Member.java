
public class Member {
	
	String name;
	int id;
	String phone;
	int weight;
	
	public Member() {
	}
	
	public Member(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Member(String name, int id, String phone, int weight) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.weight = weight;
	}
	
	public void printInfo() {
		System.out.println("name: "+ name + " id: "+ id + " phone: "+ phone + " weight: "+ weight);
	}

}
