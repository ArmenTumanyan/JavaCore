package homeworks;

public class homeworks2 {
    public static class FigurePainter1 {

        public static void main(String[] args) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("   ");
                }

                for (int j = 4; j > i; j--) {
                    {
                        System.out.print(" " + "* ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static class FigurePainter2 {

        public static void main(String[] args) {

            for (int i = 0; i < 4; i++) {
                for (int j = 3; j > i; j--) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("  " + " *");
                }
                System.out.println();
            }
            for (int i = 3; i > 0; i--) {
                for (int j = i; j <= 3; j++) {
                    System.out.print(" " + " ");
                }
                for (int j = i; j > 0; j--) {
                    System.out.print("  " + " *");
                }
                System.out.println();

                {

                }
            }


        }
    }

    public static class ArrayUtil {

        public static void main(String[] args) {
            int[] myArray = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

            for (int i = 0; i < myArray.length; i++) {
                System.out.println(myArray[i]);
            }


            {

            }
        }
    }

    public static class ArrayUtil1 {

        public static void main(String[] args) {
            int[] array = {2,5,8,10,32,22,11,66,12,30};

            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if(array[i] > max) max = array[i];
            }
            System.out.println(max);

        }
    }

    public static class ArrayUtil2 {

        public static void main(String[] args) {
            int[] array = {2,5,8,10,32,22,11,66,12,30};
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if(array[i] < min) min = array[i];

            }
            System.out.println(min);
        }
    }
}
