package excercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner inputOne = new Scanner(System.in);
        System.out.println("Please enter length:");
        length = inputOne.nextDouble();

        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Please enter width:");
        width = inputTwo.nextDouble();

        area = length*width;
        System.out.println("The rectangle's area is " + area);


}
}
