import java.util.Scanner;

public class Odd_Even {

    public static void main(String[] args) {

         //Create a object of scanner
        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Please enter any number : "); //print the string value

        // int value input
        int number = scanner.nextInt();// Int value catch & store

        String oddEven = (number % 2 == 0) ? " even " : " odd ";  //  odd or even find by ternary operator

        System.out.print("Number is " + number + oddEven);   // String concatenations
    }
}
