package generics;

public abstract class Screamer {
	protected String scream;
	public String scream() {
		return scream;
	}
	public abstract void amplify(int intensity);
}
