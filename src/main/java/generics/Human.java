package generics;

public class Human extends Screamer {
	public Human(){
		super();
		super.scream = "AAAH";
	}
	public void amplify(int intensity) {
		super.scream =  "A" + "AA".repeat(intensity) + "H";
	}
}
