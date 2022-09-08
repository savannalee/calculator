//Savanna Lee
//Period 3

import java.util.*;

public class calculator {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Welcome to Savanna Lee's calculator!");
        boolean run_calc = true;
        while (run_calc) {
            System.out.println("Which operation would you like to perform? Please choose a number.");
            System.out.println("1. addition \n2. subtraction \n3. multiplication \n4. division");
            int num;
            num = a.nextInt();
            a.nextLine();

            if (num == 1) {
                System.out.println("Please enter your first number: ");
                int x = a.nextInt();
                a.nextLine();
                System.out.println("Please enter your second number: ");
                int y = a.nextInt();
                a.nextLine();
                int add = x + y;
                System.out.println(x + " + " + y + " = " + add);
                System.out.println(" ");
                System.out.println("Do you want to use the calculator again? (Yes/No)");
                String yn = a.nextLine();
                    if (yn.equals("no"))
                        run_calc = false;
        }
        if (num == 2) {
            System.out.println("Please enter your first number: ");
            int x = a.nextInt();
            a.nextLine();
            System.out.println("Please enter your second number: ");
            int y = a.nextInt();
            a.nextLine();
            int subtract = x - y;
            System.out.println(x + " - " + y + " = " + subtract);
            System.out.println(" ");
            System.out.println("Do you want to use the calculator again? (Yes/No)");
            String yn = a.nextLine();
            if (yn.equals("no"))
                run_calc = false;
        }
        if (num == 3) {
            System.out.println("Please enter your first number: ");
            int x = a.nextInt();
            a.nextLine();
            System.out.println("Please enter your second number: ");
            int y = a.nextInt();
            a.nextLine();
            int multiply = x*y;
            System.out.println(x + " * " + y + " = " + multiply);
            System.out.println(" ");
            System.out.println("Do you want to use the calculator again? (Yes/No)");
            String yn = a.nextLine();
            if (yn.equals("no"))
                run_calc = false;
        }
            if (num == 4) {
                System.out.println("Please enter your first number: ");
                int x = a.nextInt();
                a.nextLine();
                System.out.println("Please enter your second number: ");
                int y = a.nextInt();
                a.nextLine();
                System.out.println("Would you like to (enter number 1-2): \n1. get the decimal answer \n2. get remainder");
                int remdec = a.nextInt();
                a.nextLine();
                if (remdec == 1) {
                    double nx = x;
                    double ny = y;
                    double divide = nx/ny;
                    System.out.println("The quotient is " + divide);
                }
                else if (remdec == 2) {
                    int divide = x/y;
                    System.out.println("The quotient is " + divide + " with remainder " + (x%y));
                }
                else {
                    System.out.println("Invalid input.");
                }
                System.out.println(" ");
                System.out.println("Do you want to use the calculator again? (Yes/No)");
                String yn = a.nextLine();
                if (yn.equals("no"))
                    run_calc = false; }

            if (num > 4) {
                System.out.println("Invalid selection! Enter a number from 1 to 4.");
            }
        }}}










