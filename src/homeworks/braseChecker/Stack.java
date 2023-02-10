package homeworks.braseChecker;

public class Stack {
    private int array[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Стек заполнен. ");
        } else {
            array[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек не заполнен.");
            return 0;
        } else {
            return array[tos--];
        }

    }

    public boolean isEmpty() {
        return tos == -1;
    }
}
