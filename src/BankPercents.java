public class BankPercents {


    static long multiplier = 100; //считаем  в копейках для точности

    // 10%
    static long divider = 10;//100:10=10

    public static void main(String[] args) {

        long deposit = 100 * multiplier; // 10000.00

        for (int year = 1; year <= 5; year++) {
            deposit += deposit/divider;
            log(year, deposit);
        }
    }

    public static void log(int year, long deposit) {
        long amount = deposit/multiplier; //+ (deposit % multiplier);
        System.out.println("За " + year + " год, на вашем счету появилась " + amount + " копеек");
    }
}
