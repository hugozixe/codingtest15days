package practice.codingtest15days.programmers;

import java.util.Arrays;

// 제일 작은 수 제거하기 - Level 1
public class CodingTest_2days {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        int min = Arrays.stream(arr).min().getAsInt();

        return Arrays.stream(arr)
                .filter(i -> i != min)
                .toArray();
    }

}
