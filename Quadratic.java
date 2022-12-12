import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        double a = input.nextDouble();
        System.out.println("Enter the value for b: ");
        double b = input.nextDouble();
        System.out.println("Enter the value for c: ");
        double c = input.nextDouble();
        double d = b * b - 4.0 * a * c;
        if (d > 0.0) {
            System.out.println("The roots are real and distinct: ");
            double r1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("The roots are " + r1 + "and" + r2);
        } else if (d == 0.0) {
            System.out.println("The roots are real and equal: ");
            double r1 = -b / (2.0 * a);
            System.out.println("Roots are " + r1);
        } else {
            System.out.println("The roots are imag and complex");
            double r1 = -b / (2.0 * a);
            double r2 = (Math.sqrt(Math.abs(d))) / (2.0 * a);
            System.out.println("the roots are: " + r1 + "+i" + r2 + " and " + r1 + "-i" + r2);
        }
    }
}
