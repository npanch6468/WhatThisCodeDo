import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //Variables
        double loan = 0;
        double interest = 0;
        double monthlyPayment = 0;
        double balance = 0;
        int years;

        //taking user input
        System.out.print("Enter the loan amount: ");
        loan = keyboard.nextDouble();

        System.out.print("Enter the interest rate on the loan: ");
        interest = keyboard.nextDouble();

        System.out.print("Enter the term (years) for the loan payment: ");
        years = keyboard.nextInt();

        System.out.print("\n======================================\n");
        keyboard.close();

        //passing parameters into processSomething function
        monthlyPayment = processSomething(loan, interest, years);
        balance = -(monthlyPayment*(years*12));
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", balance);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", monthlyPayment);
}


    public static double processSomething(double loan, double interest, int years) {
        // calculates the monthly payment 
        double rate = (interest/ 100) / 12;
        double base = (loan + rate);
        double months = years* 12;
        double result = 0.0;
        result = ((rate * loan) / (1 - Math.pow(base, -months)));

        return result;
    }
}