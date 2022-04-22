package pigs;
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
	public Die(int faceCount)
	{
		// TODO
		this.faceCount = faceCount;
		faceValue = rand.nextInt(1,faceCount+1);
	}

	/**
	 * Creates a die with 6 faces and a random face value.
	 */
	// TODO: Make another constructor
	// TODO: make getters
	public Die(){
		this(6);
	}


	/**
	 * Rolls the die, resulting in a new face value.
	 */
	public void roll() {
		faceValue = rand.nextInt(1,faceCount+1);
	}

	public int getFaceCount() {
		return faceCount;
	}

	public int getFaceValue() {
		return faceValue;
	}
	public void printFace()
	{
		System.out.println("You rolled a: " + faceValue);
	}

}