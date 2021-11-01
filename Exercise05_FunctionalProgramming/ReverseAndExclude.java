package Exercise05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int divider = Integer.parseInt(sc.nextLine());
        Collections.reverse(numbers);
        Predicate<Integer> predicate = n -> n % divider !=0;

        numbers.stream().filter(predicate).forEach(e-> System.out.print(e +" "));

    }
}
