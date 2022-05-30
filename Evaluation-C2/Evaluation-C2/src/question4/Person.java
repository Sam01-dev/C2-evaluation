package question4;

public class Person {
	
	String name;
	String gender;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	Address address = new Address();
	
	@Override
	public String toString(){
		return (name+" "+gender+" "+address.city+" "+address.state+" "+address.pinCode);
	}
	

}

class Address{
	String city;
	String state;
	String pinCode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
	
	
}
