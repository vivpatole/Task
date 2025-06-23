package Task24;

import java.util.Scanner;

public class Task1 {

    public void Calculater() {
        Scanner sc = new Scanner(System.in);
        int ClickChoice;

        System.out.println("👍😊---------Welcome to My Calculator----------🙌😊");

        do {
            System.out.println("\nEnter the first number:");
            double first = sc.nextDouble();

            System.out.println("Enter the second number:");
            double second = sc.nextDouble();

            System.out.println("\n-------------Choose the operation You want:----------------");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.print("Enter your choice (1-4): ");
            int yourChoice = sc.nextInt();

            System.out.println("\n--------------Your Result-------------------");

            switch (yourChoice) {
                case 1:
                    double addition = first + second;
                    System.out.printf("Addition: %.2f + %.2f = %.2f\n", first, second, addition);
                    break;

                case 2:
                    double subtraction = first - second;
                    System.out.printf("Subtraction: %.2f - %.2f = %.2f\n", first, second, subtraction);
                    break;

                case 3:
                    double multiplication = first * second;
                    System.out.printf("Multiplication: %.2f * %.2f = %.2f\n", first, second, multiplication);
                    break;

                case 4:
                    if (second == 0) {
                        System.out.println("Oops! Cannot divide by zero.");
                    } else {
                        double division = first / second;
                        System.out.printf("Division: %.2f / %.2f = %.2f\n", first, second, division);
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 to 4 ");
            }

            System.out.println("\nDo you want calculation onther numbers ");
            System.out.println("Enter 1 to continue or 0 to exit:");
            ClickChoice = sc.nextInt();

        } while (ClickChoice == 1);

        System.out.println("\n🙏 Thank you for using the calculator ! Goodbye!");
        
    }

    public static void main(String[] args) {
        Task1 t = new Task1();
        t.Calculater();
    }
}
