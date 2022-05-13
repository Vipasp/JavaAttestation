//import java.util.Arrays;

public class Dublicate {
    public static void main(String[] args) {
        int[] numbers = { 5, 5, 23, 2, 1, 6, 3, 1, 8, 12, 12 };
        //Arrays.sort(numbers); //Есди хотим искать все дублирующиеся элементы

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] == numbers[i - 1]) {
                System.out.println("2 одинаковых числа подряд: " + numbers[i]);
            }
        }
    }
}
