package Problem_Solving_Basic_Easy;

import java.util.*;

public class Task2_Compare_The_Triplets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a = Arrays.stream(scanner.nextLine().split("\\s")).map(Integer::parseInt).toList();
        b = Arrays.stream(scanner.nextLine().split("\\s")).map(Integer::parseInt).toList();

        System.out.println(Result2.compareTriplets(a, b)
                .toString()
                .replace("[","")
                .replace("]", ""));

    }
}

class Result2 {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

//if a[i] > b[i], then Alice is awarded 1 point.
//If a[i] < b[i], then Bob is awarded 1 point.
//If a[i] = b[i], then neither person receives a point.



    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;
        List<Integer> finalScore = new ArrayList<>(2);

        for (int i = 0; i < 3; i++) {

            if (a.get(i) > b.get(i)) {
                aliceScore++;
            }

            if (b.get(i) > a.get(i)) {
                bobScore++;
            }
        }

        finalScore.add(aliceScore);
        finalScore.add(bobScore);

        return finalScore;

    }

}
