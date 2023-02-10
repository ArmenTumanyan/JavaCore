package homeworks.homeworks6;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};

        ArrayUtil au = new ArrayUtil();
        au.arrayElements(array);

        System.out.println();
        au.maxOfArray(array);

        System.out.println();
        au.minOfArray(array);

        System.out.println();
        au.evenOfArray(array);

        System.out.println();
        au.evenNumberCount(array);

        System.out.println();
        au.oddOfArray(array);

        System.out.println();
        au.oddNumberCount(array);

        System.out.println();
        au.totalOfArray(array);

        System.out.println();
        au.arithmeticaverageOfArray(array);

        System.out.println();
        au.firstIndexOfArray(array);

        System.out.println();
        au.lastIndexOfArray(array);

        System.out.println();
        au.midIndexOfArray(array);
    }
}