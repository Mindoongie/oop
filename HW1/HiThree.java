import java.util.Scanner;

public class HiThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String b = input.nextLine();
        String c = input.nextLine();

        System.out.println("Hi " + c + ", " + b + ", and " + a + ".");
    }
}
