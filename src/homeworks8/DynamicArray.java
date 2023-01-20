package homeworks8;

import java.lang.reflect.Array;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int index, int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }
    public int getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            return -1;
        }
        return array[index];
    }
    public void deleteByIndex(int index) {
        for (int i = 0; i < size; i++) {
            if (i == index) {
            }
        }
    }
    public void set(int index, int value) {
        if (array[index] == index + 1) {
        }
        value = array[index];
    }
    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                return true;
            }
        }
        return false;
    }
    public int getIndexByValue(int value) {
        if (array[value] > 1) {
            return value;
        } else {
            return -1;
        }
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}