import java.util.*;
public class StrManipulation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1:");
		String str1 = sc.nextLine();
		System.out.println("Enter the String2:");
		String str2 = sc.nextLine();
		System.out.println("The String concat is"+str1.concat(str2));
		System.out.println("The String length is"+str1.length());
		System.out.println("The String length is"+str2.length());
		if(str1.length()==str2.length())
		{
			System.out.println("String are same");
			
		}
		else
		{
			System.out.println("String are not same");
		}
		System.out.println("String are same:"+str1.equals(str2));
		System.out.println("String compare Uppercase:"+str1.toUpperCase());
		System.out.println("String compare Lowercase:"+str1.toLowerCase());
		System.out.println("The substring of s1"+str1.substring(3));
	}
}
