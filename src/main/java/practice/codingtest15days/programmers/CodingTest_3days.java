package practice.codingtest15days.programmers;

import java.util.Scanner;
// 직사각형 별찍기 - Level 1
class CodingTest_3days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 직사각형 출력
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
