import java.util.Scanner;

public class Alphabet_Or_Symbol {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Input value And Create a object of scanner
        System.out.print("Enter any value :-");//print the string value
        char c = scanner.next().charAt(0); // char value catch & store

        //if else condition!
        if(c >= 65 && c <= 122){ //if or true condition ,And String Value Print
            System.out.print("Enter Value is Alphabets = " + c);}// String concatenations

        else if(c >= 48 && c <= 57){ //else if or true condition ,And String Value Print
            System.out.print("Enter Value is Number = " + c);}// String concatenations

        else{ //else or false condition ,And String Value Print
            System.out.print("Enter Value is Symbol = " + c);}// String concatenations
    }

}
