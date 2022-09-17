package homeWork28_2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 23, 6, 0, 12, 123, 6, 5, 1, 99, 3, 4, 1, 2);

        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum of numbers: " + sum);

        System.out.print("Average: ");
        list.stream().mapToInt(i -> i).average().ifPresent(System.out::println);

        Map<Integer,Integer> countByNumber = new HashMap<>();
        for(Integer n: list) countByNumber.merge(n, 1, Integer::sum);
        System.out.println(countByNumber);


//        Set<Integer> duplicatedNumbersRemovedSet = new HashSet<>();
//        Set<Integer> duplicatedNumbersSet = list.stream().filter(n -> !duplicatedNumbersRemovedSet.add(n)).collect(Collectors.toSet());
//        System.out.println(duplicatedNumbersSet);
    }
}
