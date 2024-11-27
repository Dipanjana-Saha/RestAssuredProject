//Question 18: Write a Java Program to print the maximum consecutive ones in a given array.
public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 1, 1, 0, 1, 1, 8, 9, 1, 1, 1, 1};
		int r=prog(arr);
		System.out.println(r);

	}
	public static int prog(int[] a) {
		int maxCount=0;
		int current=0;
		for(int n:a) {
			if(n==1) {
				current+=1;
				maxCount=Math.max(maxCount, current);//2,3=3
			}else {
				current=0;
			}
		}
		return maxCount;
	}

}


/*
public class MaxConsecutiveAnyNumber {

    public static void main(String[] args) {
        // Example input array
        int[] arr = {0, 1, 1, 1, 0, 1, 1, 8, 9, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2};
        
        // Find and print the maximum number of consecutive occurrences of any number
        int maxConsecutiveCount = findMaxConsecutiveCount(arr);
        System.out.println("Maximum consecutive count: " + maxConsecutiveCount);
    }

    public static int findMaxConsecutiveCount(int[] nums) {
        // Initialize variables
        int maxCount = 0; // To keep track of the maximum consecutive count
        int currentCount = 1; // To count the current streak of occurrences
        int currentNum = nums[0]; // To track the current number being counted

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == currentNum) {
                currentCount++; // Increment current streak count
            } else {
                // Update maxCount if current streak is longer
                maxCount = Math.max(maxCount, currentCount);
                // Reset currentCount for the new number
                currentNum = nums[i];
                currentCount = 1;
            }
        }
        
        // Final check to ensure the last streak is considered
        maxCount = Math.max(maxCount, currentCount);

        return maxCount;
    }
}
*/
