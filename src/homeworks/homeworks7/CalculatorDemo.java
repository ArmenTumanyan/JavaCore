package homeworks.homeworks7;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator col = new Calculator();

        col.plus(10, 3);
        System.out.println(col.plus(10, 3));

        col.minus(10, 5);
        System.out.println(col.minus(10, 3));

        col.divide(8, 4);
        System.out.println(col.divide(8, 4));

        col.multiply(5, 2);
        System.out.println(col.multiply(5, 2));
    }
}
