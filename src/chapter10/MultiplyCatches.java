package chapter10;

public class MultiplyCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексаций за пределами " + "массива: " + e);
        }
        System.out.println("После блока операторов try/catch.");
    }
}
