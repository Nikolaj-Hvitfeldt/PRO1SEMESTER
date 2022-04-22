package simple;

public class DiceThrower {
	// 2 dice with face count of 6 each
	private Die die1, die2;


	// TODO: Add fields.
	// Fields:
	// 1. The roll count.
	private int rollCount;

	// 2. The total of all face values rolled.
	private int acSum;
	// 3. The count of face value 6.
	private int rollSix;
	// 4. The count of same face value on both dice.
	private int rollSame;

	// 5. The maximum sum of the face values in one roll.
	private int maxSum;
	// Remember to update fields, when the dice are rolled.

	/**
	 * Creates a DiceThrower object.
	 */
	// TODO: Make a constructor that initialises all fields.
	public DiceThrower(){
		die1 = new Die();
		die2 = new Die();
		rollCount = 0;
		acSum = 0;
		rollSix = 0;
		rollSame = 0;
		maxSum = 0;
	}
	// TODO: Add get methods for the fields.
	public int getRollCount() {
		return rollCount;
	}

	public int getAcSum() {
		return acSum;
	}

	public int getRollSix() {
		return rollSix;
	}

	public int getRollSame() {
		return rollSame;
	}

	public int getMaxSum() {
		return maxSum;
	}
	/**
	 * Rolls the 2 dice.
	 */
	public void roll() {
		// TODO: Roll the 2 dice.
		die1.roll();
		die2.roll();
		int d1 = die1.getFaceValue();
		int d2 = die2.getFaceValue();
		acSum += sum();
		if(d1 == d2){rollSame++;}
		if (d1 == 6) {rollSix++;}
		if (d2 == 6){rollSix++;}
		if (sum()>maxSum){maxSum=sum();}
		rollCount++;
	}

	/**
	 * Returns the sum of the face values in a roll.
	 */
	public int sum() {
		// TODO
		return die1.getFaceValue() + die2.getFaceValue();
	}

	/**
	 * Returns a textual description of the roll of the 2 dice.
	 * Example: Returns "(4,5)" for a roll of 4 and 5.
	 */
	public String rollDescription() {
		// TODO: Use the method: String.format().
		String descript = String.format("(%d,%d)", die1.getFaceValue(), die2.getFaceValue());
		return descript;
	}
}
