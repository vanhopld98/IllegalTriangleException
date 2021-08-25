import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            checkInput();
        } catch (IllegalTriangleException e) {
            System.err.println("ABC không là 3 cạnh của 1 tam giác");
        }
    }

    public static void checkInput() throws IllegalTriangleException{
        System.out.println("Nhập cạnh A:");
        double a = scanner.nextDouble();
        System.out.println("Nhập cạnh B:");
        double b = scanner.nextDouble();
        System.out.println("Nhập cạnh C:");
        double c = scanner.nextDouble();

        if (a < 0 || b < 0 || c < 0 || (a + b) < c || (a + c) < b || (b + c) < a) {
            throw new IllegalTriangleException();
        }
    }
}