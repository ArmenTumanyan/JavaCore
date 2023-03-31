package homeworks.homeworks9;

import chapter3.Array;

import java.util.*;

public class CollectionExample2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Testing nameSort() method");
        Set<String> sortedNames = nameSort();
        if (sortedNames == null) {
            System.out.println("Wrong Count of names");
        } else System.out.println(sortedNames);

        System.out.println("Testing getUniqueNames()");
        Set<String> uniqueNames = getUniqueNames();
        if (uniqueNames == null) {
            System.out.println("Wrong Count of name");
        } else System.out.println(uniqueNames);
    }

    private static Set<String> nameSort() {
        System.out.println("Please input 10 names");
        String str = SCANNER.nextLine();
        String[] strArray = str.split(",");
        if (strArray.length != 10) {
            return null;
        }
        Set<String> sortedName = new TreeSet<>((SortedSet) Array.asList(strArray));
        return sortedName;
    }

    private static Set<String> getUniqueNames() {
        System.out.println("Please input 10 names");
        String str = SCANNER.nextLine();
        String[] strArray = str.split(",");
        if (strArray.length != 5) {
            return null;
        }
        Set<String> names = new HashSet<>((Collection) Array.asList(strArray));
        return names;
    }
}
