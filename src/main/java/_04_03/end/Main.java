package _04_03.end;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        // Is the same as numbers.forEach((number) -> NumberUtils.evenOrOdd(number));
        numbers.forEach(NumberUtils::evenOrOdd);
    }

}
