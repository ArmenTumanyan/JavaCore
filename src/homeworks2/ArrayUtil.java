package homeworks2;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] myArray = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        System.out.println();
        {


            int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) max = array[i];
            }
            System.out.println(max);
        }
        System.out.println();

        {


            int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) min = array[i];
            }
            System.out.println(min);

        }
    }
    }