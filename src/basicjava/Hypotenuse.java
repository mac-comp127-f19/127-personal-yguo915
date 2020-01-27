package basicjava;
import java.util.Scanner;

public class Hypotenuse {

    public static double calculateHypotenuse(double length1, double length2) {
        return Math.sqrt(Math.pow(length1, 2) + Math.pow(length2, 2));
    }

    public static void main(String [] args) {
        System.out.println("Enter the length of side1:");
        Scanner input1 = new Scanner(System. in);
        double length1 = input1.nextDouble();
        System.out.println("Enter the length of side2:");
        Scanner input2 = new Scanner(System. in);
        double length2 = input2.nextDouble();
        System.out.println("The length of the Hypotenuse is " + calculateHypotenuse(length1, length2));
    }

}
