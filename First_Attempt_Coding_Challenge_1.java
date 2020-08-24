// First-Attempt-Coding-Challenge-1
/*
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given[10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * Bonus: Can you do this in one pass ?
*/
 
public class First_Attempt_Coding_Challenge_1 {

static void twoIndexesEqualValue(int matchValue, int arrayOfNumbers[]) {
	
	boolean itEquals = false;
	
	for(int i = 0; i < arrayOfNumbers.length; i++)
	{
		for (int j = 0; j < arrayOfNumbers.length - 1; j++) 
		{
			if (arrayOfNumbers[i] + arrayOfNumbers[j + 1] == matchValue) 
			{
				itEquals = true;
			}
		}

	}

	if(itEquals)
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}

}
	public static void main(String[] args) {
		
		int arrayOfNumbers[] = {10,15,3,7};
		int matchValue= 17;
		twoIndexesEqualValue(matchValue, arrayOfNumbers);
		
		matchValue = 21;
		twoIndexesEqualValue(matchValue, arrayOfNumbers);
		
		matchValue = 13;
		twoIndexesEqualValue(matchValue, arrayOfNumbers);
		
		matchValue = 12;
		twoIndexesEqualValue(matchValue, arrayOfNumbers);
		
		matchValue = 10;
		twoIndexesEqualValue(matchValue, arrayOfNumbers);
		
		matchValue = 7;
		twoIndexesEqualValue(matchValue, arrayOfNumbers);
	}

}

