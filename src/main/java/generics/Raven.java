package generics;

public class Raven extends Screamer {
	public Raven(){
		super();
		super.scream = "CAAW";
	}
	@Override
	public void amplify(int intensity) {
		super.scream =  "C" + "AA".repeat(intensity) + "W";
	}
}
