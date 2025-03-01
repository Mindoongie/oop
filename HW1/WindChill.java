import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        System.out.println(13.12 + 0.6215 * t - 11.37 * Math.pow(10, 0.16) + 0.3965 * t * Math.pow(10, 0.16));
    }
}