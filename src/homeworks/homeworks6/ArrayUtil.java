package homeworks.homeworks6;

public class ArrayUtil {


    void arrayElements(int[] array) {

        int[] myArray = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i != myArray.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }

        System.out.println();

    }

    void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);
        }


    void minOfArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);

        System.out.println();
    }

    void evenOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println();
    }

    void evenNumberCount(int[] array) {
        int evenNumberCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumberCount++;
            }
        }
        System.out.println(evenNumberCount);

        System.out.println();
    }

    void oddOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);

            }
        }
        System.out.println();

    }

    void oddNumberCount(int[] array) {
        int oddNumberCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {

                oddNumberCount++;
            }
        }
        System.out.println(oddNumberCount);

        System.out.println();
    }

    void totalOfArray(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println(total);

        System.out.println();
    }

    void arithmeticaverageOfArray(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println(sum / array.length);

        System.out.println();
    }


    void firstIndexOfArray(int[] array) {
        System.out.println(array[0]);
    }

    void lastIndexOfArray(int[] array) {
        int lastindex = array.length - 1;
        System.out.println(array[array.length - 1]);
    }

    void midIndexOfArray(int[] array) {
        System.out.println(array[array.length / 2]);
    }
}





























