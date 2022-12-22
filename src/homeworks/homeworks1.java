package homeworks;

public class homeworks1 {
    public static class IfForExample {

        public static void main(String[] args) {
            int x = 20;
            int y = 50;
            if (x < y) ;
            {
                System.out.println(y);
            }


            int i = 5;
            int j = 10;

            for (i = 5; i <= j; i++) {
                System.out.print(i);
            }
        }

    }

    public static class IfForExample1 {

        public static void main(String[] args) {
            char ch1, ch2;
            int a = 10, b = 50;
            ch1 = 'a';
            ch2 = 'b';
            System.out.println("ch1 содержит " + a);
            System.out.println("ch2 содержит " + b);

        }
    }

    public static class IfForExample2 {

        public static void main(String[] args) {
            int a = 10, b = 20;
            if (a <= b);
            System.out.println("a  равно b");
            if (a != b);
            System.out.println("a не равно b");


        }
    }

    public static class FigurePainter {

        public static void main(String[] args) {

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();

                }

            }

        public static class FigurePainter1 {

            public static void main(String[] args) {

                for (int i = 0; i < 5; i++) {
                    for (int j = 5; j > i; j--)

                        System.out.print(" " + "* ");
                        for (int k = 0; k < i; k++) {

                        }
                        System.out.println();
                    }

                }
            }

        public static class FigurePainter2 {

            public static void main(String[] args) {

                for (int i = 1; i <= 5; i++) {

                    for (int j = 5; j >= i; j--) {
                        System.out.print(" " + " ");
                    }

                    for (int k = 0; k < i; k++) {
                        System.out.print("* ");
                    }

                    System.out.println();
                }

            }
        }
    }
}
