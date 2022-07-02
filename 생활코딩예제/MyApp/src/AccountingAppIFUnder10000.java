import java.util.Scanner;

public class AccountingAppIFUnder10000 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valueOfSupply = sc.nextDouble();
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double dividend1 = income * 1;
        double dividend2 = income * 0;
        double dividend3 = income * 0;

        System.out.println("Value of Supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);
    }
}
