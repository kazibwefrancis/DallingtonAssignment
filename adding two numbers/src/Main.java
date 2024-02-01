import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Enter the value of num1");
        Scanner scanner= new Scanner(System.in);
        int num1=scanner.nextInt();

        System.out.println("Enter the value of num2");
        Scanner scanner2= new Scanner(System.in);
        int num2=scanner.nextInt();

        int Sum = num1 + num2;
        System.out.println(Sum +" This is the sum of the two numbers ");
    }
}