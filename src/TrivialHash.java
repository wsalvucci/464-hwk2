import java.util.Random;

public class TrivialHash {

    private final static int MAX = 1000;
    private static boolean[][] hash = new boolean[MAX+1][2];

    private static boolean search(int target) {
    	// Return the value of the index target of the hash
    	if (target < 0)
    		return hash[Math.abs(target)][1];
    	else
    		return hash[target][0];
        // Implement search(), return true if found - needs to be of O(1) complexity
    }

    private static void insert(int[] a, int n){
    	/*
    	 * If n is negative, set the 1st index of the index absolute value of it in the
    	 * hash to true. If positive or 0, set the 2nd index to true
    	 */
        if (n < 0)
        	hash[Math.abs(n)][1] = true;
        else
            hash[n][0] = true;
    }

    // Driver code -------- no need to touch
    public static void main(String[] args) {
        int[] testArr = new int[10];
        Random random = new Random();
        for (int i = 0; i < testArr.length; i++)
            testArr[i] = random.nextInt(25 + 1 + 25) - 25;
        insert(testArr, testArr.length);
        if (search(testArr[2]))
            System.out.println("Value exists.");
        else
            System.out.println("Value doesn't exist");
    }
}
