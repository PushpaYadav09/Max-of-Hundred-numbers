import java.util.Scanner;

public class MaxofHunredNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        System.out.println("Enter 100 Numbers: ");
        for (int i = 0; i < 100; i++) {
            int number = sc.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The minimun number of 100 number is: " + max);
    }
}
