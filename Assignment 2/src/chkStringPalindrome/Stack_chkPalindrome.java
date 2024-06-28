package chkStringPalindrome;
import java.util.Scanner;
import java.util.Stack;
//Check whether given string is palindrome or not using Stack.
public class Stack_chkPalindrome {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Stack stack = new Stack();
			System.out.println("Enter a String : ");
			String str = sc.nextLine().toUpperCase();
			
			for (int i = 0; i < str.length(); i++) {
				stack.push(str.charAt(i));
			}
			
			String reverseStr = "";
			
			while(!stack.isEmpty()) {
				reverseStr = reverseStr + stack.pop();
			}
			
			if(str.equals(reverseStr)) {
				System.out.println(str+" is a palindrome !!");
			}else
				System.out.println(str+" is not a palindrome !!");
		}
	}
}
