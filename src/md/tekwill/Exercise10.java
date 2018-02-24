package md.tekwill;

public class Exercise10 {

    public static void main(String[] args) {
        String names        = "Alexei,Andrei,Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad";
        String firstName    = "Alexei";
        String secondName   = "Ion";

        if (names.startsWith(firstName))
            System.out.println("Variable value starts with Alexei");
        else
            System.out.println("Variable value doesn't start with Alexei");

        if (names.endsWith(secondName))
            System.out.println("Variable value ends with Ion");
        else
            System.out.println("Variable value doesn't end with Ion");
        /* Use JDK documentation for String class and find the methods that
	  would help you check whether names variable starts with 'Alexei' and doesn't end with 'Ion'

	  Output print:
	  'Variable value starts with Alexei'
	  'Variable value doesn't end with Ion'
	  */
    }
}
