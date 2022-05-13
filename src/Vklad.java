import java.util.Scanner;

public class Vklad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада:");
        int summa = sc.nextInt();
        System.out.println("Введите процент вклада:");
        int procent = sc.nextInt();
        for (int i = 1; i <= 5; i++) {
            summa = summa + (summa / 100 * procent);
            System.out.println(summa);

        }

    }
}
