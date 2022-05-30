package question4;

public class Main {
	
	public static Person generatePerson(Person person)
	{
		
		person = new Student();
		person.setName("Sam");
		person.setGender("male");
		
		
		return person;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person newStudent = generatePerson(new Student());
		
		Person newInstructor = generatePerson(new Instructor());
		
		System.out.println(newStudent);
		System.out.println(newInstructor);
		
		

	}

}
