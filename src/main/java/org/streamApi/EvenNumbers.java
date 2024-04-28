package org.streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumbers {
    public static void main(String[] args){
        //Find even numbers
        List<Integer> list = Arrays.asList(2, 5, 10, 4, 3, 11, 8, 9, 22, 24, 27);
        list.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

        //Find number that Start with 1
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList = myList.stream()
                .map(number -> number + "")
                .filter(number -> number.startsWith("1"))
                .map(Integer::parseInt)
                .toList();
        myList.forEach(System.out::println);

        //Find duplicate numbers
        List<Integer> myList1 = Arrays.asList(10,35,8,49,25,98,98,32,35);
        Set<Integer> set = new HashSet<>();
        myList1.stream()
                .filter(n -> set.add(n))
                .forEach(System.out::println);

        //List the first element
        myList1.stream()
                .findFirst()
                .ifPresent(System.out::println);

        //Find the total numbers of elements present in the list
        long count = myList1.stream()
                .count();
        System.out.println("Lista length: " + count);

        //Find the max number in the List
        int max = myList1.stream()
                .max(Integer::compare)
                .get();
        System.out.println("Max number: "+ max);

        //Find duplicate in array
        int[] nums = {1,2,3,1};
        System.out.println("Este array contiene duplicados? "+ containsDuplicate(nums));

        //Concat lists
        List<String> list1 = Arrays.asList("I", "Love", "Java");
        List<String> list2 = Arrays.asList("Hello", "World");
        Stream<String> listConcat = Stream.concat(list1.stream(), list2.stream());
        listConcat.forEach(System.out::println);

        //Convert string in upper case
        List<String> stringList = list1.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(stringList);

        //flattend list
        List<List<Integer>> numList = Arrays.asList(
                Arrays.asList(2, 3, 4),
                Arrays.asList(5, 6, 7),
                Arrays.asList(8, 9, 0)
        );
        List<Integer> flattendList = numList.stream()
                .flatMap(l -> l.stream())
                .toList();
        System.out.println(flattendList);

        String cad = new String("Hello");
        String cad1 = new String("Hello");
        String cad2 = cad;
        int a = 4;
        int b = 4;

        System.out.println("Variables iguales? "+ cad==cad2);
    }

    public static boolean containsDuplicate(int[] nums){
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .toList();
        Set<Integer> set = new HashSet<>(list);
        return set.size() != list.size();
    }
}
