package myproj;

public class Customer {
	int socialSecurityNumber;
	String name;
	
	Customer(int socialSecurityNumber, String name){
		this.socialSecurityNumber = socialSecurityNumber;
		this.name = name;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [socialSecurityNumber=" + socialSecurityNumber + ", name=" + name + "]";
	}
}
