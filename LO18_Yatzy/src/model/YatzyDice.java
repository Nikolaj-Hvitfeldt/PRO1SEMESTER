package model;

import java.lang.reflect.Array;
import java.util.Random;

public class YatzyDice {
    // Face values of the 5 dice.
    // 1 <= values[i] <= 6 for i in [0..4]
    private int[] values = new int[5];

    // Number of times the 5 dice have been thrown.
    // 0 <= throwCount <= 3.
    private int throwCount = 1;

    // Random number generator.
    private final Random random = new Random();


    /**
     * Return the 5 face values of the dice.
     */
    public int[] getValues() {
        return values;
    }

    /**
     * Set the 5 face values of the dice.<br/>
     * Pre: 1 <= values[i] <= 6 for i in [0..4].<br/>
     * Note: This method is only to be used in tests.
     */
    void setValues(int[] values) {
        this.values = values;
    }

    /**
     * Return the number of times the 5 dice has been thrown.
     */
    public int getThrowCount() {
        return throwCount;
    }

    /**
     * Reset the throw count.
     */
    public void resetThrowCount() {
        throwCount = 1;
    }

    /**
     * Roll the 5 dice. Only roll dice that are not hold.<br/>
     * Note: holdStatus[i] is true, if die no. i is hold (for i in [0..4]).
     */
    public void throwDice(boolean[] holdStatus) {
        throwCount++;
        for (int i = 0; i < values.length; i++) {
            if (!holdStatus[i]) {
                values[i] = random.nextInt(1, 7);
            }

        }
    }


    // -------------------------------------------------------------------------

    /**
     * Return all results possible with the current face values.<br/>
     * The order of the results is the same as on the score board.<br/>
     * Note: This is an optional method. Comment this method out,<br/>
     * if you don't want use it.
     */
    public int[] getResults() {
        int[] results = new int[15];
        for (int i = 0; i <= 5; i++) {
            results[i] = this.sameValuePoints(i + 1);
        }
        results[6] = this.onePairPoints();
        results[7] = this.twoPairPoints();
        results[8] = this.threeSamePoints();
        results[9] = this.fourSamePoints();
        results[10] = this.fullHousePoints();
        results[11] = this.smallStraightPoints();
        results[12] = this.largeStraightPoints();
        results[13] = this.chancePoints();
        results[14] = this.yatzyPoints();

        return results;
    }

    // -------------------------------------------------------------------------

    // Return an int[7] containing the frequency of face values.
    // Frequency at index v is the number of dice with the face value v, 1 <= v <= 6.
    // Index 0 is not used.
    // Note: This method can be used in several of the following methods.
    private int[] frequency() {
        int[] frequencyArray = new int[7];
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 1) {
                frequencyArray[1]++;
            }
            if (values[i] == 2) {
                frequencyArray[2]++;
            }
            if (values[i] == 3) {
                frequencyArray[3]++;
            }
            if (values[i] == 4) {
                frequencyArray[4]++;
            }
            if (values[i] == 5) {
                frequencyArray[5]++;
            }
            if (values[i] == 6) {
                frequencyArray[6]++;
            }
        }

        return frequencyArray;
    }

    /**
     * Return same-value points for the given face value.<br/>
     * Returns 0, if no dice has the given face value.<br/>
     * Pre: 1 <= value <= 6;
     */
    public int sameValuePoints(int value) {
        int[] freq = frequency();
        int sum = freq[value] * value;
        return sum;
    }

    /**
     * Return points for one pair (for the face value giving the highest points).<br/>
     * Return 0, if there aren't 2 dice with the same face value.
     */
    public int onePairPoints() {
        int[] freq = frequency();
        int sum = 0;
        for (int i = 6; i > 0; i--) {
            if (freq[i] >= 2) {
                sum = i * 2;
                return sum;
            }
        }
        return 0;
    }

    /**
     * Return points for two pairs<br/>
     * (for the 2 face values giving the highest points).<br/>
     * Return 0, if there aren't 2 dice with the same face value<br/>
     * and 2 other dice with the same but different face value.
     */
    public int twoPairPoints() {
        int[] freq = frequency();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 6; i > 0; i--) {
            if (freq[i] >= 2) {
                if (sum1 == 0)
                    sum1 = i * 2;
                else {
                    sum2 = i * 2;
                }
            }
        }
        if (sum1 != 0 && sum2 != 0) {
            return sum1 + sum2;
        }
            return 0;
        }


    /**
     * Return points for 3 of a kind.<br/>
     * Return 0, if there aren't 3 dice with the same face value.
     */
    public int threeSamePoints() {
        int[] freq = frequency();
        int sum = 0;
        for (int i = 6; i > 0; i--) {
            if (freq[i] >= 3) {
                sum = i * 3;
                return sum;
            }
        }
        return 0;
    }


    /**
     * Return points for 4 of a kind.<br/>
     * Return 0, if there aren't 4 dice with the same face value.
     */
    public int fourSamePoints() {
        int[] freq = frequency();
        int sum = 0;
        for (int i = 6; i > 0; i--) {
            if (freq[i] >= 4) {
                sum = i * 4;
                return sum;
            }
        }
        return 0;
    }


    /**
     * Return points for full house.<br/>
     * Return 0, if there aren't 3 dice with the same face value<br/>
     * and 2 other dice with the same but different face value.
     */
    public int fullHousePoints() {
        int[] freq = frequency();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 6; i > 0; i--) {
            if (freq[i] == 3) {
                if (sum1 == 0)
                    sum1 = i * 3;
            }
            if (freq[i] == 2) {
                sum2 = i * 2;
            }
        }
        if (sum1 != 0 && sum2 != 0) {
            return sum1 + sum2;
        }
            return 0;
        }


    /**
     * Return points for small straight.<br/>
     * Return 0, if the dice aren't showing 1,2,3,4,5.
     */
    public int smallStraightPoints() {
        int[] freq = frequency();
        int sum = 0;
        for (int i = 6; i > 0; i--) {
            if (freq[1] == 1 && freq[2] == 1 && freq[3] == 1 && freq[4] == 1 && freq[5] == 1) {
                sum = 15;
                return sum;
            }
        }
        return 0;
    }


    /**
     * Return points for large straight.<br/>
     * Return 0, if the dice aren't showing 2,3,4,5,6.
     */
    public int largeStraightPoints() {
        int[] freq = frequency();
        int sum = 0;
        for (int i = 6; i > 0; i--) {
            if (freq[2] == 1 && freq[3] == 1 && freq[4] == 1 && freq[5] == 1 && freq[6] == 1) {
                sum = 20;
                return sum;
            }
        }
        return 0;
    }

    /**
     * Return points for chance (the sum of face values).
     */
    public int chancePoints() {
        int points = 0;
        for (int face : values) {
            points += face;
        }
        return points;
    }

    /**
     * Return points for yatzy (50 points).<br/>
     * Return 0, if there aren't 5 dice with the same face value.
     */
    public int yatzyPoints() {
        int[] freq = frequency();
        int sum = 0;
        for (int i = 6; i > 0; i--) {
            if (freq[i] == 5) {
                sum = 50;
                return sum;
            }
        }
        return 0;
    }
}
