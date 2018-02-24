package md.tekwill;

public class Exercise14 {

    public static void main(String[] args) {
        String names = "Alexei,Andrei,Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad";

        StringBuilder stringBuilder = new StringBuilder(names);

        stringBuilder.insert(stringBuilder.lastIndexOf("Luca")+5,"Mihai,");

        System.out.println(stringBuilder);
       /*
       * Use JDK documentation for StringBuilder class and find the method that
       * would help you insert 'Mihai' after 'Luca' in the comma separated names list.
       * Output: "Alexei,Andrei,Eugen,Jana,Luca,Mihai,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad"
       * */
    }
}
