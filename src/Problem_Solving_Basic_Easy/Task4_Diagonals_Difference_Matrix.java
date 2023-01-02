package Problem_Solving_Basic_Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Task4_Diagonals_Difference_Matrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfMatrix = Integer.parseInt(scanner.nextLine().trim());

        List<List<Integer>> matrix = new ArrayList<>();

        IntStream.range(0, numberOfMatrix).forEach(i -> {
            matrix.add(
                    Stream.of(scanner.nextLine()
                                    .replaceAll("\\s+$", "")
                                    .split(" "))
                            .map(Integer::parseInt)
                            .collect(toList())
            );
        });

        int result = Result.diagonalDifference(matrix);

        System.out.println(result);
    }
}

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     *
     */

    //3
    //11 2 4
    //4 5 6
    //10 8 -12

    public static int diagonalDifference(List<List<Integer>> matrix) {
        int n = matrix.size();

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumRight += matrix.get(i).get(j);
                }
                if (i + j == n - 1) {
                    sumLeft += matrix.get(i).get(j);
                }
            }
        }
        return Math.abs(sumLeft - sumRight);

    }

}
