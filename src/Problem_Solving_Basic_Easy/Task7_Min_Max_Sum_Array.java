package Problem_Solving_Basic_Easy;

import java.util.*;
import java.util.stream.Stream;


public class Task7_Min_Max_Sum_Array {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> array = Stream.of(scanner.nextLine()
                        .replaceAll("\\s+$", "")
                        .split(" "))
                .map(Integer::parseInt)
                .toList();

        miniMaxSum(array);

    }

    public static void miniMaxSum(List<Integer> array) {

        int sum = array.stream().mapToInt(Integer::valueOf).sum();

        int max = array.stream().max(Comparator.naturalOrder()).get();

        int min = array.stream().min(Comparator.naturalOrder()).get();

        System.out.printf("%d %d", sum - max, sum - min);

    }

}


