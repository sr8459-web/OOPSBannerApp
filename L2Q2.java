import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of 3 subjects: ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();

        double percentage = (m1 + m2 + m3) / 3;

        System.out.println("Percentage = " + percentage);

        sc.close();
    }
}