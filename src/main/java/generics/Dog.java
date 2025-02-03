package generics;

public class Dog extends Screamer {
	public Dog(){
		super();
		super.scream = "AROO";
	}
	@Override
	public void amplify(int intensity) {
		super.scream =  "AR" + "OO".repeat(intensity);
	}
}
