import java.util.Locale;
import java.util.Scanner;

public class CuriousSwitch {
    public static void main(String[] args) {

        Scanner userGreet = new Scanner(System.in);

        //if-else statements are great for making checks and proceeding differently
        //depending upon the result of the check

        //we can achieve similar results with a switch statement
        //switch statements check a single value against multiple cases to find a match or not

        //syntax is
        //switch (is a keyword)
        //parenthesis (expression)
        //      the expression is the value we will check can be a variable or literal
        //case (is a keyword)
        //value_for_case:
        //      this value is checked against the expression
        //statements to happen if the expression matches the case
        //break; (is a keyword which leaves the switch
        //default; (keyword and case to run if
        //          no other match is found

        System.out.println("Enter \"hello\" in a " + "language of your choice");

        String greeting = userGreet.nextLine();

        //we are going to forget the keyword break to see what happens when it is not included
        //we will end up "falling through" multiple cases

        switch(greeting.toLowerCase()) {
            case "bonjour":
                System.out.println("Hello in French");
            case "hola":
                System.out.println("Hello in Spanish");
                System.out.println("Uh oh we fell through the case from above because of no break");

                break;
            default:
                System.out.println("Sorry did not recognize your language");
        }//end of switch

        System.out.println("Enter \"hello\" in a " + "language of your choice");

        greeting = userGreet.nextLine();

        //we can test multiple cases and display the same results if any of the cases are a match

        switch(greeting.toLowerCase()) {
            case "bonjour":
                System.out.println("Hello in French");
                break;

            case "hola":
                System.out.println("Hello in Spanish");
                break;

            case "ni hao":
                System.out.println("Hello in Chinese");
                break;

            case "chao":
            case "salve":
                System.out.println("Hello in Italian");
                break;

            case "oi":
                System.out.println("Hello in Portuguese");
                break;

            case "konnichiwa":
                System.out.println("Hello in Japanese");
                break;

            default:
                System.out.println("Sorry did not recognize your language");
        }//end of switch

        System.out.println("Enter \\\"hello\\\" in a \" + \"language of your choice");
        greeting = userGreet.nextLine();

        if("hola".equalsIgnoreCase(greeting)) {

            System.out.println("Hello in Spanish");

        } else if ("ni hao".equalsIgnoreCase(greeting)) {

            System.out.println("Hello in Chinese");

        } else if ("salve".equalsIgnoreCase(greeting) || "chao".equalsIgnoreCase(greeting)) {

            System.out.println("Hello in Italian");

        } else if ("konnichiwa".equalsIgnoreCase(greeting)) {

            System.out.println("Hello in Japanese");

        } else if ("bonjour".equalsIgnoreCase(greeting)) {

            System.out.println("Hello in French");

        } else if ("oi".equalsIgnoreCase(greeting)) {

            System.out.println("Hello in Portuguese");

        } else {
            System.out.println("Sorry did not recognize your language");
        }

    }//end of main method
}//end of class
