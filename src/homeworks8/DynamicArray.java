package homeworks8;

import java.lang.reflect.Array;

public class DynamicArray {
    private void extend() {
        int[] newDynamicArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newDynamicArray[i] = array[size];
        }
        array = newDynamicArray;
    }

    int[] array = new int[10];
    int size = 0;

    void add(int item) {
        if (size == array.length - 1) {
            extend();
        }
        array[size] = item;
        size++;
    }

    int get(int index) {
        return array[index];
    }
    void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}