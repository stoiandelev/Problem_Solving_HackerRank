package Problem_Solving_Basic_Easy;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;


public class Task5_Fraction_plus_minus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthOfArray = Integer.parseInt(scanner.nextLine().trim());

        List<Integer> array = Stream.of(scanner.nextLine()
                        .replaceAll("\\s+$", "")
                        .split(" "))
                .map(Integer::parseInt)
                .toList();

        Result.plusMinus(array);

    }

}

class Result {

    /*
     * Complete the 'plusMinus' function below.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> array) {

        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;

        for (Integer integer : array) {
            if (integer > 0) {
                positiveCount++;
            } else if (integer < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        double positiveResult = positiveCount/array.size();
        double negativeResult = negativeCount/array.size();
        double zeroResult = zeroCount/array.size();

        System.out.printf("%f\n", positiveResult);
        System.out.printf("%f\n", negativeResult);
        System.out.printf("%f\n", zeroResult);
    }

}

//   public static void plusMinus(List<Integer> arr) {
//        System.out.printf("%.6f\n%.6f\n%.6f",
//                ((double) arr.stream().filter(e -> e > 0)
//                        .count()) / arr.size(),
//                ((double) arr.stream().filter(e -> e < 0)
//                        .count()) / arr.size(),
//                ((double) arr.stream().filter(e -> e == 0)
//                        .count()) / arr.size());
//    }


//6
//-4 3 -9 0 4 1