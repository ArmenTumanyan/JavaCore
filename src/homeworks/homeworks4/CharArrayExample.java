package homeworks.homeworks4;

public class CharArrayExample {

    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int Count = 0;
        for (int x : chars) {
            if (x == c) {
                Count++;
            }
        }
        System.out.println(Count);

        System.out.println();

        char[] chars2 = {'j','a','v','a','l','o','v','e'};
        for (int i = 0; i < chars2.length; i++) {

        }
       System.out.print(chars2[chars2.length % 5] + " , ");
        for (int i = 0; i < chars2.length; i++) {

        }
        System.out.print(chars2[chars2.length / 2]);

        System.out.println();


        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean isEnded = false;
        if (chars3[chars3.length-1] == 'y' && chars3[chars3.length-2] == 'l') {
            isEnded = true;
        }
        System.out.println(isEnded);

        System.out.println();


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char i = ' ';
        for (int x : text) {
            if (x != i) {

            }

        }
        System.out.print(text);

    }
}
