package md.tekwill;

public class Exercise2 {

    public static void main(String[] args) {
        String abracadabra = "abracadabra";

        int starIndex = 0;

        while(abracadabra.indexOf("a",starIndex) != -1)
        {
            System.out.println(abracadabra.indexOf("a",starIndex));
            starIndex = abracadabra.indexOf("a",starIndex)+1;
        }
	 /* Use JDK documentation for String class and find a method that
	  would help you determine all the indexes of the letter 'a' in abracadabra.
	  Output: Print all letter 'a' indexes on a separate line.
	  */
    }
}
