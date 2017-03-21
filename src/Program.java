import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		int myAge;

		while (!person.getIsValid()) {
			Scanner input = new Scanner(System.in);

			System.out.println("Please enter your age:");
			person.setAge(input.nextLine());

			if (person.getIsValid()) {
				System.out.println(person.toString());
			} else {
				System.out.println();

			}

		}
	}

}
