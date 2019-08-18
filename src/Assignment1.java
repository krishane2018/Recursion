public class Assignment1 {

	public static int c(int n, int k) {
		if (k < 0) {
			System.out.println("Invalid input"); //Checks for invalid input
			return -1;
		}
		if (k == 0) {									//base cases
			System.out.printf("c(%d,%d) = 1%n", n, k);
			return 1;
		} else if (k == n) {
			System.out.printf("c(%d,%d) = 1%n", n, k);
			return 1;
		} else if (k > n) {
			System.out.printf("c(%d,%d) = 0%n", n, k);
			return 0;
		} else {							//recursively runs function till base cases are reached
			System.out.printf("c(%d,%d) = c(%d,%d) + c(%d,%d)%n", n, k, n - 1, k - 1, n - 1, k);
			return c(n - 1, k - 1) + c(n - 1, k);
		}

	}

	public static int P(int n) {
		if (n < 1) {							//Checks for invalid input
			System.out.println("Invalid input");
			return -1;
		} else if (n == 1) {					// base cases
			return 2;
		} else if (n == 2) {
			return 3;
		} else {							//recursively runs function till base cases are reached
			return P(n - 1) + P(n - 2);
		}
	}

	public static void writeLine(char ch, int n) {
		if (n == 0) {
			return;
		} else {					//recursively calls function to print character until number of
			System.out.print(ch);	//characters is reached
			writeLine(ch, n - 1);
		}
	}

	public static void writeBlock(char ch, int n, int m) {
		if (m == 0) {
			return;
		} else {					//recursively calls function to print lines of characters until 
			writeLine(ch, n);		//number of lines is reached
			System.out.println("");
			writeBlock(ch, n, m - 1);
		}
	}

	public static void reverseDigits(int number) {
		String strNumber = String.valueOf(number);					//turns number into string
		System.out.print(strNumber.charAt(strNumber.length() - 1));	//and prints last number of 
		if (strNumber.length() == 1) {								//string and removes it till 
			return;													//only 1 number is left
		}
		strNumber = strNumber.substring(0, strNumber.length() - 1);
		reverseDigits(Integer.valueOf(strNumber));
	}

	public static int myBinarySearch(String[] anArray, int first, int last, String value) {
		int index;
		if (first > last) {		//case where element is not in array
			index = -1;
		} else {							//recursively halves search till element is found at the
			int mid = (first + last) / 2;	// "mid" index and returns the index
			if (value.compareTo(anArray[mid]) == 0) {
				index = mid;
			} else if (value.compareTo(anArray[mid]) < 0) {
				index = myBinarySearch(anArray, first, mid - 1, value);
			} else {
				index = myBinarySearch(anArray, mid + 1, last, value);
			}
		}
		return index;
	}
	
}
