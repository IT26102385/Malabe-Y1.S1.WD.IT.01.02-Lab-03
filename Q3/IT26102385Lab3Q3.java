import java.util.Scanner;

public class IT26102385Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Rupee amount: ");
        int amount = input.nextInt();
        
        int temp = amount;

        int n5000 = temp / 5000;
        temp = temp % 5000;

        int n1000 = temp / 1000;
        temp = temp % 1000;

        int n500 = temp / 500;
        temp = temp % 500;

        int n200 = temp / 200;
        temp = temp % 200;

        int n100 = temp / 100;
        temp = temp % 100;

        int n50 = temp / 50;
        temp = temp % 50;

        int n20 = temp / 20;
        temp = temp % 20;

        int n10 = temp / 10;
        temp = temp % 10;

        int n5 = temp / 5;
        temp = temp % 5;

        int n2 = temp / 2;
        temp = temp % 2;

        int n1 = temp;

        System.out.println("\n5000 Notes - " + n5000);
        System.out.println("1000 Notes - " + n1000);
        System.out.println("500 Notes - " + n500);
        System.out.println("200 Notes - " + n200);
        System.out.println("100 Notes - " + n100);
        System.out.println("50 Notes - " + n50);
        System.out.println("20 Notes - " + n20);
        System.out.println("10 Notes - " + n10);
        System.out.println("05 Notes - " + n5);
        System.out.println("02 Notes - " + n2);
        System.out.println("01 Notes - " + n1);
        
        input.close();
    }
}