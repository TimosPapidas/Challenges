package generics;

public class ScreamerAmplifier<T extends Screamer> {
	private final T screamer;
	private int intensity;
	public ScreamerAmplifier(T screamer, int intensity) {
		this.screamer = screamer;
		this.intensity = intensity;
	}

	public T getAmplifiedScreamer(int intensity){
		screamer.amplify(intensity);
		return screamer;
	}
}
