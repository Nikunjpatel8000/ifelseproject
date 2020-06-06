import java.util.Scanner;

public class Day_Name {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Input value And Create a object of scanner
        System.out.print("Enter 1 To 7 Number :- ");//print the string value
        char a = scanner.next().charAt(0);// Char value catch & store
        String day;

        //if else condition!
        if (a == '1')
        {
            day = "Monday";//press 1 to day name print
            System.out.print("Day Name is  = " + day);// String concatenations
        } else if (a == '2')
        {
            day = "Tuesday";//press 1 to day name print
            System.out.print("Day Name is  = " + day);// String concatenations
        } else if (a == '3')
        {
            day = "Wednesday";//press 1 to day name print
            System.out.print("Day Name is = " + day);// String concatenations
        } else if (a == '4') //i
        {
            day = "Thursday";//press 1 to day name print
            System.out.print("Day Name is  = " + day);// String concatenations

        } else if (a == '5')
        {
            day = "Friday";//press 1 to day name print
            System.out.print("Day Name is  = " + day);// String concatenations

        } else if (a == '6')
        {
            day = "saturday";//press 1 to day name print
            System.out.print("Day Name is  = " + day);// String concatenations

        } else if (a == '7')
        {
            day = "Sunday";//press 1 to day name print
            System.out.print("Day Name is  = " + day);// String concatenations

        }  else {
            System.out.print("Invalid Entry!!!");//else or false condition ,And String Value Print
        }


    }

}
