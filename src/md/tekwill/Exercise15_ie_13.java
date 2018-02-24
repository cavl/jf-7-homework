package md.tekwill;

public class Exercise15_ie_13 {

    public static void main(String[] args) {

       int year = 2018;
       int a    = year % 19;
       int b    = year % 4;
       int c    = year % 7;
       int d    = (19 * a + 15) % 30;
       int e    = (2 * b + 4 * c + 6 * d +6) % 7;
       int f    = d + e;

       int day      = f <= 9 ? 22 + f : f - 9;
       int month    = f <= 9 ? 3 : 4;

        System.out.println("day = " + day + ", month = " + month + ", year = " + year);
        /*
        * Use Gauss algorithm to determine the easter for 2018 in the JULIAN calendar.
        *
        * https://en.wikipedia.org/wiki/Computus
        *
        * Output day=26, month=3, year=2018
        * */
    }
}
