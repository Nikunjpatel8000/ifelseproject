import java.util.Scanner;

public class Uppercase_To_Lowercase {


    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Please Enter Your Name(Capital Letter):- ");// String value print
        String a = scanner.nextLine();//String value catch and store


        //Convert to LowerCase
        System.out.print(a.toLowerCase());

    }


}
