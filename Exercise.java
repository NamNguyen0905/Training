class Animal{

	protected String limbs = "4";
	protected String name;

	public Animal (String limbs, String name) {
		if (name.equalsIgnoreCase("Dog") || name.equalsIgnoreCase("Cat")){
			this.limbs = "4 legs";
		} else {
			this.limbs = limbs;
		}
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getLimbs() {
		return this.limbs;
	}

	public void Sound() {
		System.out.println("I'm " + this.name + ".");
	}

}

class Human extends Animal {

	public Human (String name) {
		super("2 hands - 2 legs",name);
	}

	public void Sound() {
		System.out.println("I'm human. My name is " + this.name + "." + (this.name.equalsIgnoreCase("Nam") ? " My father is Thanh." : "") );
	}
}

public class Exercise {
	
	public static void main(String args[]) {

	}
}