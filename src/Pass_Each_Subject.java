import java.util.Scanner;

public class Pass_Each_Subject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Create a object of scanner
        System.out.print("Please Enter Student Name :- ");//print the string value
        String name = scanner.nextLine();// String value input & store

        System.out.print("Please Enter Roll Number :- ");//print the string value
        int roll = scanner.nextInt();// int value input & store

        System.out.print("Please Enter Your Maths Marks :- ");//print the string value
        int maths = scanner.nextInt();// int value input & store

        System.out.print("Please Enter Your English Marks :- ");//print the string value
        int eng = scanner.nextInt();// int value input & store

        System.out.print("Please Enter Your Science Marks :- ");//print the string value
        int sci = scanner.nextInt();// int value input & store

        int total = maths + eng + sci;//total of three subject
        float percentage = (float) total / 300 * 100;//datatype is float,And percentage of three subject


        System.out.print("Please Enter Student Name = " + name);// String concatenations
        System.out.print("Please Enter Roll Number = " + roll);// String concatenations
        System.out.print("Maths Marks Is = " + maths);// String concatenations
        System.out.print("English Marks Is = " + eng);// String concatenations
        System.out.print("Science MArks Is = " + sci);// String concatenations

        //if else condition!
        if (maths >= 35)//if or true condition ,And String Value Print
        {
            System.out.print("Pass Mark Is = " + maths);// String concatenations

        } else//else or false condition ,And String Value Print
        {
            System.out.print("Fail Mark Is = " + maths);// String concatenations
        }
        if (eng >= 35)//if or true condition ,And String Value Print
        {
            System.out.print("Pass Mark Is = " + eng);// String concatenations

        } else//else or false condition ,And String Value Print
        {
            System.out.print("Fail Mark Is =  " + eng);// String concatenations
        }
        if (sci >= 35) //if or true condition ,And String Value Print
        {
            System.out.print("Pass Mark Is = " + sci);// String concatenations

        } else//else or false condition ,And String Value Print
        {
            System.out.print("Fail Mark Is =  " + sci);// String concatenations
        }

        if ((maths >= 35) && (eng >= 35) && (sci >= 35)) {

            System.out.print("Students Pass In All Subject ");// String concatenations

            if (percentage < 35) { //if or true condition ,And String Value Print
                System.out.print("Fail");//String Value Print

            } else if (percentage >= 35 && percentage < 50) {//if or true condition ,And String Value Print
                System.out.print("C grade");//String Value Print

            } else if (percentage >= 50 && percentage < 60) {//if or true condition ,And String Value Print
                System.out.print("B grade");//String Value Print

            } else if (percentage >= 60 && percentage < 80) {//if or true condition ,And String Value Print
                System.out.print("A grade");//String Value Print

            } else if (percentage >= 80 && percentage < 100) {//if or true condition String Value Print
                System.out.print("A+ grade");//String Value Print

            } else {
                System.out.print("Invalid entry");//if or false condition ,And String Value Print
            }

        } else {

            System.out.print("Student Is Fail !!!");// String concatenations
        }
        System.out.print("Total Marks = " + total);// String concatenations
        System.out.print("percentage = " + percentage);// String concatenations

    }


}


