import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner scanner= new Scanner(System.in);
        double number= scanner.nextDouble();

        double squareroot= Math.sqrt(number);

        System.out.println("The squareroot is " +squareroot);

    }
}