import java.util.Scanner;

public class A_to_F_City_Name {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Enter A To F Capital Letters To City Name :-");//print the string value
        char a = scanner.next().charAt(0); // Char value catch & store
        String cname;

        //if else condition!
        if (a == 'A') //i
        {
            cname = "Ahmedabad";//City name
            System.out.print("City Name is  = " + cname);// String concatenations
        } else if (a == 'B')
        {
            cname = "Bhavnagar";//City name
            System.out.print("City Name is  = " + cname);// String concatenations
        } else if (a == 'C')
        {
            cname = "Chhota Udaipur";//City name
            System.out.print("City Name is = " + cname);// String concatenations
        } else if (a == 'D')
        {
            cname = "Diu";//City name
            System.out.print("City Name is  = " + cname);// String concatenations

        } else if (a == 'E')
        {
            cname = "E City";//City name
            System.out.print("City Name is  = " + cname);// String concatenations

        } else if (a == 'F')
        {
            cname = "Face City";//City name
            System.out.print("City Name is  = " + cname);// String concatenations

        } else {
            System.out.print("invalid entry !!!");//else or false condition ,And String Value Print
        }


    }

}
