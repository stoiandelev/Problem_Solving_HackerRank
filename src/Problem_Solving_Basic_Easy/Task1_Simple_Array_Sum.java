package Problem_Solving_Basic_Easy;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;


public class Task1_Simple_Array_Sum {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int arrayCount = Integer.parseInt(scanner.next().trim());

        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arrayCount; i++) {
            int number = scanner.nextInt();
            array.add(number);
        }



        int result = Result1.simpleArraySum(array);
        System.out.println(result);
    }

}

class Result1 {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> array) {

        return array.stream().reduce(0, Integer::sum);

    }

}

