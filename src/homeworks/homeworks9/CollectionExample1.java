package homeworks.homeworks9;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CollectionExample1 {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static final List<String> NAMES = new ArrayList<>();

    public static void main(String[] args) {
        NAMES.add("Petros");
        NAMES.add("Poxos");
        NAMES.add("Martiros");
        NAMES.add("Vardan");
        NAMES.add("Armen");
        System.out.println(NAMES);
        System.out.println("Testing add to list");
        addToList(NAMES);
        System.out.println(NAMES);
        System.out.println("Testing delete by name");
        deleteByNames(NAMES);
        System.out.println(NAMES);
        System.out.println("Testing add name by index");
        addNameByIndex(NAMES);
        System.out.println(NAMES);
    }

    private static void deleteByNames(List<? extends String> names) {
        System.out.println("Please input name");
        String name = SCANNER.nextLine();
        names.remove(name);
    }

    private static void addToList(List<String> names) {
        System.out.println("Please input name");
        String s = SCANNER.nextLine();
        if (names.contains(s)) {
            System.out.println("The name already exists");
            return;
        }
        names.add(s);
        System.out.println("Name Was added");
    }

    private static void addNameByIndex(List<String> names) {
        try {
            System.out.println("Please input name");
            String name = SCANNER.nextLine();
            System.out.println("Please input index");
            int index = Integer.parseInt(SCANNER.nextLine());
            names.add(index, name);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Wrong index");
        }
    }
}
