package simple;
import java.util.Random;

public class Die {
	// number of faces
	private int faceCount;
	// value of upper face
	private int faceValue;
	private Random rand = new Random();

	/**
	 * Creates a die with the given face count and a random face value.
	 */
	public Die(int faceCount) {
		this.faceCount = faceCount;
		faceValue = rand.nextInt(1,faceCount+1);

		// TODO
		// Remember to initialise all fields.
	}

	/**
	 * Creates a die with 6 faces and a random face value.
	 */
	// TODO: Make another constructor
	public Die(){
		this(6);
	}
	// TODO: make getters
	public int getFaceCount() {
		return faceCount;
	}
	public int getFaceValue() {
		return faceValue;
	}
	/**
	 * Rolls the die, resulting in a new face value.
	 */
	public void roll() {
		faceValue = rand.nextInt(1, faceCount+1);
	}
}