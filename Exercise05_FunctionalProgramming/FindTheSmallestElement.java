package Exercise05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

//        Integer smallestElement = Collections.min(numbers);
//        System.out.println(numbers.lastIndexOf(smallestElement));

        Function<List<Integer>, Integer> getIndOfMinElement =
                list -> list.lastIndexOf(list.stream().min(Integer::compare).get());

        System.out.println(getIndOfMinElement.apply(numbers));


    }
}
