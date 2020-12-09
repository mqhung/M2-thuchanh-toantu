import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is :"+area);
        float peri = 2*(width + height);
        System.out.println("Perimeter is :"+peri);
    }
}