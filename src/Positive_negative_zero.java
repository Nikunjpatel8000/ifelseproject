import java.util.Scanner;

public class Positive_negative_zero {

    public static void main(String [] args)
    {

        Scanner scanner = new Scanner(System.in); // Input value And Create a object of scanner
        System.out.print("Enter The Number :- ");//print the string value
        int x = scanner.nextInt();// Int value catch & store

        //if-else-if ladder condition number positive,negative or zero!!

        if  (x > 0) //if or true condition
        {
            System.out.print("Number Is Positive :- " + x);  // String concatenations
        }
        else if ( x < 0) // else if or true condition
        {
            System.out.print("Number Is Negative :- " + x);  // String concatenations
        }
        else
        {     //else or false condition
            System.out.print("Number Is Zero :- " + x);  // String concatenations
        }
    }
}
