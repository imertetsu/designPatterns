package org.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class GreetingsService {
    public static void main(String[] args) {
        Greetings greetings = (message) -> System.out.println("hello "+message);
        greetings.sendMessage("world");
        //Inmutability
        List<Integer> ages = Arrays.asList(20, 10, 15, 21, 22, 18, 35, 6, 9, 12);

        // Attempting to modify the list will throw an UnsupportedOperationException
        try {
            ages.add(4);
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify an immutable list");
        }
        //Pure Function
        Predicate<Integer> is18Older = age -> age > 18;
        List<Integer> older18 = ageFilter(ages, is18Older);
        System.out.println(older18);
    }
    //HIGH ORDER FUNCTION
    public static List<Integer> ageFilter(List<Integer> age, Predicate<Integer> is18Older){
        return age.stream().filter(is18Older).toList();
    }
}
