package generics;

public class Cat extends Screamer {
	public Cat(){
		super();
		super.scream = "MEOW";
	}
	@Override
	public void amplify(int intensity) {
		super.scream = "M" + "E".repeat(intensity) + "O".repeat(intensity) + "W";
	}
}
