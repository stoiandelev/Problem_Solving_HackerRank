package Problem_Solving_Basic_Easy;

import java.util.Scanner;

public class Task6_Build_StarCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sizeOfStairCase = Integer.parseInt(scanner.nextLine());


        //s is for string s, % is for white spaces
        for (int i = 1; i <= sizeOfStairCase; i++) {
            System.out.printf("%" + sizeOfStairCase + "s\n", "#".repeat(i));

        }
    }

}

