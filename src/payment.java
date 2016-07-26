
public class payment {

	public static void main(String[] args) {
		
		// create a person object
		person person = new person() ;
		person.setFirstName("James");
		person.setLastName("Kiarie");
		person.setHourlyRate(10);
		
		//print the current state of person object
		System.out.println(person.toString());
		
		//get and print the payment
		System.out.println(person.getPayment(50));

	}

}
