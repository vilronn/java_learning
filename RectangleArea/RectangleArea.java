import java.util.Scanner;

public class RectangleArea {

    public static int getRectangleArea(int width, int height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("width: ");
        int width = scanner.nextInt();

        System.out.print("height: ");
        int height = scanner.nextInt();

        int area = getRectangleArea(width, height);
        System.out.println("area: " + area);
    }
}
