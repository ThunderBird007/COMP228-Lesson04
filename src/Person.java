
public class Person {
	private int _age;
	private boolean _isValid = false;

	public int getAge() {
		return this._age;
	}
	public boolean getIsValid() {
		return this. _isValid;
	}

	public void setAge(String ageString) {
		try {
			int age = Integer.parseInt(ageString);
			if (age < 0) {
				// throw new IllegalArgumentException("Illegal Age value < 0
				// entered");
				System.out.println("Please enter a positive number");
			} else {
				this._age = age;
				this._isValid = true;
			}
		} catch (Exception exception) {
			System.out.println("Please enter an integer value");
		}
	
	}
	
	public Person() {
		
	}
	// overriding the toString method
	public String toString() {
		return "\nYou entered: " + this._age;
	}

	

}
