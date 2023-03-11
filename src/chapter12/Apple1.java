package chapter12;

public enum Apple1 {
    Jonathan, GoldenDel, RedDel, Winesap, CortLand
}

class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Константы перечислимого типа Apple:");
        Apple1 a11apples[] = Apple1.values();
        for (Apple1 a : a11apples) {
            System.out.println(a);
        }
        System.out.println();
        ap = Apple.valueOf("Winesap");
        System.out.println("Переменная ap содержит " + ap);
    }
}