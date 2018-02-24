package md.tekwill;

public class Exercise1 {

    public static void main(String[] args) {
	 String alice = "Alice";
	 String bob = "Bob";

	int compareValue = alice.compareTo(bob);
	if (compareValue < 0)
        System.out.println("Lexicographically precede string is " + bob);
	else if (compareValue > 0)
        System.out.println("Lexicographically precede string is " + alice);
	else
	    System.out.println("Strings are lexicographically equal");

	 /* Use JDK documentation for String and find a method that
	  would help you determine which of the strings above lexicographically
	  precede the second and print that string.
	  */
    }
}
