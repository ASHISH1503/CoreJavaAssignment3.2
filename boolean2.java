import java.util.Scanner;
public class boolean2 {

	public static void main(String[] args) 

	{
	    Scanner scan = new Scanner(System.in);

	    System.out.println("Enter the first String: ");
	    String S1 = scan.nextLine();

	    System.out.println("Enter the second String: ");
	    String S2 = scan.nextLine();
	    if (same (S1, S2))
	        System.out.println("Strings are same");
	    else
	        System.out.println("Strings are not same");
	}

	public static boolean same (String S1, String S2){
		if (S1.equals(S2))
		{
		    return true;        
		}
		else
		{
		    return false;
		}
	}

}
