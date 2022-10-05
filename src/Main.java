import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Initial Variables
        double totalBill;
        int people, tipPercent;
        String border = "||";

        //User Input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Total Bill: ");
        totalBill = input.nextDouble();
        System.out.println("Enter Tip Percent: ");
        tipPercent = input.nextInt();
        System.out.println("Enter Number Of People: ");
        people = input.nextInt();

        //Calculated Values
        double totalTip = (((tipPercent * 0.01)*totalBill*100)-((tipPercent * 0.01)*totalBill*100)%1)/100;
        double totalBillAndTip = totalTip + totalBill;
        double tipPerPerson = (totalTip/people*100-(totalTip/people*100)%1)/100;
        double billPerPerson = (totalBillAndTip/people*100-(totalBillAndTip/people*100)%1)/100;

        //OutPut
        System.out.print(border);
        System.out.print("Total Tip: " + totalTip);
        System.out.println(border);
        System.out.print(border);
        System.out.print("Total Bill With Tip: " + totalBillAndTip);
        System.out.println(border);
        System.out.print(border);
        System.out.print("Tip Per Person: " + tipPerPerson);
        System.out.println(border);
        System.out.print(border);
        System.out.print("Total Bill Per Person: " + billPerPerson);
        System.out.println(border);
    }
}