import java.util.Scanner;

public class Average_Of_Five_Numbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // Input value And Create a object of scanner
        System.out.print("Enter First Number: ");//print the string value
        int a = scanner.nextInt();// int value input & store

        System.out.print("Enter Second Number: ");//print the string value
        int b = scanner.nextInt();// int value input & store

        System.out.print("Enter Three Number:- ");//print the string value
        int c = scanner.nextInt();// int value input & store

        System.out.print("Enter Four Number:- ");//print the string value
        int d = scanner.nextInt();// int value input & store

        System.out.print("Enter Five Number:- ");//print the string value
        int e = scanner.nextInt();// int value input & store


        System.out.print("Average of five numbers is: " + (a + b + c + d + e) /5 );// String concatenations


    }
}
