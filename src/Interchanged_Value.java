import java.util.Scanner;

public class Interchanged_Value {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Enter The First Value :- ");//print the string value
        int a = scanner.nextInt(); // Int value catch & store
        System.out.print("Enter The Second Value :- ");//print the string value
        int b = scanner.nextInt(); // Int value catch & store
        int c;

        System.out.print("Before Interchanged Value: "+a +" & "+ b); // String concatenations
        c = a;//Interchanged Value
        a = b;//Interchanged Value
        b = c;//Interchanged Value

         System.out.print("After Value Is Interchanged :- " + a +" & "+b); // String concatenations




    }

}
