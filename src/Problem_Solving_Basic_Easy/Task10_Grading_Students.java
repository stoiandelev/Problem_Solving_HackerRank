package Problem_Solving_Basic_Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

//Sam is a professor at the university and likes to round each student's grade
// according to these rules:
//
//If the difference between the grade and the next multiple of 5 is less than 3,
// round grade up to the next multiple of 5.
//If the value of grade is less than 38, no rounding occurs as the result
// will still be a failing grade.

//Any grade less than 40 is a failing grade.

public class Task10_Grading_Students {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGrades = Integer.parseInt(scanner.nextLine());

        List<Integer> grades = IntStream.range(0, numberOfGrades).mapToObj(g -> {
                    return scanner.nextLine().replaceAll("\s+$", "");
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .toList();

        List<Integer> result = gradingStudents(grades);
        System.out.println(result);
    }

    private static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> roundedGrades = new ArrayList<>();

        for (Integer grade : grades) {
            if (grade >= 38 && (((((grade / 5) + 1) * 5) - grade) < 3)) {

                roundedGrades.add((((grade / 5) + 1) * 5));

            } else {
                roundedGrades.add(grade);
            }
        }

        return roundedGrades;

    }
}

//4
//73
//67
//38
//33
