package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        list.add(new Person("Zofia", "Kąskiew", 26));
        list.add(new Person("Krzysztof", "Kąskiekiewicz", 28));
        list.add(new Person("Krzysztof", "Kąskiekiewicz", 30));
        list.add(new Person("Krzysztof", "Kąskiekiewicz", 40));
        list.add(new Person("Bożena", "Kskiewicz", 23));
        list.add(new Person("Bożena", "Wskiewicz", 23));
        list.add(new Person("Adam", "Kąskicz", 25));
        list.add(new Person("Wiesław", "Kąs", 20));
        list.add(new Person("Monika", "Kąskiewiczy", 29));
        list.add(new Person("Filip", "Kąskiewiwicz", 27));

        System.out.println(list);

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return -1 * new Person(o1.compareTo(o2);
//            }
//        });

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new PersonComparator());
    }
}
