import java.util.Scanner;

public class Part2Conversation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = in.nextInt();
        System.out.print("Probably, your daily activity is ");
        if (age < 6) {
            System.out.print("sitting at home, walking and kindergarten");
        } else if (age <= 17) {
            System.out.print("school");
        } else if (age <= 22) {
            System.out.print("university");
        } else if (age <= 60) {
            System.out.print("work");
        } else {
            System.out.print("sitting at home because you are retired");
        }
    }
}
