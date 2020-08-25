// First-Attempt-Coding-Challenge-2
/*
 *Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 *For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *Follow-up: what if you can't use division?
*/
public class First_Attempt_Coding_Challenge_2 {

	static void productArray(int arrayOfNumbers[]) {
		int x;
		int newArrayOfNumbers[] = new int [arrayOfNumbers.length];
		for(int i = 0; i < arrayOfNumbers.length; i++) {
			x = arrayOfNumbers[0];
			for (int j = 0; j < arrayOfNumbers.length-1; j++) 
			{
				x *= arrayOfNumbers[j + 1]; 
			}
			
			newArrayOfNumbers[i] = x/arrayOfNumbers[i];
			System.out.println(newArrayOfNumbers[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int arrayOfNumbers[] = {1,2,3,4,5}; 
		productArray(arrayOfNumbers); //Expected: 120,60,40,30,24
		
		int arrayOfNumbersTwo[] = {3,2,1};
		productArray(arrayOfNumbersTwo); //Expected: 2,3,6
		
		int arrayOfNumbersThree[] = {4,10,1,8}; //Expected: 80,32,320,40
		productArray(arrayOfNumbersThree);
	}

}
