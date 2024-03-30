import java.util.*;

public class ShapeCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Shape Area Calculator");

        while (true) {
            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-");
            System.out.println();
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Circle");
            System.out.println("4) Quit");
            System.out.println();

            System.out.print("Which shape: ");
            int shape = keyboard.nextInt();
            System.out.println();

            if (shape == 1) {
                System.out.print("Base: ");
                int base = keyboard.nextInt();
                System.out.print("Height: ");
                int height = keyboard.nextInt();
                area_triangle(base, height);
            } else if (shape == 2) {
                System.out.print("Length: ");
                int length = keyboard.nextInt();
                System.out.print("Width: ");
                int width = keyboard.nextInt();
                area_rectangle(length, width);
            } else if (shape == 3) {
                System.out.print("Radius: ");
                int radius = keyboard.nextInt();
                area_circle(radius);
            } else if (shape == 4) {
                quit();
                break;
            }
        }
    }

    public static double area_triangle(int base, int height) {
        double A = 0.5 * base * height;
        System.out.println("The area is " + A + ".");
        return A;
    }

    public static int area_rectangle(int length, int width) {
        int A = length * width;
        System.out.println("The area is " + A + ".");
        return A;
    }

    public static double area_circle(int radius) {
        double A = Math.PI * radius * radius;
        System.out.println("The area is " + A + ".");
        return A;
    }

    public static void quit() {
        System.out.println("Good Bye");
    }
}
