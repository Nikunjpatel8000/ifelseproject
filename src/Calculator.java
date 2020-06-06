import java.util.Scanner;
public class Calculator {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in); // Input value And Create a object of scanner

        System.out.print("Enter First Number : "); //print the string value
        int a = scan.nextInt(); // Int value catch & store

        System.out.print("Enter Second Number : ");//print the string value
        int b = scan.nextInt(); // Int value catch & store

        System.out.print("Enter The Symbol (+, -, *, /) : ");//print the string value
        char c = scan.next().charAt(0); // Char value catch & store

        int total;
        if(c == '/')//if else condition!
        {
           total = a / b; //Division of a & b
            System.out.print("Total is  = " +total); // String concatenations
        }
        else if(c == '*')
        {
            total = a * b;//Multiplication of a & b
            System.out.print("Total is  = " +total);// String concatenations
        }
        else if(c == '+')
        {
            total = a + b;//Addition of a & b
            System.out.print("Total is  = " +total);// String concatenations
        }
        else if(c == '-')
        {
            total = a - b;//Subtractions of a & b
            System.out.print("Total is  = " +total);// String concatenations
        }
        else
        {
            System.out.print("Wrong Symbol Enter  !!!");//else or false condition ,And String Value Print
        }

    }
}
