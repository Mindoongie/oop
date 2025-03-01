import java.util.Arrays;

public class Stats5 {
    public static void main(String[] args) {
        double[] a = new double[5];

        double avg = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random();
            avg += a[i];
        }
        avg /= a.length;
        Arrays.sort(a);

        System.out.println(a[4] + " " + a[0] + " " + avg);
    }
}
