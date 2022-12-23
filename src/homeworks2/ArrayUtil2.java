package homeworks2;

public  class ArrayUtil2 {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];

        }
        System.out.println(min);
    }
}
