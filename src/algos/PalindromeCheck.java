package algos;

public class PalindromeCheck {

	private static boolean isPalindrome(String str) {
		char[] reverse = new char[str.length()];
		int count = 0;
		for (int i = str.length()-1; i >= 0; i--) {
			reverse[count] = str.charAt(i);
			count++;
            //System.out.print(str.charAt(i) + " ");
        }
		
		System.out.print("reverse: " + String.valueOf(reverse));
		System.out.println(" ");
		System.out.print("str: " + str);
		System.out.println(" ");
		return String.valueOf(reverse).equals(str);
	}

	public static void main(String[] args) {		
		System.out.println("isPalindrome: " + isPalindrome("abcc"));
	}
}
