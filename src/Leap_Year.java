import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Input value And Create a object of scanner
        System.out.print("Enter Any Year :- ");//print the string value
        int year = scanner.nextInt();   // Int value catch & store

        //If-else condition use
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {//logical operator use by if else
            System.out.print("Year Is Leap Year");//If or True condition ,And String Value Print
        } else {
            System.out.print("Not a Leap Year :- ");//Else or False condition ,And String Value Print
        }

    }
}