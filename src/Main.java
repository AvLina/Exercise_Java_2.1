public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int sum = 1500;
        int bonus = sum / 100;
        if (sum < 1000) {
            bonus = 0;
        }
        int total = (balance + sum + bonus);
        System.out.println(total);

    }
}
