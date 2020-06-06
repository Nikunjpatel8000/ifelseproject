import java.util.Scanner;

public class Eligible_To_Vote {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("enter his/her age :- ");//print the string value
        int a = scanner.nextInt();// Int value catch & store

        //if else condition for vote eligible or not!
        if (a >= 18)
        {
            System.out.print("You Are Eligible For Vote."); //if or true condition ,And String Value Print
        } else
        {
            System.out.print("You Are Not Eligible For Vote."); //else or false condition ,And String Value Print
        }

    }

}
