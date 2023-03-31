package chapter8;

public class SimpleInheritance {

    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb: ");
        superOb.showij();
        System.out.println();

        superOb.i = 7;
        superOb.j = 8;
        System.out.println("Содержимое объекта subOb: ");
        subOb.showij();

        System.out.println();
        System.out.println("Сумма i,j и в объекте subOb:");
        subOb.sum();
    }

}
