import java.util.Scanner;

public class Sales_Commission {
    public static void main(String[] args) {


        double CommissionRate, TotalSales, Commission; //Local Variables

        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Enter Sales_Td :- ");//print the string value
        int eId = scanner.nextInt();// int value catch & store

        System.out.print("Enter Employee_Name :- ");//print the string value
        String name = scanner.next();// String value catch & store

        System.out.print("Enter Salary Basic :- ");//print the string value
        int sBasic = scanner.nextInt();// int value catch & store

        System.out.print("Enter Sales Amount:- ");//print the string value
        TotalSales = scanner.nextDouble();// double value catch & store


        System.out.print("Employee_ID Is = " + eId);// String concatenations
        System.out.print("Employee_Name Is = " + name);// String concatenations
        System.out.print("Employee Basic_Salary Is = " + sBasic);// String concatenations
        System.out.print("Sales Amount Is = " + TotalSales);// String concatenations

        //If-Else-If Condition on Total sales commission.
        if (TotalSales >= 50000)
            CommissionRate = 0.35;

        else if (TotalSales >= 30000)
            CommissionRate = 0.2;

        else if (TotalSales >= 20000)
            CommissionRate = 0.1;

        else if (TotalSales >= 10000)
            CommissionRate = 0.05;

        else if (TotalSales < 1000)
            CommissionRate = 0.02;

        else
            CommissionRate = 0.00;

        Commission = CommissionRate * TotalSales;//Commission find by percentage.

        System.out.print("Commission Is = " + Commission);// String concatenations
    }

}




