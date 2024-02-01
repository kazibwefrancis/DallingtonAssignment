import java.util.Scanner;

public class Even {
    public static void main(String[] args) {

        System.out.println("Enter the number 😁");
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();

       int remainder= number%2;

       if(remainder==0) {
           System.out.println(number + " is an even number");
       }else {
               System.out.println(number + " is an odd number");
           }
       }


    }
