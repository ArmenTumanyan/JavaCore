package chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / 0;
            System.out.println("Это не будет выведино.");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль.");
        }
        System.out.println("После оператора catch.");
    }
}
