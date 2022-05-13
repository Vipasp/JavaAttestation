import java.util.Scanner;

public class Proverka10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 10:");
        int chislo = sc.nextInt();
        if (chislo == 10) {
            System.out.println("Верно");
        }
        else
        {
            System.out.println("Неверно");
        }
    }
}
