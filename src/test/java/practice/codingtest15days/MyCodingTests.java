package practice.codingtest15days;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class MyCodingTests {
    // 조건에 맞게 수열 변환하기 1 - Level 0
    @Test
    void CodingTest_1day() {
        int arr[] = {1,2,3,100,99,98};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                arr[i] = arr[i] * 2;
            }
        }

        int[] answer = arr;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(answer[i]);
        }
    }

    // 제일 작은 수 제거하기 - Level 1
    @Test
    void CodingTest_2days() {

    }

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

    // 핸드폰 번호 가리기 - Level 1
    @Test
    void CodingTest_4days() {

    }


}
