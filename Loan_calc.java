package Loancheck;

import java.util.Scanner;

public class Loan_calc {
    public static void main(String[] args) {
        int requiredsalary = 30000;
        int requiredyears = 2;

        System.out.println("Please enter your salary amount");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Please enter the number of years employed");
        double years = scanner.nextDouble();
        scanner.close();

        if (salary>= requiredsalary){
            if (years >= requiredyears){
                System.out.println("Congrats!! you are Qualified for the loan");
            } else {
                System.out.println("you  should have been employed at least " + requiredyears +"years");
            } }
			else {
                System.out.println("you're minum salay amount should be" + requiredsalary + "dollars");
            }


    }}
