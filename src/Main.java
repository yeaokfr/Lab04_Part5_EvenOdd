import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int num = scan.nextInt();

        if(num % 2 == 0){
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is odd");
        }
    }
}