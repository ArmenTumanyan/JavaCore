package homeworks2;

import jdk.swing.interop.SwingInterOpUtils;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] myArray = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
       if(i != myArray.length-1){
           System.out.print(", ");
            }else  {
                System.out.print(".");}
       }

        System.out.println();


        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max)
                max = myArray[i];
        }
        System.out.println(max);

        System.out.println();


        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min)
                min = myArray[i];
        }
        System.out.println(min);

        System.out.println();


        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                System.out.println(myArray[i]);
            }
        }

        System.out.println();


        int evenNumberCount = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenNumberCount++;
            }
        }
        System.out.println(evenNumberCount);

        System.out.println();


        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 1){
                System.out.println(myArray[i]);

            }
        }
        System.out.println();


        int oddNumberCount = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 1) {

                oddNumberCount++;
            }
        }
        System.out.println(oddNumberCount);

        System.out.println();


        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];

        }
        System.out.println(sum / myArray.length);

        System.out.println();


        int total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        System.out.println(total);

        System.out.println();


        System.out.println(myArray[0]);

        System.out.println();
        int lastindex = myArray.length - 1;
        System.out.println(myArray[myArray.length - 1]);

        System.out.println();


        System.out.println(myArray[myArray.length / 2]);
    }
}






