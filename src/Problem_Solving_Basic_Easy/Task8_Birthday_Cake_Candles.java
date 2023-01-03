package Problem_Solving_Basic_Easy;

import java.util.*;

import java.util.stream.Stream;


public class Task8_Birthday_Cake_Candles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int candleCount = Integer.parseInt(scanner.nextLine().trim());

        List<Integer> candles = Stream.of(scanner.nextLine()
                        .replaceAll("\\s+$", "")
                        .split(" "))
                .map(Integer::parseInt)
                .toList();

        int result = birthdayCakeCandles(candles);
        System.out.println(result);
    }

    private static int birthdayCakeCandles(List<Integer> candles) {
        return Collections.frequency(candles,
                candles.stream()
                        .max(Comparator.naturalOrder())
                        .orElse(0));
    }
}

//        int biggestCandle = 0;
//        int countBiggestCandle = 0;
//
//        for (Integer currentCandle : candles) {
//            if (currentCandle > biggestCandle || currentCandle == biggestCandle) {
//                biggestCandle = currentCandle;
//                countBiggestCandle++;
//            }
//        }
//
//        return countBiggestCandle;
//    }