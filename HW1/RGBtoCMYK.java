import java.util.Scanner;

public class RGBtoCMYK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double red = sc.nextShort();
        double green = sc.nextShort();
        double blue = sc.nextShort();

        double white = Math.max(red / 255, Math.max(green / 255, blue / 255));
        double cyan = (white - red / 255) / white;
        double magenta = (white - green / 255) / white;
        double yellow = (white - blue / 255) / white;
        double black = 1 - white;

        System.out.println(cyan + "," + magenta + "," + yellow + "," + black);
    }
}
