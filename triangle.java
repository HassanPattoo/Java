import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        boolean isValid = (side1 + side2 > side3) && 
                          (side2 + side3 > side1) && 
                          (side1 + side3 > side2);

        if (isValid) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }

           }
}
