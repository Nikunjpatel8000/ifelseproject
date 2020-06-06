import java.util.Scanner;

public class Gross_Salary {

    public static void main(String[] args) {

        float da, hra, ta, pf, gSalary;//Local Variables

        Scanner scanner = new Scanner(System.in); // Input value And Create a object of scanner
        System.out.print("Enter Employee_ID :- ");//print the string value
        int id = scanner.nextInt();// int value catch & store

        System.out.print("Enter Employee_Name :- ");//print the string value
        String name = scanner.next();// String value catch & store

        System.out.print("Enter Gross_Salary :- ");//print the string value
        float bSalary = scanner.nextFloat();// float value catch & store

        hra = (bSalary * 10) / 100;//hra, 10% of Basic salary
        da = (bSalary * 8) / 100;//da 8% of Basic Salary
        ta = (bSalary * 9) / 100;//ta, 9% of Basic salary
        pf = (bSalary * 20) / 100;//pf 20% of Basic salary

        gSalary = bSalary + hra + ta - (da + pf);//Gross Salary of Employee

        System.out.print("Employee_ID Is :- " + id);// String concatenations
        System.out.print("Employee_Name :- " + name);// String concatenations
        System.out.print("Gross_Salary Is :- " + gSalary);// String concatenations
    }

}
