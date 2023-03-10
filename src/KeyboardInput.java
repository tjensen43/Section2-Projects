import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args) {
        double userNum;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a real number");
        userNum = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println(userNum * 2);

    }
}
