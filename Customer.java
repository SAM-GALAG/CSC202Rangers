package rangersA;

public class Customer {

	public double wallet;
	public String fName;
	public String lName;
	
	public Customer() {

	}

	public Customer(String firstName, String lastName, double money) {
		firstName = fName;
		lastName = lName;
		money = wallet;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getWallet() {
		return wallet;
	}

	public void setWallet(double wallet) {
		this.wallet = wallet;
	}

	
	
}

