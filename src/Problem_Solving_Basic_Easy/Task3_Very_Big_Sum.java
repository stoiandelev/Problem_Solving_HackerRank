package Problem_Solving_Basic_Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3_Very_Big_Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arrayCount = Integer.parseInt(scanner.next().trim());

        List<Long> array = new ArrayList<>();
        for (int i = 0; i < arrayCount; i++) {
            long number = scanner.nextInt();
            array.add(number);
        }

        long result = Result.aVeryBigSum(array);
        System.out.println(result);

    }
}

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> array) {
        return array.stream().reduce(0L, Long::sum);
    }

}
