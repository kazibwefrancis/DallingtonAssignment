import java.util.Scanner;

public class Factorial {

        public static void main(String[] args) {
            System.out.println("Enter the value of non zero integer");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            Long Factorial= 1L;

            for (int i = 1; i <= num; i++) {
                Factorial *= i;

            }
                System.out.println("factorial! = " + Factorial);

            }
        }





