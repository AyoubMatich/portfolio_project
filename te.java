import java.util.Scanner;
public class message {
    public static void main(String[] args) {
        String messag = new String();
        System.out.println("Please enter your name : ");
        scanner keyboard = new Scanner(System.in);
        messag = keyboard.nextLine();
        System.out.println("Hello " + messag);
        keyboard.close();
    }
}