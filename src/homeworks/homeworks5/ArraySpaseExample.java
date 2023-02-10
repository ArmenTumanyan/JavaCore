package homeworks.homeworks5;

public class ArraySpaseExample {


    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                firstIndex = i;
                break;
            }

        }
        for (int j = spaceArray.length - 1; j > 0; j--) {
            if (spaceArray[j] != ' ') {
                lastIndex = j;
                break;
            }

        }
        char[] newspaseArray = new char[lastIndex - firstIndex + 1];

        for (int i = 0; i < newspaseArray.length; i++) {
            newspaseArray[i] = spaceArray[firstIndex++];
            System.out.print(newspaseArray[i]);
        }


    }
}