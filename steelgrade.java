import java.util.Scanner;

public class steelgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hardness: ");
        double hardness = scanner.nextDouble();

        System.out.print("Enter carbon content: ");
        double carbonContent = scanner.nextDouble();

        System.out.print("Enter tensile strength: ");
        double tensileStrength = scanner.nextDouble();

        boolean condition1 = hardness > 50;
        boolean condition2 = carbonContent < 0.7;
        boolean condition3 = tensileStrength > 5600;

        int grade;

        if (condition1 && condition2 && condition3) {
            grade = 10;
        } else if (condition1 && condition2) {
            grade = 9;
        } else if (condition2 && condition3) {
            grade = 8;
        } else if (condition1 && condition3) {
            grade = 7;
        } else if (condition1 || condition2 || condition3) {
            grade = 6;
        } else {
            grade = 5;
        }

        System.out.println("The grade of the steel is: " + grade);

           }
}
