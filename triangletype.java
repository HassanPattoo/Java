import java.util.Scanner;

public class triangletype {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangle:");
        System.out.print("Side 1: ");
        double a = scanner.nextDouble();
        System.out.print("Side 2: ");
        double b = scanner.nextDouble();
        System.out.print("Side 3: ");
        double c = scanner.nextDouble();

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

          }
}
