package md.tekwill;

public class Exercise7 {

    public static void main(String[] args) {
        String names = "Alexei,Andrei,Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad";

        int beginIndex  = names.indexOf("Eugen");
        int endIndex    = names.indexOf("Victor");

        System.out.println(names.substring(beginIndex,endIndex));
	 /* Use JDK documentation for String class and find a method that
	  would help you identify the position of word 'Eugen' and 'Victor' in the names string.

	  Then find another method that would help you print the string from between those positions.
	  Expected output: "Eugen,Jana,Luca,Olea,Serghei,Sergiu,"
	  */
    }
}
