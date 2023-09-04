import java.util.Scanner;

public class Part1Syntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("It is even");
        } else {
            System.out.println("It is not even");
        }

        switch (number)
        {
            case 0 -> System.out.println("It is 0");
            case 1 -> System.out.println("It is 1");
            case 2 -> System.out.println("It is 2");
            case 3 -> System.out.println("It is 3");
            default -> System.out.println("It is neither 0, 1, 2, or 3");
        }

        System.out.println("Enter a string");
        in.nextLine();
        if (in.nextLine().equals("correctString")){
            System.out.println("equals");
            if (1 != 2 && 1 == 1){
                System.out.println("1 != 2 and 1 = 1");
            }
        }
    }
}
