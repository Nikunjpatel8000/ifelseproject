import java.util.Scanner;

public class Vowel_Or_Consonan {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Input an alphabet: ");// String value print
        String input = a.next().toLowerCase();// String value catch & store

        //boolean datatype use and logical or operator use
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
        //If else condition use for Vowel And Consonant alphabet.
        if (vowels)//else or false condition ,And String Value Print
        {
            System.out.print("Input letter is Vowel");// String value print
        } else//else or false condition ,And String Value Print
        {    //vowels letter print
            System.out.print("Input letter is Consonant");// String value print
        }
    }
}
